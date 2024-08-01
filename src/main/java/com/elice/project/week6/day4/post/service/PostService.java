package com.elice.project.week6.day4.post.service;

import com.elice.project.week6.day4.post.domain.Post;
import com.elice.project.week6.day4.post.dto.PostDTO;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PostService {
    //임시 db
    List<Post> data = new ArrayList<>();

    private long generateId(){
        if(data.isEmpty()){
            return 1;
        }

//        return data.get(data.size() - 1).getId() + 1;
        return data.getLast().getId() + 1;
    }

    public List<Post> getAllPosts() {
//        data.add(new Post("제목","블로그 내용"));
        return data;
    }

    public Post savePost(PostDTO postDTO) {
        Post post = new Post(postDTO.getTitle(), postDTO.getContent());
        post.setId(generateId());
        data.add(post);
        return post;
    }
}