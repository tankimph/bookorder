package com.psybergate.bookorder.Home;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HomeRestController {

    @RequestMapping("/")
    @ResponseBody
    public String home() {
        return "Welcome home!";
    }
}
