package com.codekul.Spring6DecBatch.jpa.relationships.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Getter
@Setter
@Table(name = "post")
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String post;
    private LocalDate postDate;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "post_id",referencedColumnName = "id")
    private List<Comments> comments;

}
