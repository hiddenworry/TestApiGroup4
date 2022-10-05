package com.example.Group4_Demo.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Syllabus {
    @Id
    private long syllabusID;
    private String syllabusName;
    private boolean syllabusStatus;
    private int syllabusDuration;
    private String syllabusVersion;

    @ManyToMany(cascade = CascadeType.ALL, mappedBy = "syllabusList", fetch = FetchType.LAZY)
    private List<TrainingProgram> trainingProgramList;
}
