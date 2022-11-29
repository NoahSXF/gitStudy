package com.example.gitstudy.service;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
@Service
public class InfoServiceImpl implements InfoService{
    @Override
    public Map<String, Object> queryInfo() {
        Map<String, Object> map = new HashMap<>();
        map.put("param","service");
        return map;
    }
}
