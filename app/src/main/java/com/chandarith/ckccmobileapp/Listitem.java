package com.chandarith.ckccmobileapp;

/**
 * Created by Chan Darith on 9/26/2017.
 */

public class Listitem {
    private String title, genre, year;

    public Listitem(String head, String desc) {
    }

    public Listitem(String title, String genre, String year) {
        this.title = title;
        this.genre = genre;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String name) {
        this.title = name;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
