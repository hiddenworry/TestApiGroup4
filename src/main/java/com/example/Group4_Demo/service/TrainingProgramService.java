package com.example.Group4_Demo.service;

import com.example.Group4_Demo.entity.TrainingProgram;

public interface TrainingProgramService {

    public TrainingProgram findByName(String name);

    public TrainingProgram findByStatus(int status);

    public TrainingProgram findByUserId(int userId);

    public TrainingProgram findByUserIdAndStatus(int userId, int status);

}
