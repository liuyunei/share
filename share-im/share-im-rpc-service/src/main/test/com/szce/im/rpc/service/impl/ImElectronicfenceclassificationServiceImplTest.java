package com.szce.im.rpc.service.impl;

import com.szce.im.dao.model.ImElectronicfenceclassification;
import com.szce.im.rpc.api.ImElectronicfenceclassificationService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @Auther: spy
 * @Date: 2018/7/17 16:48
 * @Description:
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:META-INF/spring/*.xml"})
public class ImElectronicfenceclassificationServiceImplTest {
    @Autowired
    private ImElectronicfenceclassificationService imElectronicfenceclassificationService;

    @Test
    public void insert(){
        ImElectronicfenceclassification imElectronicfenceclassification = null;
        for (int i=0; i<10; i++){
            imElectronicfenceclassification = new ImElectronicfenceclassification();
            imElectronicfenceclassification.setElectronicfenceclassificationid(System.currentTimeMillis()+"");
            imElectronicfenceclassification.setElectronicfenceclassificationname("电子围栏分类名"+i);
            imElectronicfenceclassificationService.insert(imElectronicfenceclassification);
        }
    }


    @Test
    public void update(){
        ImElectronicfenceclassification imElectronicfenceclassification = new ImElectronicfenceclassification();
        imElectronicfenceclassification.setElectronicfenceclassificationid("1531875204592");
        imElectronicfenceclassification.setElectronicfenceclassificationname("分类名5");
        int result = this.imElectronicfenceclassificationService.updateByIdSelective(imElectronicfenceclassification);
        System.out.println(result);
    }
}