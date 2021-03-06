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
	<br/>
	<br/>
	<br/>
	<br/>
	<br/>
	<br/>
	<br/>
	<br/>
	<br/>
	<!-- 공지사항 게시판위치 -->
	<c:if test="${pageName == 'notice/notice' }">
		<c:import url="notice/notice.jsp"/>
	</c:if>
	
	<!-- myPage메뉴 입찰정보/쪽지함/낙찰배송/주소지/신용카드/회원정보 순서-->
	<c:if test="${pageName == 'myPage/auctionInfo' }">
		<c:import url="myPage/auctionInfo.jsp"/>
	</c:if>
	<c:if test="${pageName == 'myPage/message' }">
		<c:import url="myPage/message.jsp"/>
	</c:if>
	<c:if test="${pageName == 'myPage/delivery' }">
		<c:import url="myPage/delivery.jsp"/>
	</c:if>
	<c:if test="${pageName == 'myPage/locationInfo'}">
		<c:import url="myPage/locationInfo.jsp"/>
	</c:if>
	<c:if test="${pageName == 'myPage/userPayment' }">
		<c:import url="myPage/userPayment.jsp"/>
 	</c:if>
	<c:if test="${pageName == 'myPage/userInfo' }">
		<c:import url="myPage/userInfo.jsp"/>
	</c:if> 

<!-- TODO 공지 및 판매자 정보도 이렇게?? -->
	<div>
		<!-- TODO c:import 로 변경 -->
		<h1>푸터 - 사이트맵</h1>
	</div>
</body>
</html>