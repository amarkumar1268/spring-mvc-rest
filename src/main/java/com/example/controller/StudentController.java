package com.example.controller;

import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.model.Student;
import com.example.serviceimpl.StudentServiceImpl;

@Controller
@RequestMapping("/")
public class StudentController {
	
	@Autowired
	StudentServiceImpl stdservice;
	
	
	@RequestMapping("addStudent")
	@ResponseBody
	public String StudentDetails(Student std)
	{
		stdservice.addStudent(std);	
	    return "student added";
	}
	
	@RequestMapping("findByName/{name}")
	@ResponseBody
	public List<Student> findByName(@PathVariable("name") String name)
	{
		return stdservice.findByName(name);
	}
	
	@RequestMapping("findById/{id}")
	@ResponseBody
	public Optional<Student> findById(@PathVariable("id") Long id)
	{
		return Optional.ofNullable(stdservice.findById(id).orElse(new Student()));	
	}
	
	@RequestMapping("findByRollno/{rollno}")
	@ResponseBody
	public Optional<Student> findByRollno(@PathVariable("rollno") int rollno)
	{
		return Optional.ofNullable(stdservice.findByRollno(rollno));
	}
	
	@RequestMapping("findAll")
	@ResponseBody
	public List<Student> findAll()
	{
		return stdservice.findAll();

	}
	
	
}
