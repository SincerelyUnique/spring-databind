package com.demo.converter;

import java.beans.PropertyEditorSupport;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 方式二
 * 自定义属性编辑器
 * 使用@InitBinder添加自定义编辑器转换数据
 */
public class DateEditor extends PropertyEditorSupport{

    @Override
    public void setAsText(String text) throws IllegalArgumentException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date date = dateFormat.parse(text);
            setValue(date);
        }catch (ParseException e){
            e.printStackTrace();
        }
    }

}
