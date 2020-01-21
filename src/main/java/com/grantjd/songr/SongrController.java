package com.grantjd.songr;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SongrController {

    @GetMapping("/")
    public String helloWorld() {

        return "hello";
    }
}
