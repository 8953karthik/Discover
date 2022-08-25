package com.discover.program.bo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.BadSqlGrammarException;
import org.springframework.stereotype.Service;

import com.discover.program.entity.HealthCheck;
import com.discover.program.entity.Student;
import com.discover.program.entity.StudentDto;
import com.discover.program.eo.IStudentEOImpl;


@Service
public class StudentBoImpl implements IStudentBo {
	
	
	
	@Autowired
	IStudentEOImpl eoImpl;  
	
	
	@Override
	public List<Student> getList() {
		 return eoImpl.getList();	
	}

	@Override
	public int addStudent(StudentDto student) {
		 return eoImpl.addStudent(student);
	}

	@Override
	public int removeStudent(int id) {
		 return eoImpl.removeStudent(id);
	}

	@Override
	public HealthCheck healthcheck() {
		HealthCheck heal=new HealthCheck();
		heal.setSystemName("Table is available");
		try {
			if(eoImpl.getList() !=null || eoImpl.getList().isEmpty())
			{
				heal.setStatusCode("SUCCESS");
				heal.setStatusDescription("Connected to DB");
			}		
		}
		catch(BadSqlGrammarException exp) {
			heal.setStatusCode("FAILED");
			heal.setStatusDescription("Not Connected to DB");
			
		}
		return heal;
		
	}

}


/*
catch(DuplicateKeyException exp) {
	heal.setStatusCode("Duplicate");
	heal.setStatusDescription("Duplicate ID is not allowed");
}*/
