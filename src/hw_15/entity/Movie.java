package hw_15.entity;

import java.util.List;

public class Movie {
    private String title;
    private Integer year;
    private String country;
    private List<String> genres;
    private String quality;
    private String translation;
    private String duration;
    private String premiere;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public List<String> getGenres() {
        return genres;
    }

    public void setGenres(List<String> genres) {
        this.genres = genres;
    }

    public String getQuality() {
        return quality;
    }

    public void setQuality(String quality) {
        this.quality = quality;
    }

    public String getTranslation() {
        return translation;
    }

    public void setTranslation(String translation) {
        this.translation = translation;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getPremiere() {
        return premiere;
    }

    public void setPremiere(String premiere) {
        this.premiere = premiere;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", year=" + year +
                ", country='" + country + '\'' +
                ", genres=" + genres +
                ", quality='" + quality + '\'' +
                ", translation='" + translation + '\'' +
                ", duration='" + duration + '\'' +
                ", premiere='" + premiere + '\'' +
                '}';
    }
}

