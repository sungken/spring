<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>       
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>NonTiles</title>
<%@include file="/WEB-INF/views/inc/asset.jsp" %>
</head>
<body>
	<header>
		<h1>NonTitles</h1>
		<%@include file="/WEB-INF/views/inc/main_menu.jsp" %>	
		<%@include file="/WEB-INF/views/inc/admin_menu.jsp" %>	
	</header>
	
	<h1>관리자<small>로그</small></h1>
	
	<pre style="padding: 1rem; white-space: pre-wrap;">
	INFO : org.springframework.web.servlet.handler.SimpleUrlHandlerMapping - Mapped URL path [/resources/**] onto handler 'org.springframework.web.servlet.resource.ResourceHttpRequestHandler#0'
INFO : org.springframework.web.servlet.DispatcherServlet - FrameworkServlet 'appServlet': initialization completed in 420 ms
5월 21, 2024 11:53:03 오전 org.apache.coyote.AbstractProtocol start
INFO: 프로토콜 핸들러 ["http-nio-8090"]을(를) 시작합니다.
5월 21, 2024 11:53:03 오전 org.apache.catalina.startup.Catalina start
INFO: 서버가 [7786] 밀리초 내에 시작되었습니다.
WARN : org.springframework.web.servlet.PageNotFound - No mapping found for HTTP request with URI [/nontiles/info.do] in DispatcherServlet with name 'appServlet'
WARN : org.springframework.web.servlet.PageNotFound - No mapping found for HTTP request with URI [/nontiles/nontiles/member/info.do] in DispatcherServlet with name 'appServlet'
	
	</pre>
	
</body>
</html>








