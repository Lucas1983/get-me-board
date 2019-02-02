package com.gmb.main.web.application;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
public class ErrorController {

    @ExceptionHandler(Exception.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ModelAndView error(Exception e) throws Exception {

        ModelAndView mav = new ModelAndView();
        mav.addObject("ex", e);
        mav.setViewName("error");

        return mav;
    }
}
