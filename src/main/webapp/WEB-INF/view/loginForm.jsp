<!--spring的数据校验-->
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="/WEB-INF/view/taglibs.jsp"%>
<html>
<head>
    <title>测试validator接口数据校验</title>
</head>
<body>

<h3>登录页面</h3>
<!--绑定user-->
<form:form modelAttribute="loginUser" method="post" action="login">
    <table>
        <tr>
            <td>登录名：</td>
            <td><form:input path="loginname"/></td>
            <td><form:errors path="loginname" cssStyle="color: red"/> </td>
        </tr>
        <tr>
            <td>密码：</td>
            <td><form:input path="password"/></td>
            <td><form:errors path="password" cssStyle="color: red"/> </td>
        </tr>
        <tr>
            <td><input type="submit" value="提交" /></td>
        </tr>
    </table>
</form:form>

</body>
</html>
