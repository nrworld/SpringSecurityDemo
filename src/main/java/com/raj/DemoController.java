package com.raj;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class DemoController {

    @RequestMapping("/")
    public String hello() {
        return "Hello from Spring security at " + new Date(System.currentTimeMillis());
    }
}
