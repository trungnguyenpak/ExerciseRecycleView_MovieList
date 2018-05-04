package com.trungnguyeen.exerciserecycleview_movielist.model;

/**
 * Created by trungnguyeen on 11/17/17.
 */

public class Movie {

    private String mTitle;
    private String mGenre;
    private String mYear;

    public Movie(String titlel, String genre, String year) {
        this.mTitle = titlel;
        this.mGenre = genre;
        this.mYear = year;
    }

    public Movie() {
    }

    public String getmTitle() {
        return mTitle;
    }

    public void setmTitle(String mTitle) {
        this.mTitle = mTitle;
    }

    public String getmGenre() {
        return mGenre;
    }

    public void setmGenre(String mGenre) {
        this.mGenre = mGenre;
    }

    public String getmYear() {
        return mYear;
    }

    public void setmYear(String mYear) {
        this.mYear = mYear;
    }





}
