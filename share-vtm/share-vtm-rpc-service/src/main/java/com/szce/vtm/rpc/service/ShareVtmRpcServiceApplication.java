package com.szce.vtm.rpc.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 服务启动类
 * Created by szce on 2018/7/13.
 */
public class ShareVtmRpcServiceApplication {

	private static final Logger LOGGER = LoggerFactory.getLogger(ShareVtmRpcServiceApplication.class);

	public static void main(String[] args) {
		LOGGER.info(">>>>> share-vtm-rpc-service 正在启动 <<<<<");
		new ClassPathXmlApplicationContext("classpath:META-INF/spring/*.xml");
		LOGGER.info(">>>>> share-vtm-rpc-service 启动完成 <<<<<");
	}

}
