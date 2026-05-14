package com.prepai.prepai_backend.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "questions")
@Data
public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    @Column(name = "content", nullable = false, columnDefinition = "TEXT")
    private String content;

    @Column(name = "type", length = 25)
    private String type; // Technical or hr

    @Column(name = "role", length = 50)
    private String role; //Frontend, Backend, DevOps, FullStack

    @Column(name = "difficulty", length = 15)
    private String difficulty; //Easy or Medium or Hard

    @Column(name = "hint", columnDefinition = "TEXT")
    private String hint;

    @Column(name = "tags", columnDefinition = "TEXT")
    private String tags; // array, Hashmap


}
