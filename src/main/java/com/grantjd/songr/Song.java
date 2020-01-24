package com.grantjd.songr;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Song {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private String title;
    private int songLength;
    private int trackNumber;
    private String album;

    public String getTitle() {
        return title;
    }

    public int getSongLength() {
        return songLength;
    }

    public int getTrackNumber() {
        return trackNumber;
    }

    public String getAlbum() {
        return album;
    }

    public Song(String title, int songLength, int trackNumber, String album) {
        this.title = title;
        this.songLength = songLength;
        this.trackNumber = trackNumber;
        this.album = album;
    }
}


