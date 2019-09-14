package com.erui.order.web.filter;

import org.apache.commons.lang3.time.DateFormatUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.annotation.Order;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Date;
import java.util.Enumeration;

/**
 * Created by Wang Xiaodan on 17/10/21.
 */
@WebFilter(filterName = "crossDomainFilter", urlPatterns = "/*")
@Order(1)
public class CrossDomainFilter implements Filter {

    private static final Logger LOGGER = LoggerFactory.getLogger(CrossDomainFilter.class);

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response,
                         FilterChain chain) throws IOException, ServletException {
        try {
            HttpServletRequest httpRequest = (HttpServletRequest) request;
            HttpServletResponse httpResponse = (HttpServletResponse) response;
            // 打印全部header头
            printAllHeader(httpRequest);
            // 跨域
            String origin = httpRequest.getHeader("Origin");
            httpResponse.addHeader("Access-Control-Allow-Origin", origin);
            httpResponse.addHeader("Access-Control-Allow-Headers", "Origin, X-Requested-With, Content-Type, Accept, X-Cookie, token, eruitoken");
            httpResponse.setHeader("Access-Control-Allow-Credentials", "true");
            httpResponse.addHeader("Access-Control-Allow-Methods", "GET,POST,PUT,OPTIONS,DELETE");
            if (httpRequest.getMethod().equals("OPTIONS")) {
                httpResponse.setStatus(HttpServletResponse.SC_OK);
                return;
            }
            chain.doFilter(httpRequest, httpResponse);
        } catch (Exception e) {
            LOGGER.error("Exception in CrossDomainFilter.doFilter", e);
            throw e;
        }
    }

    @Override
    public void destroy() {
    }

    /**
     * 打印全部header头内容
     *
     * @param httpRequest
     */
    private void printAllHeader(HttpServletRequest httpRequest) {
        Enumeration<String> headerNames = httpRequest.getHeaderNames();
        while (headerNames.hasMoreElements()) {
            String name = headerNames.nextElement();
            String value = httpRequest.getHeader(name);
            LOGGER.info("[header] {} -> {}", name, value);
        }

    }
}