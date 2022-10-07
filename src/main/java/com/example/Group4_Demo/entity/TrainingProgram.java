package com.example.Group4_Demo.entity;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

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
    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Syllabus> syllabusList = new ArrayList<Syllabus>();


}
