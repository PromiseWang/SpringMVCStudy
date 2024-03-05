package org.example.json;

import org.example.pojo.Person;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Author: Promise
 * Date: 2024-03-03 20:51
 * Description:
 */

@Controller
@RequestMapping("json")
@ResponseBody
public class JSONController {
    // data 通过请求体使用post方法


    @GetMapping("data1")
    public String data1(@RequestBody Person person) {
        System.out.println("person = " + person);
        return person.toString();
    }

}
