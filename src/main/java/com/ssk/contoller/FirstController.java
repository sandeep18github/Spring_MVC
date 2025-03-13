package com.ssk.contoller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FirstController {
    @GetMapping("/welcome")
    public ModelAndView getMsg(){

        ModelAndView mav = new ModelAndView();

        mav.addObject("msg","welcome to Srping MVC");
        mav.setViewName("welcome");

        return mav;
    }

    @GetMapping("/greet")
    public ModelAndView getGreetMsg(){
        ModelAndView mav = new ModelAndView();
        mav.addObject("msg","Good Morning");
        mav.setViewName("greeting");


        return mav;
    }
}
