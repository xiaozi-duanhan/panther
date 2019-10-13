<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table border="1">
	<tr>
		<th>编号(id)</th>
		<th>用户名(name)</th>
		<th>密码(password)</th>
	</tr>
	<c:forEach items="${goodsList }" var="goods">
	<tr align="center">
		<td>${goods.id }</td>
		<td>${goods.name }</td>
		<td>${goods.password }</td>
	</tr>
	</c:forEach>
	<tr>
		<td colspan="5">
			<a href="list?capge=1">首页</a>
			<a href="list?cpage=${cpage-1 }">上一页</a>
			<a href="list?capge=${cpage+1 }">下一页</a>
			<a href="list?capge=${pages }">尾页</a>
		</td>
	</tr>
</table>
</body>
</html>