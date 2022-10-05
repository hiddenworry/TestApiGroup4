package com.example.Group4_Demo.entity;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
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
    private int userId;
    private String name;
    private Date createdDate;

    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinTable(name = "training_program_syllabus_map",
            joinColumns = @JoinColumn(name = "trainingProgram_id", referencedColumnName = "trainingProgramId"),
            inverseJoinColumns =  @JoinColumn(name = "syllabus_id", referencedColumnName = "syllabusID"))
    private List<Syllabus> syllabusList;
}
