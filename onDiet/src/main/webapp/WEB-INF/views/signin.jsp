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
		<h1> ȸ������</h1>
		<form action="/controller/signin" method = "post" >
			���̵�<br> <input type="text" name="id"> <br>
			��й�ȣ<br><input type="text" name="pass"> <br>
			�̸�<br><input type="text" name="name"> <br>
			���� <br><input type="text" name="age"> <br>
			����<br>
			<input type="radio" name="gender" value = "male"> ���� &nbsp;
			<input type="radio" name="gender" value ="female"> ���� <br>
			Ű<br>
			<select name ="height">
				<c:forEach begin="130" end="159" var="h">
					<option value = ${h}> ${h }</option>
				</c:forEach>
				<option value =160 selected="selected" > 160</option>
				<c:forEach begin="161" end="200" var="h">
					<option value = ${h}> ${h }</option>
				</c:forEach>
			</select><br>
			������<br><select name ="weight">
				<c:forEach begin="30" end="49" var="h">
					<option value = ${h}> ${h }</option>
				</c:forEach>
				<option value =50 selected="selected" > 50</option>
				<c:forEach begin="51" end="180" var="h">
					<option value = ${h}> ${h }</option>
				</c:forEach>
			</select><br>
			�̹���<br><input type="text" name="image" value = "no image"> <br>
			Ʈ���̳� (Y/N)<br>
			<input type="radio" name="train_yn" value = "train_y"> YES &nbsp;
			<input type="radio" name="train_yn" value ="train_n"> NO <br>
			<br><br>
			<input type="submit" value="ȸ������">
		</form>
	</center>
</body>
</html>