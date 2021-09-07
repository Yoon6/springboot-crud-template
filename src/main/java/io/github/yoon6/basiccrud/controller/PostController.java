package io.github.yoon6.basiccrud.controller;

import io.github.yoon6.basiccrud.model.entity.PostEntity;
import io.github.yoon6.basiccrud.model.repository.PostRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

@Controller
public class PostController {

    private PostRepository postRepository;

    public PostController(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    @GetMapping("/create")
    public String create() {

        return "create";
    }

    @PostMapping("/post")
    public String create(PostEntity postEntity) {
        postRepository.save(postEntity);

        return "redirect:/";
    }

    @GetMapping("/post/{id}")
    public String detail(@PathVariable("id") Long id, Model model) {
        PostEntity post = postRepository.getById(id);
        model.addAttribute("post", post);

        return "detail";
    }

    @DeleteMapping("/post/{id}")
    public String delete(@PathVariable("id") Long id) {
        postRepository.deleteById(id);
        return "redirect:/";
    }

    @PutMapping("/post/{id}")
    public String edit(@PathVariable("id") Long id, PostEntity postEntity) {
        postRepository.save(postEntity);

        return "redirect:/post/" + id;
    }
}
