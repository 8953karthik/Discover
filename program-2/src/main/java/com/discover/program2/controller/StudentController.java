package com.discover.program2.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.discover.program2.entity.Student;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;

@RestController
@RequestMapping("/app2")
public class StudentController {
	
	@Autowired
	RestTemplate restTemplate;
	
		@Autowired
	ICilent_Feign feign;
	
		//Using Rest_Template
	@GetMapping("/Students")
	
	public ResponseEntity<Student[]> getStudent(){
		String url = "http://localhost:9090/studentdb/getstudent";
		return restTemplate.getForEntity(url, Student[].class);
	}
      
	//Using Feign_Cilent
	@GetMapping("/ALLStudents")
	public List<Student> getAllstudents(){
		return feign.getAllstudents();
	}
	
	@PostMapping("/ADDStudent")
	@CircuitBreaker(name="Circuit_Breaker",fallbackMethod = "circuit")
	public String addStudents(@Valid @RequestBody Student student) {
		return feign.addStudents(student);
	}
	
	public String circuit(Exception e)
	{
		return "Server1 is DOWN";
	}
}
