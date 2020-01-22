package com.grantjd.songr;

public class Album {
    public String title;
    public String img;
    public String artist;
//    public int length;
//    public int releaseDate;
    public String genre;
    public int songCount;


    public Album(String title, String img, String artist, String genre, int songCount) {
        this.title = title;
        this.img = img;
        this.artist = artist;
//        this.length = length;
//        this.releaseDate = releaseDate;
        this.genre = genre;
        this.songCount = songCount;
    }
}
