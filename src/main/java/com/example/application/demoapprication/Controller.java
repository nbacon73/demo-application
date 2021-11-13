package com.example.application.demoapprication;


import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
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
            @Validated @ModelAttribute RequestModel requestModel
    ) {
        modelAndView.addObject("data", service.getData(requestModel));
        modelAndView.setViewName("index");
        return modelAndView;
    }

}
