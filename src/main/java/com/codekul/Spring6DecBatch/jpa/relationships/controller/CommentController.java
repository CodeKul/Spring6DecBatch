package com.codekul.Spring6DecBatch.jpa.relationships.controller;

import com.codekul.Spring6DecBatch.jpa.relationships.dto.request.CommentRequestDto;
import com.codekul.Spring6DecBatch.jpa.relationships.entity.Comments;
import com.codekul.Spring6DecBatch.jpa.relationships.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/comment")
public class CommentController {

    @Autowired
    private CommentService commentService;

    @PostMapping
    public ResponseEntity<?> saveComment(@RequestBody CommentRequestDto commentRequestDto){
        return new ResponseEntity<>(commentService.saveComment(commentRequestDto),HttpStatus.CREATED);
    }
}
