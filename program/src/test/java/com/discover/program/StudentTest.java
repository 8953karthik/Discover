package com.discover.program;


import static org.hamcrest.CoreMatchers.any;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;

import com.discover.program.dao.IStudentDao;
import com.discover.program.dao.StudentDaoImpl;
import com.discover.program.entity.Student;
import com.discover.program.entity.StudentDto;
import com.discover.program.mapper.MapStructer;

@SpringBootTest

 class StudentTest {

	 @Mock
	    private IStudentDao istudentDao;
	
	 @InjectMocks
	    private StudentDaoImpl studentDaoImpl;
	 
		@Autowired
		private MapStructer mapper;
	 
   /*  @Test
     public void updateBookbyid() {
        StudentDto student = new StudentDto(100,8953,"INSPRING",'A');
        when(istudentDao.addStudent(student).thenReturn("student has been updated");
        assertEquals("Student has been updated", istudentDao.addStudent(student ));
        
     }*/
	 
	 
/*	 
	 @Test
	    void addStudent() throws Exception{
		 StudentDto student=new StudentDto();
		 student.setId(1);
		 student.setMobileno(8953);
		 student.setName("Harry");
		 student.setGrade('A');
	        String val=mapper.writeValueAsString(student);
	        Mockito.when(istudentDao.addItem(any())).thenReturn(1);
	        mockMvc.perform(post("/app1/students").content(val).contentType(MediaType.APPLICATION_JSON_VALUE)
	                .accept(MediaType.APPLICATION_JSON)).andDo(print());
	    }
	 */
	 @Test
    void deleteBookbyid() {
		 Student student = new Student(100,8953,"AB",'A');
        when(istudentDao.removeStudent(3)).thenReturn(1);
        assertEquals(1, istudentDao.removeStudent(3));
        
     }
	
}












 
    
    
    

     
   
     


