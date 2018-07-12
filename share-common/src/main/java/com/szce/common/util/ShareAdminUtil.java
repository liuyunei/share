package com.szce.common.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.web.context.ServletContextAware;

import javax.servlet.ServletContext;

/**
 * 启动解压ShareAdmin-x.x.x.jar到resources目录
 * Created by szce on 2016/12/18.
 */
public class ShareAdminUtil implements InitializingBean, ServletContextAware {

    private static final Logger LOGGER = LoggerFactory.getLogger(ShareAdminUtil.class);

    @Override
    public void afterPropertiesSet() throws Exception {

    }

    @Override
    public void setServletContext(ServletContext servletContext) {
        LOGGER.info("===== 开始解压share-admin =====");
        String version = PropertiesFileUtil.getInstance("share-admin-client").get("share.admin.version");
        LOGGER.info("share-admin.jar 版本: {}", version);
        String jarPath = servletContext.getRealPath("/WEB-INF/lib/share-admin-" + version + ".jar");
        LOGGER.info("share-admin.jar 包路径: {}", jarPath);
        String resources = servletContext.getRealPath("/") + "/resources/share-admin";
        LOGGER.info("share-admin.jar 解压到: {}", resources);
        JarUtil.decompress(jarPath, resources);
        LOGGER.info("===== 解压share-admin完成 =====");
    }

}
