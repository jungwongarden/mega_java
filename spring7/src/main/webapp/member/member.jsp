<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<hr color="green">
<a href = "../bbs/list3.do">bbs 검색 완료</a><br>
<a href = "list2.do">전체 회원 검색 완료</a>
<hr color="green">
<form action="one2.do">
	아이디: <input type="text" name="id"><br>
	<button type="submit">회원 검색 완료</button>
</form>
<h3 style=color:red>회원가입 내용입니다.</h3>
<form action="create2.do">
	아이디: <input type="text" name="id"><br>
	패스워드: <input type="text" name="pw"><br>
	이름: <input type="text" name="name"><br>
	전화번호: <input type="text" name="tel"><br>
	<button type="submit">회원가입 완료</button>
</form>
<hr color="green">
<form action="delete2.do">
	아이디: <input type="text" name="id"><br>
	<button type="submit">회원탈퇴 완료</button>
</form>
<hr color="green">
<form action="update2.do">
	아이디: <input type="text" name="id"><br>
	전화번호: <input type="text" name="tel"><br>
	<button type="submit">회원정보 수정 완료</button>
</form>

</body>
</html>