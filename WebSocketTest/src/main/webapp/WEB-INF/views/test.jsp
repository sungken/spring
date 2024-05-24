<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>     
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>test</title>
<link rel="stylesheet" href="http://pinnpublic.dothome.co.kr/cdn/example-min.css">
</head>
<body>
	<!-- test.jsp -->
	<h1>WebSocket <small>기본 사용법</small></h1>
	
	
	<div>
		<button type="button" class="in" id="btn-connect">연결하기</button>
		<button type="button" class="out" id="btn-disconnect">종료하기</button>
	</div>
	
	<hr>
	
	<div>
		<input type="text" class="long" id="msg">
		<button type="button" id="btn-echo">에코 테스트</button>
	</div>
	
	<hr>
	
	<div class="message full"></div>
	
	
	<script src="https://code.jquery.com/jquery-3.7.1.js"></script>
	<script>
	
		//서버측 주소
		//const url = 'ws://echo.websocket.org'; //안됌
		//const url = 'ws://localhost:8090/websocket/server.do'; //
		const url = 'ws://192.168.10.42:8080/websocket/server.do'; //
		
		//웹소켓
		let ws;
	
		$('#btn-connect').click(() => {
			
			//1. 소켓 생성
			//2. 서버 접속(연결)
			//3. 통신
			//4. 서버 접속 종료
			
			//1. 소켓 생성 + 2. 서버 접속(연결(시도 - 상대방 응답을 기다리는 중))
			ws = new WebSocket(url);
			
			//소켓 이벤트 > 콜백
			//서버측에서 소켓 연결을 받아들이고 서로 연결이 되는 순간 발생
			ws.onopen = evt => {
				log('서버와 연결되었습니다.');
			};
			
			//상대방이 나에게 메세지를 전갈 > 수신 하는 순간 발생
			ws.onmessage = evt => {
					
				log('서버로 부터 응답받은 데이터');
				
			};
			
			ws.onclose = evt => {
				log('서버와 연결이 종료되었습니다.');
			};
			
						
			ws.onerror = evt => {
				log('에러가 발생했습니다.');
			};
			
			
		});
		
		$('#btn-disconnect').click(() => {
			
			ws.close();

		});
		
		$('#btn-echo').click(() => {
			
			//현재 연결되어 있는 서버측에게 데이터 전송하기
			//ws.send('안녕하세요.');
			ws.send($('#msg').val());
			
			log('메세지를 전송했습니다.');
		});
		
		
		function log(msg) {
			$('.message.full').prepend(`<div>[\${new Date().toLocaleTimeString()}] \${msg}</div>`);
		}
	
	</script>
</body>
</html>