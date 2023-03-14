package com.boot.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Student;
import com.example.repository.StudentRepository;

@RestController
public class StudentController {
	@Autowired
	StudentRepository sr;
	
	@PostMapping("/savestudentdata")
	public Student saveStudentDetails(@RequestBody Student s)
	{
		sr.save(s);
		return s;
	}
	
	@GetMapping("/getstudentdata")
	public Student getStudentData(@RequestParam int id)
	{
		Optional<Student> st=sr.findById(id);
		return st.get();
	}
	
	@GetMapping("/getalldata")
	public List<Student> getAllStudentdata()
	{
		List<Student> st=sr.findAll();
		return st;
		
	}
	@DeleteMapping("/deletestudentdata")
	public String deleteStudentData(@RequestParam int id)
	{
		sr.deleteById(id);
		return "student data deleted successfully";
	}
	
	@PutMapping("/updatestudentdata")
	public Student updateStudentData(@RequestBody Student s)
	{
		sr.save(s);
		return s;
	}
	
}
