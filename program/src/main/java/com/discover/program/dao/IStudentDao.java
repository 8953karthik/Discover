package com.discover.program.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.discover.program.entity.Student;
import com.discover.program.entity.StudentDto;

@Repository
public interface IStudentDao {
	public List<Student> getList();
	public int addStudent(StudentDto student);
	public int removeStudent(int id);

}