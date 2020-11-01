package com.nagireddy.cloud.student.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nagireddy.cloud.student.api.model.Student;

@Repository
public interface StudentRepo extends JpaRepository<Student, Integer> {

	

}
