<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="java.util.Set"%>
     <%@ page import= "com.vast.vo.Product"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<article>
<%
  Set<Product> set=(Set<Product>) request.getAttribute("Electronics");
%>
</article>

</body>
</html>