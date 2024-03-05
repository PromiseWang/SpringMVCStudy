package org.example.header;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Author: Promise
 * Date: 2024-03-04 21:42
 * Description:
 */

@Controller
@RequestMapping("header")
@ResponseBody
public class headerController {
    @GetMapping("getHeader")
    public String getHeader(@RequestHeader("Host") String host) {
        System.out.println("host = " + host);
        return host;
    }
}
