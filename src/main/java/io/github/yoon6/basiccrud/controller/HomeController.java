package io.github.yoon6.basiccrud.controller;

import io.github.yoon6.basiccrud.model.entity.PostEntity;
import io.github.yoon6.basiccrud.model.repository.PostRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
public class HomeController {
    private PostRepository postRepository;

    public HomeController(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    @GetMapping("/")
    public String home(Model model) {
        List<PostEntity> postEntities = postRepository.findAll();

        model.addAttribute("postEntities", postEntities);

        return "index";
    }
}
