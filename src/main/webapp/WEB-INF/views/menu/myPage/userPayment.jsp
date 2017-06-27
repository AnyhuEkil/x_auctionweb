<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>userPayment</title>
<script src="https://code.jquery.com/jquery-3.2.1.js"></script>
<script type="text/javascript">
	$(document).ready(function() {
	});
</script>
<style type="text/css"></style>
</head>
<body>
	<div>
		<h3>myPage(왼쪽자리 확보 후 이 메세지 삭제)</h3>
		<jsp:include page="myPageNav.jsp" flush="false" />
	</div>
	<br>
	<form>
	<%--<input type="hidden" name="userId" value="${mem.userId }" /> --%>
		<div>
			<div>
				카드회사 : <input type="text" name="card_company" id="card_company" value="${pay.card_company }">
			</div>
			<div>
				카드번호 : <input type="text" name="serial_number" id="serial_number"	value="${pay.serial_number }">
			</div>
			<div>
				cvc번호: <input type="text" name="userName" id="userName" value="${pay.cvc }">
			</div>
			<div>
				유효기간 : <input type="text" name="userName" id="userName" value="${pay.month }">월/
				<input type="text" name="userName" id="userName" value="${pay.year }">년
			</div>
			<!-- TODO 비밀번호 넣나? -->
			<button type="button" id="confirmBtn">확인</button>
			<button type="button" id="cancleBtn">취소</button>
		</div>
	</form>
</body>
</html>