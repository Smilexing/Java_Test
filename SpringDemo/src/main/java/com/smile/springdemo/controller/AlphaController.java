package com.smile.springdemo.controller;

import com.smile.springdemo.server.AlphaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author Tom Smile
 * @version 1.0
 * @description: TODO
 * @date 2024/5/18 11:03
 */
@Controller
@RequestMapping("api")
public class AlphaController {
    @Autowired
    private AlphaService alphaService;

    @RequestMapping("/data")
    @ResponseBody   // 请求头以json、xml形式解析
    public String getData() {
        return alphaService.find();
    }
}
