<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<%
	
		String data = (String)request.getAttribute("data");
	
	%>
	
	컨트롤러에서 도착한 데이터 : <%= data %>

</body>
</html>