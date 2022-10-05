package com.example.Group4_Demo.service;

import com.example.Group4_Demo.entity.Syllabus;
import com.example.Group4_Demo.repository.SyllabusRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class SyllabusServiceImpl implements SyllabusService {
    private SyllabusRepository syllabusRepository;

    @Override
    public List<Syllabus> fetchSyllabuses() {
        return syllabusRepository.findAll();
    }
}
