package com.wzh.dream.web;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Eric on 2018/11/11.
 */
@Api(tags = "测试管理")
@RestController()
public class HelloController {

    @RequestMapping(value = "hello", method = RequestMethod.GET)
    @ResponseBody
    @ApiOperation(value = "获取helloWorld", notes = "根返回HelloWorld")
    public String test() {
        return "hello Jenkins";
    }
}
