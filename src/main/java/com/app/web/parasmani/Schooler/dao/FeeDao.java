package com.app.web.parasmani.Schooler.dao;

import com.app.web.parasmani.Schooler.Query.FeeQuery;
import com.app.web.parasmani.Schooler.model.Fee;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.time.Month;

@Repository
public class FeeDao {

    public static final Logger logger = LogManager.getLogger(FeeDao.class);

    @Autowired
    JdbcTemplate jdbcTemplate;

    public void makeMontlyFee(Fee fee)
    {
        logger.info("This is a sample check of logger info");
        logger.debug("THis is just a message using debug message");
        logger.error("This is a error message here");
        LocalDate currentDate = LocalDate.now();

        Month currentMonth = currentDate.getMonth();
        Integer year= currentDate.getYear();

        String month = String.valueOf(currentMonth);

        String query = FeeQuery.INSERT_FEE;
        jdbcTemplate.update(query,
                fee.getAdmissionNo(),fee.getFirstName(),fee.getLastName(),fee.getClassName(),fee.getMonth(),fee.getYear(),fee.getAmount());
    }
}
