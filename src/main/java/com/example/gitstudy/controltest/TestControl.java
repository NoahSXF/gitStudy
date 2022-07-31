package com.example.gitstudy.controltest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class TestControl {
    @RequestMapping("/test1")
    public ArrayList<String> test(){
        ArrayList<String> list = new ArrayList<String>();
        list.add("test");
        list.add("马");
        list.add("3");
        list.add("4");
        list.add("5");
        list.add("6");

        System.out.println(list);
        return list;

    }
}
