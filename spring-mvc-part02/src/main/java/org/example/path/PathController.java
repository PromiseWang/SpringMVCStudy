package org.example.path;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * Author: Promise
 * Date: 2024-03-03 20:11
 * Description:
 */

@Controller
@RequestMapping(value = "/path", produces = "text/plain;charset=UTF-8")
public class PathController {

    // URL:  path/账号/密码
    // 动态路径设计
    @ResponseBody
    @GetMapping(value = "/{account}/{password}")  // 使用大括号
    public String login(@PathVariable("account") String account,
                        @PathVariable("password") String password) {
        System.out.println("account = " + account + ", password = " + password);
        return "account = " + account + ", password = " + password;
    }
}
