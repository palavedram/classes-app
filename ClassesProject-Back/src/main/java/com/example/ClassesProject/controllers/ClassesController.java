package com.example.ClassesProject.controllers;

import com.example.ClassesProject.models.Classes;
import com.example.ClassesProject.repositories.ClassesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/classes")
public class ClassesController {

    @Autowired
    private ClassesRepository classesRepository;

    @GetMapping
    @CrossOrigin
    public List<Classes> getAllClasses() {
        return classesRepository.findAll();
    }

    @PostMapping
    @CrossOrigin
    public Classes addClass(@RequestBody Classes classes) {
        return classesRepository.save(classes);
    }

    @DeleteMapping("/{id}")
    @CrossOrigin
    public void deleteClass(@PathVariable Integer id){
        classesRepository.deleteById(id);
    }

}