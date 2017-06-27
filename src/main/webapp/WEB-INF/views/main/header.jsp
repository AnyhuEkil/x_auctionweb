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
<title>Header</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap-theme.min.css">
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/js/bootstrap.min.js"></script>
<script src="https://code.jquery.com/jquery-3.2.1.js"></script>
<script type="text/javascript">
	$(document).ready(function() {
	});

</script>
<style type="text/css">
</style>
</head>
<body>
	<nav class="navbar  navbar-inverse  navbar-fixed-top">
		<div class="container">
			<button type="button" class="navbar-toggle" data-toggle="collapse"
				data-target=".navbar-collapse">
				<span class="sr-only"> Toggle navigation</span> <span
					class="icon-bar"> </span> <span class="icon-bar"> </span> <span
					class="icon-bar"> </span>
			</button>

			<a class="navbar-brand" href="${path }/main.do">AUCTION</a>

			<div class="navbar-collapse collapse">
				<ul class="nav navbar-nav navbar-right">
					<c:choose>
						<c:when test="${sessionScope.mem.email == null }">
							<!-- TODO 새창 띄우기
								 onclick="window.open(this.href,'_blank','width=800,height=600, scrollbars=yes');return false;" -->
							<li class=""><a href="${path }/auctionUser/login.do">Login</a></li>
							<li class=""><a href="${path }/auctionUser/insert.do">Sign-Up</a></li>
						</c:when>
						<c:otherwise>
							<!-- TODO 테스트 나머지 삭제 -->
							<li style="color: white;">[ ${sessionScope.mem.userName } ]님
								환영합니다.</li>
							<li style="color: white;">Point : [	${sessionScope.mem.userPoint } ]</li>
							<!-- TODO 드랍다운 메뉴 만들어서 묶어야됨 -->
							<li class=""><a href="${path }/main/menuList.do">MENU</a></li>
							<!-- TODO 공지사항 및 문의 주소 변경 해야됨 -->
							<li class=""><a href="${path }/main/menuList.do">공지/문의</a></li>
							<!-- 회원정보(메뉴) : 개인정보,입찰정보,배송지정보,카드정보,쪽지함 페이지로~ -->
							<li class=""><a href="${path }/myPage/userInfo.do">회원정보(메뉴)</a>
							</li>
							<!-- 판매정보(메뉴) : 판매자 정보, 판매물품, 물품등록, 출금?? 등등..  -->
							<li class=""><a href="${path }/main/menuList.do">판매정보(메뉴)</a></li>
							<li class=""><a href="${path }/logout.do">로그아웃</a></li>
						</c:otherwise>
					</c:choose>
				</ul>
			</div>
		</div>
	</nav>
</body>
</html>