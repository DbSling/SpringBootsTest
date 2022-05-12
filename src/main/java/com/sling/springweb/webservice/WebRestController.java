package com.sling.springweb.webservice;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebRestController {
    @RequestMapping("/test")
    String test(){
        return "Hello Sling!!!!!";
    }
}
