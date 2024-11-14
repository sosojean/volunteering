package com.inha.volunteer;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
//    @ResponseBody
    @GetMapping("/test")
    public String test() {
        return "<h1>test</h1>";
    }
//    @ResponseBody
    @GetMapping("/")
    public String root() {
        return "<h1>root</h1>";
    }
}
