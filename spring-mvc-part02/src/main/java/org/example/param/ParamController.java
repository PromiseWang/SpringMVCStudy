package org.example.param;

import jakarta.ws.rs.POST;
import org.example.pojo.Person;
import org.example.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Author: Promise
 * Date: 2024-03-03 15:19
 * Description:
 */

@Controller
@RequestMapping(value = "/param", produces = "text/plain;charset=UTF-8")
public class ParamController {
    // 1. 直接接收
    // URL:  /param/data?name=root&age=18
    @GetMapping("/data")
    @ResponseBody
    public String data(String name, int age) {
        System.out.println("name = " + name + ", age = " + age);
        return "name = " + name + ", age = " + age;
    }

    // 2. 注解指定
    // URL:  /param/data1?account=root&page=1
    // 其中account参数为必须传递, page是非必须传递(但是需要有一个默认值)
    @GetMapping("/data1")
    @ResponseBody
    public String data1(@RequestParam(value = "account") String username,
                        @RequestParam(required = false, defaultValue = "1") int page) {
        System.out.println("account(username) = " + username + ", page = " + page);
        return "account(username) = " + username + ", page = " + page;
    }


    // 3. 特殊值
    // 一名多值   key=1&key=2  直接使用集合值即可
    // URL:   /param/data2?hobbies=唱&hobbies=跳&hobbies=rap&hobbies=篮球
    @GetMapping("/data2")
    @ResponseBody
    public String data2(@RequestParam List<String> hobbies) {
        System.out.println("hobbies = " + hobbies);
        return hobbies.toString();
    }

    // 4. 实体类
    // 用实体类接收值
    // URL:   /param/data3?name=zhangsan&age=18
    @GetMapping("/data3")
    @ResponseBody
    public String data3(User user) {
        System.out.println("user = " + user);
        return user.toString();
    }

    @PostMapping("/json")
    @ResponseBody
    public String data4(@RequestBody Person person) {
        System.out.println("person = " + person);
        return person.toString();
    }


}
