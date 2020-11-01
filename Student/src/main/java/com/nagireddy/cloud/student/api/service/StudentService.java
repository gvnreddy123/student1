package com.nagireddy.cloud.student.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.nagireddy.cloud.student.api.model.Student;
import com.nagireddy.cloud.student.api.repository.StudentRepo;

@Service
public class StudentService {

	@Autowired
	public StudentRepo repo;

	public void addStudent(Student obj) {
		System.out.println("obj value of service method........"+obj.getId());
		repo.save(obj);
	}

	public List<Student> getStudents() {
		List<Student> st = repo.findAll();

		return st;

	}

	public ResponseEntity<Student> updateStudent(Student obj) {

		Student st = repo.save(obj);
		return new ResponseEntity<Student>(st, HttpStatus.OK);
	}

	public ResponseEntity<Student> deleteStudent(int id) {

		repo.deleteById(id);
		return new ResponseEntity<Student>(HttpStatus.OK);
	}

}
