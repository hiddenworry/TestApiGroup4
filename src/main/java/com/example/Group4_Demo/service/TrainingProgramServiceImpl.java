package com.example.Group4_Demo.service;

import com.example.Group4_Demo.entity.TrainingProgram;
import com.example.Group4_Demo.repository.TrainingProgramRepository;
import org.springframework.stereotype.Service;

@Service
public class TrainingProgramServiceImpl implements TrainingProgramService {
    TrainingProgramRepository trainingProgramRepository;

    public TrainingProgramServiceImpl(TrainingProgramRepository trainingProgramRepository) {
        this.trainingProgramRepository = trainingProgramRepository;
    }

    @Override
    public TrainingProgram findByName(String name) {
        return trainingProgramRepository.findByName(name.trim().toLowerCase()).orElse(null);
    }

    @Override
    public TrainingProgram findByStatus(int status) {
        return trainingProgramRepository.findByStatus(status).orElse(null);
    }

    @Override
    public TrainingProgram findByUserId(int userId) {
        return trainingProgramRepository.findByUserId(userId).orElse(null);
    }

    @Override
    public TrainingProgram findByUserIdAndStatus(int userId, int status) {
        return trainingProgramRepository.findByUserIdAndStatus(userId, status).orElse(null);
    }

    @Override
    public TrainingProgram insertTrainingProgram(TrainingProgram trainingProgram) {
        return trainingProgramRepository.save(trainingProgram);
    }
}
