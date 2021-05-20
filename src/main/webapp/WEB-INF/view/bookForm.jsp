<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Formulario</title>

</head>
<body>

<h1>Add Book</h1>

	<div class="Form">
		<form:form action="addBook" modelAttribute="book" method="POST">
		
		<p>Nombre: </p>  <form:input path="nombre"/> <form:errors path="nombre"/>
		
		<br><br><br>
		
		<p>Apellidos: </p>  <form:input path="apellido"/>
		
		<br><br><br>
		
		<p>email: </p>  <form:input path="email"/> <form:errors path="email"/>
		
		<br><br><br>	
		 
		<input type="submit" value="Enviar">
		
		<form:hidden path="id"/>
	
		</form:form>
	</div>

</body>
</html>