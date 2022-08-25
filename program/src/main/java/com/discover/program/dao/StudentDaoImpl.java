package com.discover.program.dao;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.discover.program.entity.Student;
import com.discover.program.entity.StudentDto;

@Repository
public class StudentDaoImpl implements IStudentDao {

	@Autowired
	private JdbcTemplate template;

	@Override
	public List<Student> getList() {
		String all="SELECT * FROM STUDENT_TABLE";
		return template.query(all,BeanPropertyRowMapper.newInstance(Student.class));//StudentVo
	}

	@Override
	public int addStudent(StudentDto student) {
		String add="INSERT INTO STUDENT_TABLE (id, mobileno, name, grade) VALUES ('"+student.getId()+"', '"+student.getMobileno()+"', '"+student.getName()+"', '"+student.getGrade()+"')";
		return template.update(add);  //,BeanPropertyRowMapper.newInstance(StudentDto.class)
		
	}

	@Override
	public int removeStudent(int id) {
	String remove="DELETE FROM STUDENT_TABLE WHERE id= ?";
		return template.update(remove,id);
	}

}
