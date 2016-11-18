<%--
  Created by IntelliJ IDEA.
  User: cedo
  Date: 2016/11/8
  Time: 15:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://com.dhcc.ywp/cedotaglib" prefix="cedo"%>
<jsp:useBean id="hello" class="com.dhcc.ywp.service.hello.HelloXXXServiceImpl" />
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    out.print("Your IP address is " + request.getRemoteAddr());
%>
<br />
<%=request.getRequestURI() %>
<br />
<%=request.getRequestURL() %>
<hr />
<c:out value="${hello.hello('cedo')}" /> =>

<%=hello.hello("cd")%>

<cedo:code code="this cedo 自定义标签" />
</body>
</html>
