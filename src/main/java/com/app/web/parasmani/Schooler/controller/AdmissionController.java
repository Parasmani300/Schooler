package com.app.web.parasmani.Schooler.controller;

import com.app.web.parasmani.Schooler.dao.AdmissionDao;
import com.app.web.parasmani.Schooler.model.Admission;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/school")
public class AdmissionController {

    @Autowired
    AdmissionDao admissionDao;

    @RequestMapping("/admission")
    public Admission admitToSchool(@RequestBody Admission admission)
    {
        admissionDao.takeAdmission(admission);

        return admission;
    }
}
