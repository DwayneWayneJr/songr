package com.grantjd.songr;

import javax.persistence.*;

@Entity
public class Song {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String title;
    private int songLength;
    private int trackNumber;

    @ManyToOne
    private Album album;

    public String getTitle() {
        return title;
    }

    public int getSongLength() {
        return songLength;
    }

    public int getTrackNumber() {
        return trackNumber;
    }

    public Song(String title, int songLength, int trackNumber, Album album) {
        this.title = title;
        this.songLength = songLength;
        this.trackNumber = trackNumber;
        this.album = album;
    }
}


