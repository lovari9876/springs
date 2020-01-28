<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

	<table width="500" cellpadding="0" cellspacing="0" border="1">
		<tr>
			<td>번호</td>
			<td>이름</td>
			<td>장소</td>
			<td>1</td>
			<td>2</td>
			<td>3</td>
			<td>4</td>
			<td>5</td>
			<td>6</td>
			<td>7</td>
			<td>8</td>
		</tr>

		<tr>
			<td>${deptEmpVO.deptno}</td>
			<td>${deptEmpVO.dname}</td>
			<td>${deptEmpVO.loc}</td>
			<c:forEach items="${empList}" var="empvo">
				<td>${empvo.empno}</td>
				<td>${empvo.ename}</td>
				<td>${empvo.job}</td>
				<td>${empvo.mgr}</td>
				<td>${empvo.hiredate}</td>
				<td>${empvo.sal}</td>
				<td>${empvo.comm}</td>
				<td>${empvo.deptno}</td>
				
			</c:forEach>
		

		<tr>
			<td colspan="5"><a href="write_view">글작성</a></td>
		</tr>
	</table>
</body>
</html>