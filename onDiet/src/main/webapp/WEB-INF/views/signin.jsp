<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>OnDiet</title>
</head>
<body>
	<center>
		<h1> 회원가입</h1>
		<form action="/controller/signin" method = "post" >
			아이디<br> <input type="text" name="id"> <br>
			비밀번호<br><input type="text" name="pass"> <br>
			이름<br><input type="text" name="name"> <br>
			나이 <br><input type="text" name="age"> <br>
			성별<br>
			<input type="radio" name="gender" value = "male"> 남성 &nbsp;
			<input type="radio" name="gender" value ="female"> 여성 <br>
			키<br>
			<select name ="height">
				<c:forEach begin="130" end="159" var="h">
					<option value = ${h}> ${h }</option>
				</c:forEach>
				<option value =160 selected="selected" > 160</option>
				<c:forEach begin="161" end="200" var="h">
					<option value = ${h}> ${h }</option>
				</c:forEach>
			</select><br>
			몸무게<br><select name ="weight">
				<c:forEach begin="30" end="49" var="h">
					<option value = ${h}> ${h }</option>
				</c:forEach>
				<option value =50 selected="selected" > 50</option>
				<c:forEach begin="51" end="180" var="h">
					<option value = ${h}> ${h }</option>
				</c:forEach>
			</select><br>
			이미지<br><input type="text" name="image" value = "no image"> <br>
			트레이너 (Y/N)<br>
			<input type="radio" name="train_yn" value = "train_y"> YES &nbsp;
			<input type="radio" name="train_yn" value ="train_n"> NO <br>
			<br><br>
			<input type="submit" value="회원가입">
		</form>
	</center>
</body>
</html>