<%@ page language="java" contentType="text/html; charset=euc-kr" pageEncoding="euc-kr" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>login</title>
</head>
<body>
	<center>
		<h1>login</h1>
		<c:if test="${!empty msg }">
			<p>  login error : ${msg } </p>
		</c:if>
		<form class ="login" action="/controller/login" method = "post" >
			&nbsp;Id<br>
			<input type="text" name="id"> <br><br>
			<br>&nbsp;Password<br>
			<input type="text" name="pass"> <br>
			<br><br>
			<input type="submit" value="로그인">
		</form>
		<br><br>
		<a href = "/controller/signin"> 회원가입 </a>
		
	</center>
</body>
</html>