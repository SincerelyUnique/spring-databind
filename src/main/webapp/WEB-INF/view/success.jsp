<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="/WEB-INF/view/taglibs.jsp"%>
<html>
<head>
    <title>Success</title>
</head>
<body>

<h3>数据转换:只有birthday输入格式类似“1992-08-12”才会回显birthday</h3>
<h4>You are success,${user.loginname},${user.birthday}</h4>

<hr/>

<h3>数据格式化：</h3>
<h4>You are success,${pay.birthday}</h4>

</body>
</html>
