package com.example.service.impl;

import com.example.model.Student;
import com.example.repository.StudentRepository;
import com.example.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;

@Component
@Transactional
public class StudentServiceImpl implements StudentService {

    @Autowired
    StudentRepository stdrepo;
    HashMap<String, String> m = new HashMap<String, String>();

    @Override
    public Student addStudent(Student std) {
        // TODO Auto-generated method stub
        Student s = stdrepo.save(std);
        return s;
    }

    public Student updateStudent(Student std) {
        // TODO Auto-generated method stub
        Student s = stdrepo.save(std);
        return s;
    }

    public void deleteStudent(Student entity) {
        // TODO Auto-generated method stub
        stdrepo.delete(entity);
    }

    @Override
    public Optional<Student> findById(Long id) {
        // TODO Auto-generated method stub
        Optional<Student> list = stdrepo.findById(id);
        return list;
    }

    @Override
    public List<Student> findByName(String name) {
        // TODO Auto-generated method stub
        List<Student> list = stdrepo.findByName(name);
        return list;
    }

    @Override
    public Student findByRollno(int rollno) {
        // TODO Auto-generated method stub
        Student list = stdrepo.findByRollno(rollno);
        return list;
    }

    @Override
    public List<Student> findAll() {
        return stdrepo.findAll();

    }


}
