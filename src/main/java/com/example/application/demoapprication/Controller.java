package com.example.application.demoapprication;


import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@org.springframework.stereotype.Controller
@RequestMapping("/")
@RequiredArgsConstructor
public class Controller {

    private final Service service;

    @RequestMapping("index")
    public ModelAndView getPage(
            ModelAndView modelAndView,
            RequestModel requestModel
    ) {

        modelAndView.setViewName("index");
        return modelAndView;
    }

}
