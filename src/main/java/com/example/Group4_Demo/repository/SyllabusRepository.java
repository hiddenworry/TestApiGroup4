package com.example.Group4_Demo.repository;

import java.util.List;
import com.example.Group4_Demo.entity.Syllabus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface SyllabusRepository extends JpaRepository<Syllabus, Long> {
    @Query(value = "SELECT * FROM syllabus s WHERE s.syllabusId = 1", nativeQuery = true)
    List<Syllabus> findSyllabusWithTrainingProgram();
}
