package com.example.Group4_Demo.entity;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.util.Date;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class TrainingProgram {
    @Id
    private long trainingProgramId;
    private String name;
    @ManyToOne
    @JoinColumn(name = "syllabusId", nullable = false)
    private Syllabus syllabus;
    private Date createdDate;
    private int userId;



}