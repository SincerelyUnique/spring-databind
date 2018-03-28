package com.demo.converter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.convert.converter.Converter;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 方式一
 * 这个类注入到spring mvc配置文件，通过配置进行数据转换
 */
public class StringToDateConverter implements Converter<String,Date>{

    private static final Logger logger = LoggerFactory.getLogger(StringToDateConverter.class);

    //日期类型模板
    private String datePattern;

    public void setDatePattern(String datePattern){
        this.datePattern = datePattern;
    }

    public Date convert(String date) {
        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat(this.datePattern);
            return dateFormat.parse(date);
        }catch (Exception e){
            e.printStackTrace();
            logger.error("Converter Failure");
            return null;
        }
    }
}
