package com.elice.project.week6.day4.post.controller;

import com.elice.project.week6.day4.post.domain.Post;
import com.elice.project.week6.day4.post.dto.PostDTO;
import com.elice.project.week6.day4.post.service.PostService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api") // localhost:8080/api
public class PostController {
    private final PostService postService;

    public PostController(PostService postService) {
        this.postService = postService;
    }

    //read
    @GetMapping("/posts") //localhost:8080/api/posts
    public List<Post> getAllposts(){
        return postService.getAllPosts();
    }

    //create
    @PostMapping("/posts")
    public Post createPost(@RequestBody PostDTO postDTO){
        return postService.savePost(postDTO);
    }

    //Todo Update
    //Todo Delete
}
