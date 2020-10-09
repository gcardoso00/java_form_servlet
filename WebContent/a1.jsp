
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="bootstrap.min.css">
<link rel="stylesheet" type="text/css" href="bootstrap.grid.css">
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<br><br>
	<div class="container content">
		<div class="row center">
		<div class="col-sm-10">
			
			<h3> Nome: ${name}</h3>
		
			<h3> Seu risco é ${porcent} % </h3>
	
		
	  <form action="servlet" name="return" method="get">	
			<button name="voltar" value="sim">voltar</button>
			
			
		</form>
		
		</div>
		
		</div>
	</div>


</body>
</html>