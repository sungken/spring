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
	<h1>Code <small>글 쓰기</small> </h1>
	
	<form method="post" action="/code/addok.do">
		<table>
			<tr>
				<th>제목</th>
				<td><input type="text" name="subject" required class="full"></td>
			</tr>
			<tr>
				<th>코드</th>
				<td><textarea name="code" required class="full"></textarea></td>
			</tr>
			<tr>
				<th>언어</th>
				<td>
					<select name="language">
						<option value="java">java</option>
						<option value="sql">sql</option>
						<option value="html">html</option>
					</select>
				</td>
			</tr>
		</table>
		<div>
			<button type="button" class="back" onclick="location.href='/code/list.do';">돌아가기</button>
			<button type="submit" class="add">추가하기</button>
		</div>
	</form>

</body>
</html>