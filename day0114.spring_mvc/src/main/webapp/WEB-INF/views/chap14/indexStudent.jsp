<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>

	<%
		String context = request.getContextPath();
		// 경로이므로 /ex 이다
	%>

	<!-- 설정한 주소를 써줘야함. 실제 파일 위치말고! -->
	<form action="<%=context%>/board/studentView" method="post">
		이름 : <input type="text" name="id"><br /> 나이: <input
			type="text" name="id"><br /> 학년: <input type="text"
			name="id"><br /> 반: <input type="text" name="id"><br />
		<input type="submit" value="전송">
	</form>
</body>
</html>