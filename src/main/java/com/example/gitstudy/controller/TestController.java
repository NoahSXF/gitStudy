package com.example.gitstudy.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/Test")
public class TestController {
    @RequestMapping("queryList")
    public Map<String, Object> queryList() {
        Map<String, Object> map = new HashMap<>();
        map.put("张三", 18);
        map.put("李四", 20);
        return map;
    }
}
