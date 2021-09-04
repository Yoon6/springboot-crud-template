package io.github.yoon6.basiccrud.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeRestController {
    @GetMapping("/hello")
    public String home() {
        return "Hello World!";
    }
}
