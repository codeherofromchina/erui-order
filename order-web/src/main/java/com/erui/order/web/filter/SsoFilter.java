package com.erui.order.web.filter;

import com.erui.order.common.util.ThreadLocalUtil;
import com.erui.order.web.ConfigBeanProp;
import com.erui.order.web.util.CookiesUtil;
import org.springframework.beans.factory.annotation.Autowired;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * @Auther 王晓丹
 * @Date 2019/9/7 下午5:35
 */
@WebFilter(filterName = "ssoFilter", urlPatterns = "/*")
public class SsoFilter implements Filter {
    @Autowired
    private ConfigBeanProp configBeanProp;

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        String token = CookiesUtil.getCookieValue((HttpServletRequest) servletRequest, configBeanProp.getTokenName());
        ThreadLocalUtil.setToken(token);


    }
}
