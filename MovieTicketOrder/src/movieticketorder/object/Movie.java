/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package movieticketorder.object;

import java.awt.Image;

/**
 *
 * @author Admin
 */
public class Movie {
    private int movieID;
    private String movieName;
    private String movieAutor;
    private String  movieDescription;
    private int movieTime;
    private String moviePoster="";
    private String movieTrailer="";

    public Movie() {}

    public Movie(int movieID, String movieName, String movieAutor, String movieDescription, int movieTime, String moviePoster, String movieTrailer) {
        this.movieID = movieID;
        this.movieName = movieName;
        this.movieAutor = movieAutor;
        this.movieDescription = movieDescription;
        this.movieTime = movieTime;
        this.moviePoster = moviePoster;
        this.movieTrailer = movieTrailer;
    }

    public int getMovieID() {
        return movieID;
    }

    public void setMovieID(int movieID) {
        this.movieID = movieID;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getMovieAutor() {
        return movieAutor;
    }

    public void setMovieAutor(String movieAutor) {
        this.movieAutor = movieAutor;
    }

    public String getMovieDescription() {
        return movieDescription;
    }

    public void setMovieDescription(String movieDescription) {
        this.movieDescription = movieDescription;
    }

    public int getMovieTime() {
        return movieTime;
    }

    public void setMovieTime(int movieTime) {
        this.movieTime = movieTime;
    }

    public String getMoviePoster() {
        return moviePoster;
    }

    public void setMoviePoster(String moviePoster) {
        this.moviePoster = moviePoster;
    }

    public String getMovieTrailer() {
        return movieTrailer;
    }

    public void setMovieTrailer(String movieTrailer) {
        this.movieTrailer = movieTrailer;
    }
    
}
