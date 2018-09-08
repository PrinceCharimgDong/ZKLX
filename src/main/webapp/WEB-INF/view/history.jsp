<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table>
		<tr>
			<td>历史信息</td>
			<td>修改日期</td>
		</tr>
		<c:forEach var="item"   items="${list}">
		<tr>
			<td>${item.reallname}</td>
			<td>${item.changedate}</td>
		</tr>
		</c:forEach>
	</table>
</body>
</html>