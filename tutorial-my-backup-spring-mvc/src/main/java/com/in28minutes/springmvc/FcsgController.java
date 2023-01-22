package com.in28minutes.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class FcsgController {

    @RequestMapping(value="/fcsg")
    @ResponseBody
    public String sayHello() {
        return "Hopp St. Galle";
    }
}
