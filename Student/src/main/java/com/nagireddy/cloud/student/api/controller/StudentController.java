package com.nagireddy.cloud.student.api.controller;

import java.util.List;

import org.hibernate.annotations.Loader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nagireddy.cloud.student.api.model.Student;
import com.nagireddy.cloud.student.api.service.StudentService;

@RestController
@RequestMapping("/student")
@Loader

public class StudentController {
	
	@Autowired
	public StudentService service;
	
	@PostMapping("/addStudent")
	public void addStudent(@RequestBody Student obj)
	{
		System.out.println("obj value is...................."+obj.getId());
		service.addStudent(obj);
	}
	
	@GetMapping("/getStudents")
	public List<Student> getStudents()
	{
		return service.getStudents();
	}

	@DeleteMapping("/deleteStudent/{id}")
	public ResponseEntity<Student> deleteStudent(@PathVariable int id)
	{
		System.out.println("input value is............"+id);
		return service.deleteStudent(id);
	}
	
	@PutMapping("/updateStudent/{id}")
	public ResponseEntity<Student> updateStudent(@PathVariable int id,@RequestBody Student obj)
	{ 
		System.out.println("input id value is.........."+id);
		//obj.setId(id);
		return service.updateStudent(obj);
	}
}
