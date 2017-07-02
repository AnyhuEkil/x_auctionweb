<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<fmt:requestEncoding value="UTF-8" />
<c:set var="path" value="${pageContext.request.contextPath}" />
<%
	request.setCharacterEncoding("UTF-8");
	String path = request.getContextPath();
%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>SignUp</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap-theme.min.css">
<script src="https://code.jquery.com/jquery-3.2.1.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/js/bootstrap.min.js"></script>
<script type="text/javascript">
	$(document).ready(function() {
		$("#signBtn").click(function() {
			var email = $("#email").val();
			var password = $("#password").val();
			var password2 = $("#password2").val();
			if (email == "") {
				alert("E-mail을 입력하세요");
				$("#email").focus();
				return;
			}
			if (password == "") {
				alert("비밀번호를 입력하세요.");
				$("#password").focus();
				return;
			}
			if (password != password2) {
				alert("비밀번호가 일치하지 않습니다.");
				$("#password2").focus();
				return;
			}
			$("form").attr("action", "${path}/auctionUser/signUpProc.do");
			$("form").submit();
		});
	});
</script>
<style type="text/css">
</style>
</head>
<body>
	<c:import url="../main/header.jsp" />
	<br>
	<br>
	<br>
	<br>
	<form class="form-horizontal" method="post">
		<fieldset>
			<!-- Form Name -->
			<legend>회원가입</legend>
			<!-- Text input-->
			<div class="form-group">
				<label class="col-md-4 control-label" for="email">E-mail</label>
				<div class="col-md-2">
					<input id="email" name="email" type="text"
						placeholder="E-mail을 입력하세요." class="form-control input-md">
				</div>
				<div>
					<input type="button" value="중복확인" />
					(미구현)+알림창 사용가능여부
				</div>
			</div>

			<!-- Text input-->
			<div class="form-group">
				<label class="col-md-4 control-label" for="user_name">USER_NAME</label>
				<div class="col-md-2">
					<input id="user_name" name="user_name" type="text"
						placeholder="이름을 입력하세요." class="form-control input-md">
				</div>
			</div>

			<!-- Password input-->
			<div class="form-group">
				<label class="col-md-4 control-label" for="password">PASSWORD</label>
				<div class="col-md-2">
					<input id="password" name="password" type="password"
						placeholder="비밀번호를 입력하세요" class="form-control input-md">
				</div>
			</div>

			<!-- Password input-->
			<div class="form-group">
				<label class="col-md-4 control-label" for="password2">REPEAT
					PASSWORD</label>
				<div class="col-md-2">
					<input id="password2" type="password" placeholder="비밀번호를 다시 입력하세요."
						class="form-control input-md">
				</div>
			</div>
			<div>
				<label class="col-md-4 control-label" for="signUpCode">인증번호(미구현)</label>
				<div class="col-md-2">
					<input id="signUpCode" type="text" placeholder="인증번호"
						class="form-control input-md">
				</div>
				<div>
					<input type="button" value="인증번호발송" />
					(API)//발송->카운트다운+재발송
				</div>
			</div>
			<!-- Button -->
			<br/>
			<div class="form-group">
				<label class="col-md-4 control-label" for="submit"></label>
				<div class="col-md-4">
					<button id="signBtn" name="button" class="btn btn-primary">회원가입</button>
				</div>
			</div>
		</fieldset>
	</form>
</body>
</html>