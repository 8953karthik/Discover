package com.discover.program.contoller;

import java.util.List;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.jdbc.BadSqlGrammarException;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.discover.program.bo.IStudentBo;
import com.discover.program.entity.HealthCheck;
import com.discover.program.entity.Student;
import com.discover.program.mapper.MapStructer;


@RestController
@RequestMapping("/studentdb")

public class StudentController {
	
	private static final Logger LOG = LoggerFactory.getLogger(StudentController.class);
	
	@Autowired
	private MapStructer mapper;
	
	@Autowired
	private IStudentBo studentBo;
	
	@PostMapping("/addstudent")
	@ResponseStatus(value=HttpStatus.OK)
	
	public String saveStudent(@Valid @RequestBody Student student){
	    int count=studentBo.addStudent(mapper.studentToStudentDto(student));
	    LOG.info("added student successfully");
	    if(count==1) {
	        return "Student Added";
	    }
	    else return "No Student Added";
	}
	
	
	
	@GetMapping("/getstudent")
	public ResponseEntity<List<Student>> getStudent(){
		LOG.debug("added student successfully");
		return new ResponseEntity<>(studentBo.getList(),HttpStatus.OK);
	}
	
	
	@DeleteMapping("/remove/{id}")
	public ResponseEntity<Integer> deleteBook(@Valid @PathVariable int id){

	     return new ResponseEntity<>(studentBo.removeStudent(id),HttpStatus.OK);
}
	
	@PostMapping("/healthcheck")
	public ResponseEntity<HealthCheck> healthcheck()throws BadSqlGrammarException{
		HealthCheck check=studentBo.healthcheck();
		if(check!=null)
		{
			return new ResponseEntity<>(check,HttpStatus.OK);
		}
		return new ResponseEntity<>(studentBo.healthcheck(),HttpStatus.BAD_REQUEST);
	}
	
	
	
}
