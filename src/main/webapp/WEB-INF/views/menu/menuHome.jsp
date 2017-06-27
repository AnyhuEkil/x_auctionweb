<%@ page language="java" import="java.util.*" contentType="text/html; charset=UTF-8"
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
<title>MenuHome</title>
<script src="https://code.jquery.com/jquery-3.2.1.js"></script>
<script type="text/javascript">
	$(document).ready(function() {
		
	});
</script>
<style type="text/css">
</style>
</head>
<body>
	<div>
		<c:import url="../main/header.jsp" />
	</div>
	<br>
	<br>
	<br>
	<!-- 공지,마이페이지,판매페이지 -->
	<c:if test="${paramPage01 == 'menuList' }">
		<jsp:include page="main/menuList.jsp" flush="false"/>
	</c:if>
	<!-- myPage메뉴 입찰정보/쪽지함/낙찰배송/주소지/신용카드/회원정보 순서-->
	<c:if test="${paramPage01 == 'myPage/auctionInfo' }">
		<jsp:include page="myPage/auctionInfo.jsp" flush="false"/>
	</c:if>
	<c:if test="${paramPage01 == 'myPage/message' }">
		<jsp:include page="myPage/message.jsp" flush="false"/>
	</c:if>
	<c:if test="${paramPage01 == 'myPage/getInfo' }">
		<jsp:include page="myPage/getInfo.jsp" flush="false"/>
	</c:if>
	<c:if test="${paramPage01 == 'myPage/locationInfo' }">
		<jsp:include page="myPage/locationInfo.jsp" flush="false"/>
	</c:if>
	<c:if test="${paramPage01 == 'myPage/userPayment' }">
		<jsp:include page="myPage/userPayment.jsp" flush="false"/>
	</c:if>
	<c:if test="${paramPage01 == 'myPage/userInfo' }">
		<jsp:include page="myPage/userInfo.jsp" flush="false"/>
	</c:if>

<!-- TODO 공지 및 판매자 정보도 이렇게?? -->
	<div>
		<!-- TODO c:import 로 변경 -->
		<h1>사이트맵</h1>
	</div>
</body>
</html>