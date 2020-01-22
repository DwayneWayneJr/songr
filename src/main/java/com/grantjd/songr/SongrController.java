package com.grantjd.songr;

import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class SongrController {

    @GetMapping("/")
    public String home (Model m) {
        return "index";
    }

    @GetMapping("/albums")
    public String albums (Model m) {
        Album[] albums = new Album[] {
                new Album("Cadillactica", "https://upload.wikimedia.org/wikipedia/en/b/b2/Big_K.R.I.T._Cadillactica.jpg", "Big K.R.I.T.",  "Hip hop", 15),
                new Album("4eva Is a Mighty Long Time", "https://upload.wikimedia.org/wikipedia/en/8/84/Big_K.R.I.T._4eva_Is_a_Mighty_Long_Time_disc_1.jpg", "Big K.R.I.T.", "Southern hip hop", 22),
                new Album("K.R.I.T. Iz Here", "https://upload.wikimedia.org/wikipedia/en/a/ae/Krit_iz_here.jpeg", "Big K.R.I.T.", "Southern hip hop", 19)
        };
        m.addAttribute("albums", albums);

        return "albums";
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
}
