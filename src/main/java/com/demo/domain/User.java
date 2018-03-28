package com.demo.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    private String loginname;

    /**
     * 第四种方式，使用@DateTimeFormat注解
     */
    //@DateTimeFormat(pattern = "yyyy-MM-dd")
    //@DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private Date birthday;

}
