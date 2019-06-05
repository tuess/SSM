<%--
  Created by IntelliJ IDEA.
  User: tuess
  Date: 2019/6/3
  Time: 14:56
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page  isELIgnored = "false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
${requestScope.test}
    <table>
        <tr>
            <td>id</td>
            <td>姓名</td>
            <td>性别</td>
            <td>班级</td>
        </tr>
        <tr>
            <td>${requestScope.student.id}</td>
            <td>${requestScope.student.name}</td>
            <td>${requestScope.student.sex}</td>
            <td>${requestScope.student.classid}</td>
        </tr>
    </table>
</body>
</html>
