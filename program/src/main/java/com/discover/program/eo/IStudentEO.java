package com.discover.program.eo;

import java.util.List;

import com.discover.program.entity.Student;
import com.discover.program.entity.StudentDto;

public interface IStudentEO {

	public List<Student> getList();
	public int addStudent(StudentDto student);
	public int removeStudent(int id);

}
