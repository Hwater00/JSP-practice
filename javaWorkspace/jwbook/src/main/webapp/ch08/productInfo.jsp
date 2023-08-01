<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>사용정보 조회</title>
</head>
<body>
	<hr>
	<ul>
		<li>상품코드: ${p.id}</li>
		<li>상품명: ${p.name}</li>
		<li>제조자: ${p.maker}</li>
		<li>가격:${p.price}</li>
		<li>제조일:${p.date}</li>
	</ul>
</body>
</html>