<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<title>hello</title>
</head>
<body>
	
	
	<%
	Integer id = (Integer) request.getAttribute("id");
	String name = (String)request.getAttribute("name");
	Integer salary = (Integer) request.getAttribute("id");
	
	out.println("ID"+id);
	out.println(name);
	out.println(salary);
	
	%>

</body>
</html>