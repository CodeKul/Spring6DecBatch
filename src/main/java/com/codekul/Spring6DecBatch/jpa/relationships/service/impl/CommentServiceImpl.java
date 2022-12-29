package com.codekul.Spring6DecBatch.jpa.relationships.service.impl;

import com.codekul.Spring6DecBatch.jpa.relationships.dto.request.CommentRequestDto;
import com.codekul.Spring6DecBatch.jpa.relationships.entity.Comments;
import com.codekul.Spring6DecBatch.jpa.relationships.entity.Post;
import com.codekul.Spring6DecBatch.jpa.relationships.repository.CommentRepository;
import com.codekul.Spring6DecBatch.jpa.relationships.service.CommentService;
import com.codekul.Spring6DecBatch.util.Constants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.HashMap;
import java.util.Map;
@Service
public class CommentServiceImpl implements CommentService {
    @Autowired
    private CommentRepository commentRepository;

    @Override
    public Map<String, Object> saveComment(CommentRequestDto commentRequestDto) {
        Map<String,Object>  map = new HashMap<>();
        map.put(Constants.MESSAGE,"Comment saved successfully");
        map.put(Constants.RESULT, HttpStatus.CREATED);
        Comments comments = new Comments();
        comments.setComment(commentRequestDto.getComment());
        comments.setCommentDate(LocalDate.now());
        comments.setCommentTime(LocalTime.now());
        Post post = new Post();
        post.setId(commentRequestDto.getPostId());
        comments.setPost(post);
        commentRepository.save(comments);
        return map;
    }
}
