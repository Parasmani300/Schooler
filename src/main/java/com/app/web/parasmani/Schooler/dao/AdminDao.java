package com.app.web.parasmani.Schooler.dao;

import com.app.web.parasmani.Schooler.Query.FeeQuery;
import com.app.web.parasmani.Schooler.mapper.SchoolClassMapper;
import com.app.web.parasmani.Schooler.mapper.SchoolMapper;
import com.app.web.parasmani.Schooler.mapper.StudentInClassMapper;
import com.app.web.parasmani.Schooler.model.School;
import com.app.web.parasmani.Schooler.model.SchoolClass;
import com.app.web.parasmani.Schooler.model.StudentInClass;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class AdminDao {
    @Autowired
    JdbcTemplate jdbcTemplate;

    @Autowired
    NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    @Value("${query.select.school}")
    private String schoolQuery;

    @Value("${query.select.studentInClass}")
    private  String queryStudentInClass;

    @Value("${query.select.schoolClass}")
    private  String schoolClass;


    public List<School> getSchool()
    {
        return  jdbcTemplate.query(schoolQuery,new SchoolMapper());
    }

    public List<SchoolClass> getClasses(Integer schoolNo)
    {
        Map<String,Object> params = new HashMap<>();
        params.put("schoolNo",schoolNo);
        return  namedParameterJdbcTemplate.query(schoolClass,params,new SchoolClassMapper());
    }

    public List<StudentInClass> getStudentInClass(Integer classNo)
    {
        Map<String,Object> params = new HashMap<>();
        params.put("cno",classNo);
        return  namedParameterJdbcTemplate.query(queryStudentInClass,params,new StudentInClassMapper());
    }


    public void makeSchool(School school)
    {
        jdbcTemplate.update(FeeQuery.MAKE_SCHOOL,school.getSchoolName(),school.getSchoolNo());
    }

    public void addClass(SchoolClass schoolClass)
    {
        jdbcTemplate.update(FeeQuery.ADD_CLASS,schoolClass.getSchoolNo(),
                schoolClass.getClassNo(),
                schoolClass.getClassName(),
                schoolClass.getTotalStudent(),
                schoolClass.getClassTeacherName(),
                schoolClass.getClassTeacherEmployeeNo()
        );

    }

    public void addStudentToClass(StudentInClass studentInClass)
    {
        jdbcTemplate.update(FeeQuery.ADD_STUDENT_TO_CLASS,
                studentInClass.getClassNo(),
                studentInClass.getClassName(),
                studentInClass.getStudentAdmnNo(),
                studentInClass.getStudentRollNo(),
                studentInClass.getFirstName(),
                studentInClass.getLastName());
    }
}
