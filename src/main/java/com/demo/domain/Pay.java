package com.demo.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.NumberFormat;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Pay {

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date birthday;      //Mon Jul 06 00:00:00 CST 1992

    @NumberFormat(style = NumberFormat.Style.NUMBER,pattern = "#,###")
    private Integer total;      //2

    @NumberFormat(style = NumberFormat.Style.PERCENT)
    private Double discount;    //12%

    @NumberFormat(style = NumberFormat.Style.CURRENCY)
    private Double money;       //$12

}
