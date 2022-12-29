package com.codekul.Spring6DecBatch.jpa.relationships.controller;

import com.codekul.Spring6DecBatch.jpa.relationships.dto.request.PostRequestDto;
import com.codekul.Spring6DecBatch.jpa.relationships.entity.Post;
import com.codekul.Spring6DecBatch.jpa.relationships.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/post")
public class PostController {
    @Autowired
    private PostService postService;

    @PostMapping
    public Map<String,Object> savePost(@RequestBody PostRequestDto postRequestDto){
        return postService.savePost(postRequestDto);
    }
}
