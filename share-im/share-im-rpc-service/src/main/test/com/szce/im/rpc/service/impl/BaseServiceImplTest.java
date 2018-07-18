package com.szce.im.rpc.service.impl;

import com.szce.im.dao.model.ImElectronicfencedata;
import com.szce.im.rpc.api.ImElectronicfencedataService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Date;

/**
 * @Auther: spy
 * @Date: 2018/7/17 22:09
 * @Description:
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:META-INF/spring/*.xml"})
public class BaseServiceImplTest {

    @Autowired
    private ImElectronicfencedataService imElectronicfencedataService;
    @Test
    public void insert() {
//        for (int i=0; i<50; i++){
//            ImElectronicfencedata imElectronicfencedata = new ImElectronicfencedata();
//            imElectronicfencedata.setElectronicfenceid(System.currentTimeMillis()+"");
//            imElectronicfencedata.setElectronicfencename("电子围栏名称"+i);
//            imElectronicfencedata.setArea(50);
//            imElectronicfencedata.setCoordinate("坐标"+i);
//            imElectronicfencedata.setCreatetime(new Date());
//            imElectronicfencedata.setLocation("位置"+i);
//            imElectronicfencedata.setStandardparkingnumber(i+10);
//            this.imElectronicfencedataService.insert(imElectronicfencedata);
//        }
            ImElectronicfencedata imElectronicfencedata = new ImElectronicfencedata();
            imElectronicfencedata.setElectronicfenceid(System.currentTimeMillis()+"");
            imElectronicfencedata.setElectronicfencename("电2222");
            imElectronicfencedata.setArea(50);
            imElectronicfencedata.setCoordinate("坐标222");
            imElectronicfencedata.setCreatetime(new Date());
            imElectronicfencedata.setLocation("位置22222");
            imElectronicfencedata.setStandardparkingnumber(10);
            this.imElectronicfencedataService.insert(imElectronicfencedata);


    }

}