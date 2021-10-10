package com.example.service;

import java.util.List;
import java.util.Optional;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;
import com.example.model.Student;

@Service
public interface StudentService {
    public Optional<Student> findById(Long id);

    public List<Student> findByName(@Param("name") String name);

    public Student findByRollno(@Param("rollno") int rollno);

    public List<Student> findAll();

    public Student addStudent(Student std);
}
