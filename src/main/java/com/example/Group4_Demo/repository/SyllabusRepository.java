package com.example.Group4_Demo.repository;


import com.example.Group4_Demo.entity.Syllabus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RestController;

@Repository
public interface SyllabusRepository extends JpaRepository<Syllabus, Long> {

}
