package com.app.web.parasmani.Schooler.mapper;

import com.app.web.parasmani.Schooler.model.SchoolClass;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class SchoolClassMapper implements RowMapper<SchoolClass> {

    @Override
    public SchoolClass mapRow(ResultSet rs, int rowNum) throws SQLException {
        Integer schoolNo = rs.getInt("SCHOOLNO");
        Integer classNo = rs.getInt("CLASSNO");
        String className = rs.getString("CLASSNAME");
        Integer totalStudent = rs.getInt("TOTALSTUDENT");
        String classTeacherName = rs.getString("CLASSTEACHERNAME");
        Integer teacherEmployeeNo = rs.getInt("CLASSTEACHEREMPLOYEENO");

        SchoolClass schoolClass = new SchoolClass();
        schoolClass.setSchoolNo(schoolNo);
        schoolClass.setClassNo(classNo);
        schoolClass.setClassName(className);
        schoolClass.setTotalStudent(totalStudent);
        schoolClass.setClassTeacherName(classTeacherName);
        schoolClass.setClassTeacherEmployeeNo(teacherEmployeeNo);
        return schoolClass;
    }
}
