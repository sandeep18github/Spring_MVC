package com.ssk.index;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {
    @GetMapping("/")
    public ModelAndView indexPage() {

        ModelAndView mav = new ModelAndView();
        mav.setViewName("index");
//        mav.setViewName("welcome");
//        mav.setViewName("wish");

        return mav;
    }
}
