<%--
  Created by IntelliJ IDEA.
  User: tuess
  Date: 2019/6/5
  Time: 14:30
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page  isELIgnored = "false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table align='center' border='1' cellspacing='0'>
    <tr>
        <td>id</td>
        <td>name</td>
        <td>性别</td>
        <td>编号</td>
    </tr>
    <c:forEach items="${requestScope.students}" var="c">
        <tr>
            <td>${c.id}</td>
            <td>${c.name}</td>
            <td>${c.sex}</td>
            <td>${c.classid}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
