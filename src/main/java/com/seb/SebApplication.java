package com.seb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@SpringBootApplication
@Controller
public class SebApplication {

    @RequestMapping("/")
    public ModelAndView home() {
        return new ModelAndView("index.html");
    }

    public static void main(String[] args) {
        SpringApplication.run(SebApplication.class, args);
    }

}
