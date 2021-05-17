<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add Author</title>
<style><%@include file="/WEB-INF/css/home.css"%></style>
</head>
<body>

<h1>Add Author</h1>

	<div class="Form">
		<form:form action="insertAuthor" modelAttribute="author" method="POST">
		
			<p>Name: </p>  <form:input path="name"/> 
			
			<br><br><br>
			
			<p>Bio: </p>  <form:input path="bio"/>
			
			<br><br><br>	
			 
			<input type="submit" value="Add">
	
		</form:form>
	</div>

</body>
</html>