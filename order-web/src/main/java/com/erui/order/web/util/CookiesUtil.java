package com.erui.order.web.util;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.util.WebUtils;

import javax.servlet.ServletRequest;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

/**
 * SSO的token工具
 * Created by wangxiaodan on 2018/2/28.
 */
public class CookiesUtil {
    private static final Logger LOGGER = LoggerFactory.getLogger(CookiesUtil.class);

    /**
     * 获取sso的token
     *
     * @param request
     * @return
     */
    public static String getCookieValue(ServletRequest request, String name) {
        String value = null;
        try {
            HttpServletRequest httpRequest = (HttpServletRequest) request;
            // 获取cookie
            Cookie cookie = WebUtils.getCookie(httpRequest, name);
            if (cookie != null) {
                LOGGER.info("cookie - {} - {} ", name, cookie.getValue());
                return cookie.getValue();
            }
            // 如果cookie中不存在,则获取header中的值
            value = httpRequest.getHeader(name);
        } catch (Exception ex) {
            LOGGER.error("获取cookie异常 - {} - {} ", name, ex);
        }
        LOGGER.info("cookie - {} - {} ", name, StringUtils.defaultIfBlank(value, ""));
        return name;
    }


}
