package com.smile.springdemo.controller;

import com.smile.springdemo.server.AlphaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

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

    // 可以返回一个html页面

    @RequestMapping("/http")
    public void http(HttpServletRequest request, HttpServletResponse response) {
        // 获取请求数据
        // 打印请求体相关信息
        System.out.println(request.getMethod());
        System.out.println(request.getServletPath());
        Enumeration<String> enumeration = request.getHeaderNames();
        while (enumeration.hasMoreElements()) {
            String name = enumeration.nextElement();
            String value = request.getHeader(name);
            System.out.println(name + ": " + value);
        }
        System.out.println(request.getParameter("code"));

        // 返回响应数据
        response.setContentType("text/html;charset=utf-8");
        try (
                PrintWriter writer = response.getWriter();
        ) {
            writer.write("<h1>牛客网</h1>");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Get请求可以在游览器的地址栏上将参数以拼接的形式传入
    //  /student?current=1&limit=20  ?-拼接参数 &-并列条件


    //  @RequestMapping可以指定路径，也可以指定方法形式--后面使用Restful风格-写成GetMapping
    //  @RequestParam中name-解析游览器路径中指定name的值，并将其绑定到后面的变量
    //  required-是否一定要提供参数，选用false-需要指定一个默认值，它是在游览器不传入参数默认值绑定到变量
    @RequestMapping(path = "/student", method = RequestMethod.GET)
    @ResponseBody
    public String getStudents(
            @RequestParam(name = "current", required = false, defaultValue = "1") int current,
            @RequestParam(name = "limit", required = false, defaultValue = "10") int limit) {
        System.out.println(current);
        System.out.println(limit);
        return "some students";
    }


    // @PathVariable:解析以{}内的值并绑定到变量
    // /student/123
    @RequestMapping(path = "/student/{id}", method = RequestMethod.GET)
    @ResponseBody
    public String getStudent(@PathVariable("id") int id) {
        System.out.println(id);
        return "a student";
    }


    /*
    * 这里实际上springMVC的三层架构-表现层、业务层、数据访问层
    * 游览器输入的数据首先传入controller层
    * controller层将结果封装到modle并传给view
    * view进行视图解析放回html页面-dispatcherServlet（基于Thymeleaf模板引擎实现）*/

    //     响应一个html数据，并将其值解析使用Thymeleaf模板引擎进行渲染
    @RequestMapping(path = "/teacher", method = RequestMethod.GET)
    @ResponseBody
    public ModelAndView getTeacher() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("name", "张三");
        modelAndView.addObject("age", "30");
        modelAndView.setViewName("/demo/view");     //读取的是在resource的templates下路径/demo/view(文件夹名称不要写错）
        return modelAndView;
    }


    // 可以将上面的形式进行简化，直接传入model，并进行赋值操作，最后返回Thymeleaf的读取路径
    @RequestMapping(path = "/school", method = RequestMethod.GET)
    public String getSchool(Model model) {
        model.addAttribute("name", "北京大学");
        model.addAttribute("age", 80);
        return "/demo/view";
    }
}
