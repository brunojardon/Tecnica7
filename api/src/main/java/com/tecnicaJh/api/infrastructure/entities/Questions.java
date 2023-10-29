package com.tecnicaJh.api.infrastructure.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "Questions")
public class Questions {
    @Id
    @Column(name = "QuestionID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long questionsID;
    @Column(name = "Question")
    private String question;
    @Column(name = "Answer")
    private String answer;
    @Column(name = "Category")
    private String category;
}
