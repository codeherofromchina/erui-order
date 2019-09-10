package com.erui.order.web.controller;

import com.erui.order.common.Result;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Auther 王晓丹
 * @Date 2019/8/5 上午8:55
 */
@RestController
@RequestMapping("test/data")
public class TestController {

    @RequestMapping("todoItems")
    public Result<Object> todoItems() {
        List<Map<String,String>> list = new ArrayList<>();
        for (int i = 0; i< 10; i++) {
            Map<String,String> map = new HashMap<>();
            map.put("content", "fhjgklhgjkl" + i);
            list.add(map);
        }
        Map<String,Object> data = new HashMap<>();
        data.put("rows",list);
        data.put("total",300);
        return new Result<>(data);
    }
}
