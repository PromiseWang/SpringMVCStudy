package org.example.cookie;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Author: Promise
 * Date: 2024-03-04 21:36
 * Description:
 */

@Controller
@RequestMapping("cookie")
@ResponseBody
public class CookieController {
    @GetMapping("data")
    public String data(@CookieValue(value = "cookieName")String value) {
        System.out.printf("value = " + value);
        return value;
    }

    @GetMapping("save")
    public String save(HttpServletResponse response) {
        Cookie cookie = new Cookie("cookieName", "root");
        response.addCookie(cookie);
        return "ok";
    }
}
