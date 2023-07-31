<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<jsp:useBean id="calc" class="ch07.Calculator"/>
<jsp:useProperty name="calc" property="*"/>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>useBean</title>
</head>
<body>
    <h1>계산 결과</h1>
    <hr>
    결과: <%=calc.calc() %>
</body>
</html>
