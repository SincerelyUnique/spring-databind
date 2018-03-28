package com.demo.controller;

import com.demo.converter.DateEditor;
import com.demo.domain.LoginUser;
import com.demo.domain.Pay;
import com.demo.domain.User;
import com.demo.validator.UserValidator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@Controller
public class UserController {

    private static final Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    @Qualifier("userValidator")
    private UserValidator userValidator;

    //方式二使用
    /*@InitBinder
    public void initBinder(WebDataBinder binder){
        binder.registerCustomEditor(Date.class,new DateEditor());
    }*/

    @RequestMapping("/{formName}")
    public String registerForm(@PathVariable String formName){
        logger.info(formName);
        return formName;
    }

    /**
     * 1. 数据转换
     * 当在实体中添加@DateTimeFormat注解时，会对前端传过来的该属性进行检测，若格式不正确，则抛出异常
     *
     * @param user 接收前端参数
     * @param model 返回给前端的数据
     * @return 页面
     */
    @PostMapping("/register")
    public String register(@ModelAttribute User user,Model model){
        logger.info("user",user);
        try {
            model.addAttribute("user",user);
            return "success";
        }catch (Exception e){
            logger.error("注册异常",e);
            return "error";
        }
    }

    /**
     * 2. 数据格式化
     *
     * @param pay
     * @param model
     * @return
     */
    @PostMapping("/formFormat")
    public String formFormat(@ModelAttribute Pay pay,Model model){
        logger.info("pay",pay);
        model.addAttribute("pay",pay);
        return "success";
    }

    /**
     * 3. 数据校验
     *
     * @param loginUser
     * @param model
     * @param errors
     * @return
     */
    @PostMapping("/login")
    public String formValidator(@ModelAttribute LoginUser loginUser, Model model, Errors errors){
        logger.info("loginUser",loginUser);
        model.addAttribute("loginUser",loginUser);
        userValidator.validate(loginUser,errors);
        if (errors.hasErrors()){
            return "loginForm";
        }
        return "success";
    }
}
