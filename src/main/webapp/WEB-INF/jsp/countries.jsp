<%@ page import="org.springframework.web.servlet.DispatcherServlet" %>
<%@ page import="com.dhcc.ywp.po.Country" %>
<%@ page import="java.util.List" %><%--
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
    <%=request.getAttribute(DispatcherServlet.WEB_APPLICATION_CONTEXT_ATTRIBUTE)    %>
    <hr />
    <%
        List<Country> countries = (List<Country>)request.getAttribute("countries");
        //countries.forEach(System.out::println);    //JDK8.0+
        for (int i = 0; i < countries.size(); i++) {
            out.println(countries.get(i));
            out.print("<hr />");
        }
    %>

</body>
</html>

