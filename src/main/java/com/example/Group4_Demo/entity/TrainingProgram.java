package com.example.Group4_Demo.entity;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
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
    private int syllabusID;
    private Date createdDate;
    private int userId;
    private int status;



}
