package com.discover.program2.controller;

import java.util.List;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import com.discover.program2.entity.Student;

@FeignClient(value= "Feign",url= "http://localhost:8953/studentdb/")
public interface ICilent_Feign {

	@GetMapping("/getstudent")
	public List<Student> getAllstudents();
	
	@PostMapping("/addstudent")
	public String addStudents( @RequestBody Student student);
}
