package hw_15.task_4;

import hw_15.entity.Movie;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class WebParserMain {

    public static void main(String[] args) throws IOException {
        String URL = "http://kinogo.club/page/";
        int numberPfPages = 5;

        List<Movie> movies = new LinkedList<>();

        for (int i = 1; i <= numberPfPages; i++) {
            String pageURL = URL + i;
            Element content = getContentFromURL(pageURL);
            movies.addAll(getMoviesFromContent(content));
        }

        movies.forEach(System.out::println);
    }

    private static Element getContentFromURL(String pageURL) throws IOException {
        Document doc = Jsoup.connect(pageURL).get();
        return doc.getElementById("dle-content");
    }

    private static List<Movie> getMoviesFromContent(Element content) {
        ArrayList<Movie> movies = new ArrayList<>();
        Elements movieElements = content.select("div.shortstory");
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

        String country = movieElement.select("b:contains(Страна:)").first().nextElementSibling().text();
        if (country.equals("")){
            country = getTextSibling(movieElement.select("b:contains(Страна:)"));
        }
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

        String premiere = getTextSibling(movieElement.select("b:contains(Премьера (РФ):)"));
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
        if (element.isEmpty()) {
            return "";
        } else {
            return element.first().nextSibling().toString().trim();
        }
    }
}
