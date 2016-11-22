<%@ page import="org.springframework.web.servlet.DispatcherServlet" %><%--
  Created by IntelliJ IDEA.
  User: cedo
  Date: 2016/11/7
  Time: 17:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>hello,***</title>
</head>
<body>
    @Spring MVC<br/>
    <%=request.getAttribute(DispatcherServlet.WEB_APPLICATION_CONTEXT_ATTRIBUTE)%>
    <hr />
    <%=request.getAttribute("countries") %>
</body>
</html>

