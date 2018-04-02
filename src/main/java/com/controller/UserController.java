package com.controller;

import com.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

/**
 * @author 73598.
 * @Date 2018/4/2 0002.
 * @Time 11:13.
 */
@Controller
@RequestMapping("/client")
//@RestController 的意思就是controller里面的方法都以json格式输出
public class UserController {
    @Autowired
    RestTemplate restTemplate;


    @GetMapping("/test1")
    @ResponseBody
    public User getTest1(){
        User forObject = restTemplate.getForObject("http://localhost:8080/Test/test1", User.class);
//        System.out.println("123");
        return  forObject;
//        System.out.println("123");
//        return "test2"+"123";
    }
    @GetMapping("/test2")
    @ResponseBody
    public String getTest2(){
        return "test2";
    }
}
