package com.swg.missyou.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author swg.
 * @Date 2020/6/14 20:59
 * @CONTACT 317758022@qq.com
 * @DESC
 */
@RestController
@RequestMapping("test")
public class TestController {

    @RequestMapping("hello")
    public String hello(){
        return "hello world fossi!";
    }

}
