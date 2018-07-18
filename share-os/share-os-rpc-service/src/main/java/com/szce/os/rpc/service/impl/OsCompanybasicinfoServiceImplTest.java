package com.szce.os.rpc.service.impl;

import com.szce.os.dao.model.OsCompanybasicinfo;
import com.szce.os.rpc.api.OsCompanybasicinfoService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.sql.Date;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:META-INF/spring/*.xml"})
public class OsCompanybasicinfoServiceImplTest {

    @Autowired
    private OsCompanybasicinfoService osCompanybasicinfoService;

    @Test
    public void test(){
        OsCompanybasicinfo osCompanybasicinfo = new OsCompanybasicinfo();
        osCompanybasicinfo.setCompanyid("123");
        osCompanybasicinfo.setCompayname("company");

        osCompanybasicinfo.setEmail("hello@qq.com");
        osCompanybasicinfo.setRegistrationtime(new Date(System.currentTimeMillis()));
        osCompanybasicinfoService.insertSelective(osCompanybasicinfo);

    }
}