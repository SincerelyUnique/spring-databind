package com.demo.converter;

import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.support.WebBindingInitializer;
import org.springframework.web.context.request.WebRequest;

import java.util.Date;

/**
 * 方式三
 * 全局转换器，在配置文件中注入
 */
public class DateBindingInitializer implements WebBindingInitializer{

    public void initBinder(WebDataBinder binder, WebRequest request){
        binder.registerCustomEditor(Date.class,new DateEditor());
    }

}
