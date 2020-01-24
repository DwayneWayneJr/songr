package com.grantjd.songr;

import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;

@Controller
public class SongrController {

@Autowired
AlbumRepository albumRepository;

@Autowired
SongRepository songRepository;

    @GetMapping("/")
    public String home (Model m) {
        return "index";
    }

    @GetMapping("/hello")
    public String sayHello (Model m) {

        return "hello";
    }

    @GetMapping("/capitalize/input")
    public String capitalize (@PathVariable String input, Model m) {
        m.addAttribute("input", input.toUpperCase());

        return "capsLockOn";
    }

    @GetMapping("/albums")
    public String albums (Model m) {
        List<Album> albums = albumRepository.findAll();
        m.addAttribute("albums", albums);
        return "albums";
    }

    @PostMapping("/albums")
    public RedirectView addAlbums (String title, String img, String artist, int length, int songCount) {
        Album album = new Album(title, img, artist, length, songCount);
        albumRepository.save(album);
        return new RedirectView("/albums");
    }

    @GetMapping("/songs")
    public String songs (Model m) {
        List<Song> songs = songRepository.findAll();
        m.addAttribute("songs", songs);
        return "songs";
    }

    @PostMapping("/songs")
    public RedirectView addSongs (String title, int songLength, int trackNumber, String album) {
        Song song = new Song(title, songLength, trackNumber, album);
        songRepository.save(song);
        return new RedirectView("/songs");

    }
}
