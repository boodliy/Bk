package com.ygmusic.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Yan
 * @Date 2024/2/1 14:53
 */
@RestController
@RequestMapping("/hellow")
public class DefaultController {
    @GetMapping
    public String sayHolle(){
        return "欢迎你来到我的界面";
    }
}
