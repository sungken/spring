<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>     
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="http://pinnpublic.dothome.co.kr/cdn/example-min.css">
</head>
<body>
	<h1>받기</h1>
	<!-- 단일 데이터 -->
	<!-- 9번도 사용 -->
	<div>num: ${num}</div>


	<!-- 다중 데이터 -->
	
	<div>name: ${name}</div>
	<div>age: ${age}</div>
	<div>address: ${address}</div>
	
	<div>name: ${dto.name}</div>
	<div>age: ${dto.age}</div>
	<div>address: ${dto.address}</div>
	

</body>
</html>