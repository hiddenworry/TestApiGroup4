package com.example.Group4_Demo.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
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

    @JsonIgnore
    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "syllabusList")
    private List<TrainingProgram> trainingProgramList = new ArrayList<TrainingProgram>();
}
