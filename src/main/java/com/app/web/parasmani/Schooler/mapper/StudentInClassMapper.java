package com.app.web.parasmani.Schooler.mapper;

import com.app.web.parasmani.Schooler.model.StudentInClass;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class StudentInClassMapper implements RowMapper<StudentInClass> {

    @Override
    public StudentInClass mapRow(ResultSet rs, int rowNum) throws SQLException {
        StudentInClass studentInClass = new StudentInClass();
        Integer classNo = rs.getInt("CLASSNO");
        String className = rs.getString("CLASSNAME");
        Integer studentRollNo = rs.getInt("STUDENTROLLNO");
        Integer studentAdmsissionNo = rs.getInt("STUDENTADMNNO");
        String firstName = rs.getString("FIRSTNAME");
        String lastName = rs.getString("LASTNAME");

        studentInClass.setClassNo(classNo);
        studentInClass.setClassName(className);
        studentInClass.setStudentRollNo(studentRollNo);
        studentInClass.setStudentAdmnNo(studentAdmsissionNo);
        studentInClass.setFirstName(firstName);
        studentInClass.setLastName(lastName);

        return studentInClass;
    }
}
