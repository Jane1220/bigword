<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>用户列表页面展示</title>
</head>
<body>

<table>
	<tr>
		<td>编号</td>
		<td>用户名</td>
		<td>昵称</td>
		<td>生日</td>
		<td>注册时间</td>
		<td>操作</td>
	</tr>
	<c:forEach items="${info.list}" var="u" varStatus="i">
	<tr>
		<td>${i.count }</td>		
		<td>${u.username }</td>		
		<td>${u.nickname }</td>		
		<td>${u.birthday }</td>		
		<td>${u.created }</td>		
		<td>${u.locked==0?"正常":"停用" }</td>		
	</tr>
	</c:forEach>
	<tr>
		<td></td>
	</tr>
</table>
</body>
</html>