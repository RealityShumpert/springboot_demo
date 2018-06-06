package com.example.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class SimpleController {
    @RequestMapping("/")
    String home() {
        return "Hello World!";
    }

    @RequestMapping("/test")
    public Map<String, Object> test(){
        int i=1/0;
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("code","200");
        map.put("result","success");
        return map;
    }
}
