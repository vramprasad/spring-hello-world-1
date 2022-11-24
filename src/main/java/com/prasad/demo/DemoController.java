package com.prasad.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class DemoController {

    @RequestMapping("/hello")
    String sayHello() {
        return "Hello World";
    }

}
