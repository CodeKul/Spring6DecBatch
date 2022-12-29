package com.codekul.Spring6DecBatch.jpa.relationships.service;

import com.codekul.Spring6DecBatch.jpa.relationships.dto.request.PostRequestDto;
import com.codekul.Spring6DecBatch.jpa.relationships.entity.Post;
import org.springframework.http.ResponseEntity;

import java.util.Map;

public interface PostService {
    Map<String,Object> savePost(PostRequestDto postRequestDto);
}
