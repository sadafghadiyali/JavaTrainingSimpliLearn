<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.Date" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Hello from HTML</h1>
	<%= "<h1> Hello from JSP </h1>" %>
	
	<%
		int x=10;
	%>
	
	<input type="text" value="<%= x %>" /><br/>
	
	<%
		for(int i=0;i<5;i++){
			out.print("i = "+i+"<br/>");
		}
	%>
	
	<form action="">
		<input type="text" name="fname" />
		<input type ="submit" name="click" value="Click me" />
		
	</form>
	
	<%
		if(request.getParameter("click") !=null){
			out.print("Hello "+request.getParameter("fname")+"<br/>");
		}
	%>
	
	Current date is <%= new Date()	%>
	
	<%@include file="footer.html" %>
</body>
</html>