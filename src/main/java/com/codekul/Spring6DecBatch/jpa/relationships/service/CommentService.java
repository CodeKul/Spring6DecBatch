package com.codekul.Spring6DecBatch.jpa.relationships.service;

import com.codekul.Spring6DecBatch.jpa.relationships.dto.request.CommentRequestDto;
import com.codekul.Spring6DecBatch.jpa.relationships.entity.Comments;

import java.util.Map;

public interface CommentService {
    Map<String,Object> saveComment(CommentRequestDto commentRequestDto);
}
