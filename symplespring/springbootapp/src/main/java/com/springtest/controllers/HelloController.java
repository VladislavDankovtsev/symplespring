package com.springtest.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import ru.dankovtsev.MainSikulixStartParkomatic;

@Controller
public class HelloController {

    @RequestMapping("/")
    @ResponseBody
    String hello() {
        boolean ch = false;
        ch= MainSikulixStartParkomatic.checkLOgInLK();

        return "Hello World! "+ch;
    }
}