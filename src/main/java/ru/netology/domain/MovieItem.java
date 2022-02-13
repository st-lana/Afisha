package ru.netology.domain;

public class MovieItem {
    private int id;
    private int movieId;
    private String movieName;
    private String genre;

    public MovieItem() {
    }

    public MovieItem(int id, int movieId, String movieName, String genre) {
        this.id = id;
        this.movieId = movieId;
        this.movieName = movieName;
        this.genre = genre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMovieId() {
        return movieId;
    }

    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
