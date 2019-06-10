package com.example.healthtrackerbackend;

import com.example.healthtrackerbackend.database.Exercise;
import com.example.healthtrackerbackend.database.ExerciseRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/")
@RestController
public class ExerciseController {

    @Autowired
    ExerciseRepository exerciseRepository;

    @GetMapping("all")
    public List<Exercise> getAllExercises() {
        return  exerciseRepository.findAll();
    }

    @PostMapping("new")
    public void postNewExercise(@RequestBody Exercise exercise) {
        exerciseRepository.save(exercise);
    }

}
