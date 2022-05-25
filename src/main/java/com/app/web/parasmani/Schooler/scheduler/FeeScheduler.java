package com.app.web.parasmani.Schooler.scheduler;

import com.app.web.parasmani.Schooler.dao.FeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

@Configuration
@EnableScheduling
public class FeeScheduler {

    @Autowired
    FeeDao feeDao;

    @Scheduled(cron = "0 15 14 10 * ?")
    public void scheduleFee()
    {
//        feeDao.makeMontlyFee();
//        System.out.print("Hello");
    }
}
