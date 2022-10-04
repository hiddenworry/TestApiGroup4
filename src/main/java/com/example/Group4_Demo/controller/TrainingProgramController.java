package com.example.Group4_Demo.controller;


import com.example.Group4_Demo.entity.TrainingProgram;
import com.example.Group4_Demo.service.TrainingProgramService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class TrainingProgramController {
    private static final int SAVE_DRAW_STATUS = 0;
    private static final int SAVED_STATUS = 1;
    @Autowired
    TrainingProgramService trainingProgramService;

    @GetMapping("api/training-program/create/create-program-name/{name}")
    public ResponseEntity<?> searchTrainingProgramByName(@PathVariable String name){
        try {

            TrainingProgram trainingProgram = trainingProgramService.findByName(name);

            if(trainingProgram != null){
                return ResponseEntity.badRequest().body("Duplicate name");
            } else
                return ResponseEntity.ok().body(name);

        }catch (Exception e){
            e.printStackTrace();
            return ResponseEntity.internalServerError().body(e.getMessage());
        }
    }

   @PostMapping("/api/training-program/create")
        public ResponseEntity<?> checkIfUserHaveSaveDraw(@RequestBody int userId){
            try {
                TrainingProgram trainingProgram = trainingProgramService.findByUserIdAndStatus(userId, SAVE_DRAW_STATUS);
                if(trainingProgram != null){
                    return ResponseEntity.ok().body(trainingProgram);
                } else
                    return ResponseEntity.notFound().build();

            } catch (Exception ex){
                    ex.printStackTrace();
                    return ResponseEntity.internalServerError().build();
            }

        }
}
