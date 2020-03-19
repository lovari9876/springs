<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
	<%-- NAME: ${member.name } --%>
	ID: ${member.id}
	<br> PW: ${member.pw}
	<%-- Email: ${member.email} --%>
	<!-- Member class에 없는 것은 안되지만 있는 값은 저절로 객체 생성하여 저장된다. -->
</body>
</html>