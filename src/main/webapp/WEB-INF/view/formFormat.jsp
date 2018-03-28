<!--数据格式化测试页面-->
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Form Format</title>
</head>
<body>

<h3>Format Page</h3>
<form action="formFormat" method="post">
    <table>
        <tr>
            <td><label>日期类型:</label></td>
            <td><input type="text" id="birthday" name="birthday"></td>
        </tr>
        <tr>
            <td><label>整数类型:</label></td>
            <td><input type="text" id="total" name="total"></td>
        </tr>
        <tr>
            <td><label>百分数类型:</label></td>
            <td><input type="text" id="discount" name="discount"></td>
        </tr>
        <tr>
            <td><label>货币类型:</label></td>
            <td><input type="text" id="money" name="money"></td>
        </tr>
        <tr>
            <td><input type="submit" value="Commit"></td>
        </tr>
    </table>
</form>

</body>
</html>
