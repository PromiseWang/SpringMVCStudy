package org.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Author: Promise
 * Date: 2024-03-01 18:03
 * Description:
 */

@Controller
public class HelloController {

    // handler: springmvc/hello  return "hello spring mvc!"
    // 对外访问的地址, 到handlerMapping注册的注解
    @RequestMapping("springmvc/hello")  // 对外访问的地址
    @ResponseBody  // 直接返回字符串给前端, 不要查找视图解析器
    public String hello() {
        System.out.println("HelloController.hello");
        return "Hello Spring MVC!";
    }
}
