
<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link 
rel="stylesheet" 
href="resources/css/out.css">
<script type="text/javascript" src="resources/js/jquery-3.5.1.js"></script>
<script type="text/javascript">
$(function() { //dom tree로딩후
	//alert('환영합니다.')
	$('#b1').click(function() {
		replyValue = $('#reply').val()
		$.ajax({
			url: "reply.do",
			data: {
				reply: replyValue
			},
			success: function(result) {
				alert(result)
				$("#d1").append(result);
			}
		})
	})
	$('#b2').click(function() {
		idValue = $('#id').val()
		$.ajax({
			url: "idCheck.do",
			data: {
				id: idValue
			},
			success: function(result) {
				alert(result)
				$("#d2").html(result);
			}
		})
	})
})
</script>
</head>
<body>
<form action="movie.do">
영화제목: <input type="text" name="title"><br>
영화관람료: <input type="text" name="price"><br>
<button type="submit">영화정보 제출</button>
</form>

<hr color="red">
댓글: <input type="text" id="reply">
<button id="b1">댓글달기</button>
<hr color="blue">
<div id="d1"></div> 
<hr color="red">

가입할 id: <input type="text" id="id">
<button id="b2">id중복체크</button>
<hr color="blue">
<div id="d2"></div> 


</body>
</html>



