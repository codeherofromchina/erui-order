package com.erui.order.page.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Auther 王晓丹
 * @Date 2019/8/18 上午7:39
 */
@Controller
@RequestMapping("/")
public class IndexController {

    @RequestMapping("/")
    public String index() {
        return "forward:/index.html";
    }
}
