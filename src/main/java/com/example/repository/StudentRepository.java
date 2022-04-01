package com.example.repository;

import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.example.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

    public Optional<Student> findById(Long id);

    public List<Student> findByName(@Param("name") String name);

    public Student findByRollno(@Param("rollno") int rollno);

    public List<Student> findAll();

}
