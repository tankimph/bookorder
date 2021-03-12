package com.psybergate.bookorder.Home;

import com.psybergate.bookorder.order.BookOrder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HomeRestController {

//    @PostMapping("/login")


    @RequestMapping("/")
    @ResponseBody
    public String home() {
        return "Welcome home!";
    }
}
