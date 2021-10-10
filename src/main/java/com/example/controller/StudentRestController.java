package com.example.controller;

import java.util.List;
import java.util.Optional;
import com.example.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.model.*;


@RestController
public class StudentRestController {

    @Autowired
    private StudentService stdservice;

    @PostMapping("/addStudent")
    public String StudentDetails(@RequestBody Student std) {
        stdservice.addStudent(std);
        return "student added";
    }

    @GetMapping("/findByName/{name}")
    public List<Student> findByName(@PathVariable("name") String name) {
        return stdservice.findByName(name);
    }

    @GetMapping("/findById/{id}")
    public Optional<Student> findById(@PathVariable("id") Long id) {
        return Optional.ofNullable(stdservice.findById(id).orElse(new Student()));
    }

    @GetMapping("/findByRollno/{rollno}")
    public Optional<Student> findByRollno(@PathVariable("rollno") int rollno) {
        return Optional.ofNullable(stdservice.findByRollno(rollno));
    }

    @GetMapping("/findAll")
    public List<Student> findAll() {
        return stdservice.findAll();

    }
}