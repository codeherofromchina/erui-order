package com.erui.order.common.config;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * @Auther 王晓丹
 * @Date 2019/7/22 上午8:49
 */
@Configuration
@ConfigurationProperties(prefix="custom")
public class CustomPropertiesConfig implements InitializingBean {
    private static CustomPropertiesConfig propertiesConfig;
    private String name;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        propertiesConfig = this;
    }
    public static CustomPropertiesConfig getPropertiesConfig() {
        return propertiesConfig;
    }
}
