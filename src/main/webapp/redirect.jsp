<%--
  Created by IntelliJ IDEA.
  User: cedo
  Date: 2016/11/7
  Time: 17:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<jsp:useBean id="hello" class="com.dhcc.ywp.service.HelloXXXServiceImpl" />
<html>
<head>
    <title>hello,***</title>
</head>
<body>
    <%
        response.sendRedirect("http://CEDO-PC:8080/index.jsp");
    %>
</body>
</html>

