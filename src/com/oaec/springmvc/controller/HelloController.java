package com.oaec.springmvc.controller;

import com.alibaba.fastjson.JSON;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@Controller
public class HelloController {
    @RequestMapping("/test1")
    public String test1(Model model){
        String content = "import org.springframework.web.bind.annotation.RequestMapping;";
        model.addAttribute("content",content);
        return "hello";
    }
    @RequestMapping(value = "/test2",produces = "application/json;charset=utf-8")
    @ResponseBody
    public String test2(){
        HashMap<String, Object> map = new HashMap<>();
        map.put("bookId",1);
        map.put("name","Java开发");
        map.put("price",9.9);
        return JSON.toJSONString(map);
    }
    @GetMapping(value = "/testGet" , produces = "application/json;charset=utf-8")
    @ResponseBody
    public String testGet(){
        HashMap<String, Object> map = new HashMap<>();
        map.put("method","GET");
        return JSON.toJSONString(map);
    }
    @PostMapping(value = "/testPost" , produces = "application/json;charset=utf-8")
    @ResponseBody
    public String testPost(){
        HashMap<String, Object> map = new HashMap<>();
        map.put("method","POST");
        return JSON.toJSONString(map);
    }

    @PutMapping(value = "/testPut" , produces = "application/json;charset=utf-8")
    @ResponseBody
    public String testPut(){
        HashMap<String, Object> map = new HashMap<>();
        map.put("method","PUT");
        return JSON.toJSONString(map);
    }

    @DeleteMapping(value = "/testDelete" , produces = "application/json;charset=utf-8")
    @ResponseBody
    public String testDelete(){
        HashMap<String, Object> map = new HashMap<>();
        map.put("method","DELETE");
        return JSON.toJSONString(map);
    }
}
