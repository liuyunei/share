package com.szce.api.rpc;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 服务启动类
 * Created by szce on 2017/2/19.
 */
public class ShareApiRpcServiceApplication {

    private static final Logger LOGGER = LoggerFactory.getLogger(ShareApiRpcServiceApplication.class);

    public static void main(String[] args) {
        LOGGER.info(">>>>> share-api-rpc-service 正在启动 <<<<<");
        new ClassPathXmlApplicationContext("classpath:META-INF/spring/*.xml");
        LOGGER.info(">>>>> share-api-rpc-service 启动完成 <<<<<");
    }
}
