package com.grantjd.songr;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Album {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private String title;
    private String img;
    private String artist;
    private int length;

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getImg() {
        return img;
    }

    public String getArtist() {
        return artist;
    }

    public int getLength() {
        return length;
    }

    public int getSongCount() {
        return songCount;
    }

    private int songCount;


    public Album(String title, String img, String artist, int length, int songCount) {
        this.title = title;
        this.img = img;
        this.artist = artist;
        this.length = length;
        this.songCount = songCount;
    }

    public Album(){}
}
