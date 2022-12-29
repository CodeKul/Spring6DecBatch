package com.codekul.Spring6DecBatch.jpa.relationships.repository;

import com.codekul.Spring6DecBatch.jpa.relationships.entity.Comments;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comments,Long> {
}
