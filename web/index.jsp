<%--
  Created by IntelliJ IDEA.
  User: 13646
  Date: 2019/7/10
  Time: 9:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="path" value="${pageContext.request.contextPath}"/>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <h1><a href="${path}/testGet">GET</a></h1>
  <form action="${path}/testGet" method="get">
    <input type="submit" value="GET">
  </form>
  <form action="${path}/testPost" method="post">
    <input type="submit" value="POST">
  </form>
  <form action="${path}/testDelete" method="delete">
    <input type="submit" value="DELETE">
  </form>
  <form action="${path}/testPut" method="put">
    <input type="submit" value="PUT">
  </form>
  </body>
</html>
