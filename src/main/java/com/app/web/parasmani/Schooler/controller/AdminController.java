package com.app.web.parasmani.Schooler.controller;

import com.app.web.parasmani.Schooler.dao.AdminDao;
import com.app.web.parasmani.Schooler.model.School;
import com.app.web.parasmani.Schooler.model.SchoolClass;
import com.app.web.parasmani.Schooler.model.StudentInClass;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/admin")
public class AdminController {
    @Autowired
    AdminDao adminDao;

    
    @RequestMapping(method=RequestMethod.GET,value = "/getSchool")
    public List<School>  getSchool()
    {
        return adminDao.getSchool();
    }

    @RequestMapping(method=RequestMethod.GET,value = "/getSchoolClass")
    public List<SchoolClass> getSchoolClass(@RequestParam Integer schoolNo)
    {
        System.out.println("SchoolNo:" + schoolNo);
        return  adminDao.getClasses(schoolNo);
    }

    @RequestMapping(method=RequestMethod.GET,value = "/getStudentInClass")
    public List<StudentInClass> getStudentInClass(@RequestParam Integer classNo)
    {
        return  adminDao.getStudentInClass(classNo);
    }



    @RequestMapping(method = RequestMethod.POST,value = "/makeschool")
    public School insertSchool(@RequestBody School school)
    {
        adminDao.makeSchool(school);
        return school;
    }

    @RequestMapping(method = RequestMethod.POST,value = "/addClass")
    public SchoolClass addClass(@RequestBody SchoolClass schoolClass)
    {
        adminDao.addClass(schoolClass);

        return schoolClass;
    }

    @RequestMapping(method = RequestMethod.POST,value = "/addStudentToClass")
    public StudentInClass addStudentToClass(@RequestBody StudentInClass studentInClass)
    {
        adminDao.addStudentToClass(studentInClass);

        return studentInClass;
    }

}
