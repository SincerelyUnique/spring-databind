package com.demo.validator;

import com.demo.domain.LoginUser;
import org.springframework.stereotype.Repository;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

@Repository("userValidator")
public class UserValidator implements Validator {

    public boolean supports(Class<?> aClass) {
        return LoginUser.class.isAssignableFrom(aClass);
    }

    public void validate(Object target, Errors errors) {
        ValidationUtils.rejectIfEmpty(errors,"loginname",null,"登录名不能为空");
        ValidationUtils.rejectIfEmpty(errors,"password",null,"密码不能为空");
        LoginUser loginUser = (LoginUser)target;
        if (loginUser.getLoginname().length()>10){
            errors.rejectValue("loginname",null,"用户名不能超过10个字符");
        }
        if (loginUser.getPassword()!=null
                && !loginUser.getPassword().equals("")
                && loginUser.getPassword().length()<6){
            errors.rejectValue("password",null,"密码不能小于6位");
        }
    }
}
