package com.erui.order.web;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * @Auther 王晓丹
 * @Date 2019/9/7 下午5:13
 */
@Component
@ConfigurationProperties(prefix = "web")
@PropertySource(value = "config.properties")
public class ConfigBeanProp {

    private String tokenName;


    public String getTokenName() {
        return tokenName;
    }

    public void setTokenName(String tokenName) {
        this.tokenName = tokenName;
    }
}
