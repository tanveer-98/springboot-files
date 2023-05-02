<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<%@ page isELIgnored = "false" %>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.4/jquery.min.js"></script>

<script>
$(document).ready(function(){
	$("#id").change(function(){
		$.ajax({
			url :'validateEmail',
			data : {
				id: $("#id").val()	
			},
			success: function(responseText){
				$("#errMsg").text(responseText);
				
				if(responseText!=""){
					$("#id").focus();
				}
			}
		})
		
	})
})
</script>
</head>
<body>
	<form method="post" action="registerUser">
		<pre>
  			ID : 
  			<input type="text" name="id" /><span id="errMsg"></span>
  			Name : 
  			<input type="text" name="name" />
  			Email : 
  			<input type="text" name="email" />
  			<input type="submit" name="register" />  
 		</pre>
	</form>
	
	</br>
	
	${result}
	
	
	
</body>
</html>