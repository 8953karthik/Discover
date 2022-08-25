package com.discover.program.bo;

import java.util.List;

import com.discover.program.entity.HealthCheck;
import com.discover.program.entity.Student;
import com.discover.program.entity.StudentDto;

public interface IStudentBo {
	public List<Student> getList();
	public int addStudent(StudentDto addstudent);
	public int removeStudent(int id);
	public HealthCheck  healthcheck();
	

}
