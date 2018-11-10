package com.wzh.dream.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Eric on 2018/11/11.
 */
@RestController()
public class HelloController {

    @RequestMapping("hello")
    @ResponseBody
    public String test() {
        return "hello World";
    }
}
