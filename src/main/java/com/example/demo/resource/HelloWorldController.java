package com.example.demo.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/message/v1")
public class HelloWorldController {

    /*@GetMapping("/hello")
    public String helloWorld() {
        return "\nHello World\n";
    }*/

    @GetMapping("/hello")
    public String helloName(@RequestParam(value = "name", defaultValue = "world") String name) {
        return "\nHelloWorldController " + name +"\n ";
    }
}
