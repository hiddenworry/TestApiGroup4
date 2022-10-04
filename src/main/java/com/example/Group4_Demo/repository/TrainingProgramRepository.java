package com.example.Group4_Demo.repository;


import com.example.Group4_Demo.entity.TrainingProgram;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface TrainingProgramRepository extends JpaRepository<TrainingProgram, Long> {
    Optional<TrainingProgram> findByName(String name);

    Optional<TrainingProgram> findByStatus(int status);

    Optional<TrainingProgram> findByUserId(int userId);

    Optional<TrainingProgram> findByUserIdAndStatus(int userId, int status);
}
