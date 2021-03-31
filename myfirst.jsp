<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@page import="java.util.*"%> 
<%@page import="java.time.*"%>  
  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<b>Current Date =</b>
<%LocalDate d=LocalDate.now();
out.print(d);
%>
<br>
<b>Current Time =</b>
<%LocalTime e=LocalTime.now();
out.print(e);
%>

<p>type no for factorial</p>
<form action="fact">
<input type="number" id="fact" name="fact">
<button id="sub" >Submit</button>
</form>
</body>
</html>