package com.szce.upms.rpc;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 服务启动类
 * Created by szce on 2017/2/3.
 */
public class ShareUpmsRpcServiceApplication {

	private static final Logger LOGGER = LoggerFactory.getLogger(ShareUpmsRpcServiceApplication.class);

	public static void main(String[] args) {
		LOGGER.info(">>>>> share-upms-rpc-service 正在启动 <<<<<");
		new ClassPathXmlApplicationContext("classpath:META-INF/spring/*.xml");
		LOGGER.info(">>>>> share-upms-rpc-service 启动完成 <<<<<");
	}

}
