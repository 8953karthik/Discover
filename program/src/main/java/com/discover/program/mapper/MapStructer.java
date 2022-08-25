package com.discover.program.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

import com.discover.program.entity.Student;
import com.discover.program.entity.StudentDto;


@Mapper(componentModel = "spring",unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface MapStructer {

    MapStructer INSTANCE=Mappers.getMapper(MapStructer.class);

    StudentDto studentToStudentDto(Student student);  //converting to Vo to Dao
    Student studentDtoToStudent(StudentDto studentDto); 
}
