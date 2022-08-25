package com.discover.program.eo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.discover.program.dao.IStudentDao;
import com.discover.program.entity.Student;
import com.discover.program.entity.StudentDto;

@Component

public class IStudentEOImpl implements IStudentEO{
	
@Autowired
IStudentDao studentDao;

	@Override
	public List<Student> getList() {
		return studentDao.getList();
	}

	@Override
	public int addStudent(StudentDto student) {
		return studentDao.addStudent(student);
	}

	@Override
	public int removeStudent(int id) {
		return studentDao.removeStudent(id);
	}

}
