package com.szce.im.rpc.service.impl;

import com.szce.im.dao.model.custom.ImElectronicfencedataCustom;
import com.szce.im.rpc.api.ImElectronicfencedataService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Auther: spy
 * @Date: 2018/7/18 10:45
 * @Description:
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:META-INF/spring/*.xml"})
public class ImElectronicfencedataServiceImplTest {

    @Autowired
    private ImElectronicfencedataService imElectronicfencedataService;

    @Test
    public void getCount() {
        String search = "电子围栏名称37";
        long total = this.imElectronicfencedataService.getCount(search);
        System.out.println(total);
    }

    @Test
    public void getPage() {
        Map<String, Object> cond = new HashMap<>();
        cond.put("offset", 0);
        cond.put("limit", 10);
        String search = "";
        List<ImElectronicfencedataCustom> rows = this.imElectronicfencedataService.getPage(cond, search);
        System.out.println(rows.toString());
    }
}