package com.example.Group4_Demo;

import com.example.Group4_Demo.entity.Syllabus;
import com.example.Group4_Demo.entity.TrainingProgram;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.example.Group4_Demo.repository.SyllabusRepository;

import java.util.Calendar;
import java.util.List;

@SpringBootApplication
public class Group4DemoApplication implements CommandLineRunner {
	@Autowired
	private SyllabusRepository syllabusRepository;

	public static void main(String[] args) {
		SpringApplication.run(Group4DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		TrainingProgram trainingProgram_1 = TrainingProgram.builder().trainingProgramId(1L)
																	 .userId(2)
																	 .name("Deploying")
																	 .createdDate(Calendar.getInstance().getTime())
														   .build();
		TrainingProgram trainingProgram_2 = TrainingProgram.builder().trainingProgramId(2L)
																	 .userId(2)
																	 .name("Ops")
																	 .createdDate(Calendar.getInstance().getTime())
														   .build();
		Syllabus syllabus_1 = Syllabus.builder().syllabusID(1L)
												.syllabusName("Docker")
												.syllabusStatus(false)
												.syllabusDuration(5)
												.syllabusVersion("v.1")
												.trainingProgramList(List.of(trainingProgram_1, trainingProgram_2))
												.build();
		Syllabus syllabus_2 = Syllabus.builder().syllabusID(2L)
												.syllabusName("Kubernetes")
												.syllabusStatus(false)
												.syllabusDuration(5)
												.syllabusVersion("v.1")
												.trainingProgramList(List.of(trainingProgram_2))
												.build();
		syllabusRepository.save(syllabus_1);
		syllabusRepository.save(syllabus_2);
	}
}
