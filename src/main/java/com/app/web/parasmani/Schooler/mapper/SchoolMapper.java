package com.app.web.parasmani.Schooler.mapper;

import com.app.web.parasmani.Schooler.model.School;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class SchoolMapper implements RowMapper<School> {


    @Override
    public School mapRow(ResultSet rs, int rowNum) throws SQLException {
        String schoolName = rs.getString("SCHOOLNAME");
        Integer schoolNo = rs.getInt("SCHOOLNO");

        schoolNo = schoolNo == null ? 0 : schoolNo;
        schoolName = schoolName == null ? "": schoolName;

        System.out.println(schoolNo);
        System.out.println(schoolName);
        School school = new School();
        school.setSchoolNo(schoolNo);
        school.setSchoolName(schoolName);
        return school;
    }
}
