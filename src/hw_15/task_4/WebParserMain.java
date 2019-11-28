package hw_15.task_4;

import hw_15.entity.Movie;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class WebParserMain {
    private static String URL = "https://kinogo.by/";

    public static void main(String[] args) throws IOException {
        // Document doc = Jsoup.connect(URL).get();
        Element content = getContentFromURL(URL);

        List<Movie> movies = new LinkedList<>(getMoviesFromContent(content));

        List<String> pageURLs = getURLS(content);

        //тут пока Received fatal alert: handshake_failure
       /* for (String pageURL : pageURLs) {
            content = getContentFromURL(pageURL);
            movies.addAll(getMoviesFromContent(content));
        }*/

        movies.forEach(System.out::println);
    }

    private static List<String> getURLS(Element content) {
        Elements navigationElement = content.select("div.bot-navigation");
        Elements pages = navigationElement.select("a[href]");

        return pages.stream().limit(5).map(page -> page.attr("href")).collect(Collectors.toList());
    }

    private static Element getContentFromURL(String pageURL) throws IOException {
        Document doc = Jsoup.connect(pageURL).get();
        return doc.getElementById("dle-content");
    }

    private static List<Movie> getMoviesFromContent(Element content) {
        ArrayList<Movie> movies = new ArrayList<>();
        Elements movieElements = content.select("div[data-id]");
        movieElements.forEach(movieElement -> movies.add(createMovieFromElement(movieElement)));

        return movies;
    }

    private static Movie createMovieFromElement(Element movieElement) {
        Movie movie = new Movie();

        String title = movieElement.select("h2.zagolovki").text();
        if (!title.equals("")) {
            movie.setTitle(title);
        }

        String year = movieElement.select("b:contains(Год выпуска:)").first().nextElementSibling().text();
        if (!year.equals("")) {
            movie.setYear(Integer.parseInt(year));
        }

        String country = getTextSibling(movieElement.select("b:contains(Страна:)"));
        if (!country.equals("")) {
            movie.setCountry(country);
        }

        String quality = getTextSibling(movieElement.select("b:contains(Качество:)"));
        if (!title.equals("")) {
            movie.setQuality(quality);
        }

        String translation = getTextSibling(movieElement.select("b:contains(Перевод:)"));
        if (!translation.equals("")) {
            movie.setTranslation(translation);
        }

        String duration = getTextSibling(movieElement.select("b:contains(Продолжительность:)"));
        if (!duration.equals("")) {
            movie.setDuration(duration);
        }

        String premiere = getTextSibling(movieElement.select("b:contains(Премьера:)"));
        if (!premiere.equals("")) {
            movie.setPremiere(premiere);
        }

        List<String> genres = new ArrayList<>();
        Element genreTitle = movieElement.select("b:contains(Жанр:)").first();
        Element nextElem = genreTitle.nextElementSibling();
        while (!nextElem.text().equals("")) {
            genres.add(nextElem.text());
            nextElem = nextElem.nextElementSibling();
        }

        if (genres.size() > 0) {
            movie.setGenres(genres);
        }

        return movie;
    }

    private static String getTextSibling(Elements element) {
        return element.first().nextSibling().toString().trim();
    }
}
