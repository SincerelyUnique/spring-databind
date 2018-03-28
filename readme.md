# Spring MVC数据转换、格式化和数据校验

>主要是对接收数据进行处理、格式化、校验。

1. 数据转换：两种方式。第一种是配置一个名为conversionService的Bean，通过conversion-service引用，同时这个Bean里引入StringToDateConverter类，默认实现对前端接收的Date类型做转换；第二种是直接在Controller中使用@InitBinder注解注册全局自定义编辑器做数据转换，需要自定义属性编辑器DateEditor

2. 数据格式化：包括日期、百分比、货币类型、整数等。

3. 数据校验：validator。

参考：《Spring+Mybatis企业应用实战》第六章