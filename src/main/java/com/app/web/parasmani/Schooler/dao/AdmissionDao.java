package com.app.web.parasmani.Schooler.dao;

import com.app.web.parasmani.Schooler.Query.FeeQuery;
import com.app.web.parasmani.Schooler.model.Admission;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class AdmissionDao {
    @Autowired
    JdbcTemplate jdbcTemplate;

    public Admission takeAdmission(Admission admission)
    {
        jdbcTemplate.update(FeeQuery.TAKE_ADMISSION,
                admission.getAdmissionNo(),
                admission.getFirstName(),
                admission.getLastName(),
                admission.getFatherName(),
                admission.getClassName());

        return admission;
    }

}
