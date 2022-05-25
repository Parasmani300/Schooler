package com.app.web.parasmani.Schooler.controller;

import com.app.web.parasmani.Schooler.dao.FeeDao;
import com.app.web.parasmani.Schooler.model.Fee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/fee")
public class FeeController {

    @Autowired
    FeeDao feeDao;

    @RequestMapping(method = RequestMethod.POST,value = "/makePayment")
    public Fee makePayment(@RequestBody Fee fee)
    {
        feeDao.makeMontlyFee(fee);
        return fee;
    }
}
