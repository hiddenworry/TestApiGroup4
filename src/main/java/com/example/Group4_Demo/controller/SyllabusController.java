package com.example.Group4_Demo.controller;

import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.Group4_Demo.service.SyllabusService;
import com.example.Group4_Demo.entity.Syllabus;

@RestController
@RequestMapping("/api/syllabus")
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class SyllabusController {
    private SyllabusService syllabusService;

    @GetMapping("/get/syllabuses")
    public List<Syllabus> fetchSyllabuses() {
        return syllabusService.fetchSyllabuses();
    }
}
