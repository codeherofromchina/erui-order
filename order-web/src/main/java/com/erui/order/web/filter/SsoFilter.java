package com.erui.order.web.filter;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.erui.order.common.pojo.UserInfo;
import com.erui.order.common.util.HttpRequest;
import com.erui.order.common.util.ThreadLocalUtil;
import com.erui.order.web.ConfigBeanProp;
import com.erui.order.web.util.CookiesUtil;
import org.springframework.beans.factory.annotation.Autowired;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

/**
 * @Auther 王晓丹
 * @Date 2019/9/7 下午5:35
 */
@WebFilter(filterName = "ssoFilter", urlPatterns = "/*")
public class SsoFilter implements Filter {
    @Autowired
    private ConfigBeanProp configBeanProp;
    private String loginPage = "/login?returnUrl=http://wxd.eruidev.com:8888";

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest httpRequest = (HttpServletRequest) servletRequest;
        HttpServletResponse httpResponse = (HttpServletResponse) servletResponse;


        String token = CookiesUtil.getCookieValue((HttpServletRequest) servletRequest, configBeanProp.getTokenName());

        String checkTokenResp = postCheckToken(token);
        JSONObject respObj = JSONObject.parseObject(checkTokenResp);
        // 验证token，如果失败，则返回到登录界面
        if (respObj.getIntValue("code") != 200) {
            responseWrite(httpResponse);
            return;
        }
        ThreadLocalUtil.setToken(token);
        UserInfo userInfo = new UserInfo();
        userInfo.setId(respObj.getLong("id"));
        userInfo.setUserName(respObj.getString("userName"));
        userInfo.setUserNo(respObj.getString("userNo"));
        ThreadLocalUtil.setUserInfo(userInfo);
        filterChain.doFilter(servletRequest, servletResponse);
    }


    private String postCheckToken(String token) {
        JSONObject params = new JSONObject();
        params.put("tenant", "erui");
        params.put("token", token);

        Map<String, String> header = new HashMap<>();
        header.put("Content-Type", "application/json;charset=utf-8");
        header.put("Cookie", "eruitoken=" + token);

        String resp = HttpRequest.sendPost(configBeanProp.getSsoUrl() + "/api/checkToken", params.toJSONString(), header);
        return resp;
    }


    private void responseWrite(HttpServletResponse response) {
        PrintWriter p = null;
        try {
            p = response.getWriter();
            p.write("{\"code\":403,\"message\":\"Token invalid.\"}");
            p.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
