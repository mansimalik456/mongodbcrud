package com.crudmongo.mongodbcrud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crudmongo.mongodbcrud.models.Student;
import com.crudmongo.mongodbcrud.repo.Studentrepo;

@RestController
@RequestMapping("/student")
public class MyController {
	
	@Autowired
	private Studentrepo studentRepository;
	
	@PostMapping("/add")
	public ResponseEntity<?> addStudent(@RequestBody Student student){
		Student save = studentRepository.save(student);
		return ResponseEntity.ok(save);
	}
	
	@GetMapping("/get")
	public ResponseEntity<?> getStudents(){
		return ResponseEntity.ok(studentRepository.findAll());
	}
	

}