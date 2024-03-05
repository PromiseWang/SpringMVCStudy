package org.example.requestmapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Author: Promise
 * Date: 2024-03-03 14:16
 * Description:
 * 类上和方法上添加@RequestsMapping区别
 *      类上是提取通用方法的地址(非必须)
 *      方法上是具体的handler地址(必须)
 *      如下方代码, 如果想访问/user路径, 那么直接写@RequestMapping不加参数即可
 */

@Controller
@RequestMapping("/user")
public class UserController {
    @RequestMapping(value = "/login", method = {RequestMethod.GET, RequestMethod.POST})  // 作用注册地址, 将handler注册到handlerMapping上
    public String login() {
        return null;
    }

    // @RequestMapping(value = "/register", method = RequestMethod.POST)
    @PostMapping("register")
    public String register() {
        return null;
    }

    // @RequestMapping
    @GetMapping
    public String index() {
        return null;
    }
}
