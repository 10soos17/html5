<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>



<div id="wrap">

	<header>
		<a href="../member/index.do"><img id="logo"
			src="../resources/img/logo.png"></a>
		<nav id="top_menu">HOME | LOGIN | JOIN | NOTICE</nav>
		<nav id="main_menu">
			<ul>
				<li><a href="../freeboard/freeboard_list.do">자유 게시판</a></li>
				<li><a href="#">기타 연주</a></li>
				<li><a href="#">공동 구매</a></li>
				<li><a href="#">연주회 안내</a></li>
				<li><a href="../board/board_list.do">회원 게시판</a></li>
			</ul>
		</nav>
	</header>



	<!-- header -->
	<aside>
		<article id="login_box">

			<c:choose>
				<c:when test="${!empty sessionUser}">
					<img id="login_title" src="../resources/img/ttl_login.png">
					<div id="input_button">
						닉네임:${sessionUser.member_nick}님 <br> 환영합니다! <a
							href="../member/logoutProcess.do"><input type="button"
							value="logout"></a>
					</div>
				</c:when>
				<c:otherwise>
					<img id="login_title" src="../resources/img/ttl_login.png">
					<div id="input_button">
						<!-- login -->
						<form action="../member/loginProcess.do" method="post">
							<ul id="login_input">
								<li><input type="text" name="member_id"></li>
								<li><input type="password" name="member_pw"></li>
							</ul>
							<button style="border: 0px;">
								<img id="login_btn" src="../resources/img/btn_login.gif">
							</button>
						</form>
					</div>
					<div class="clear"></div>
					<div id="join_search">
						<a href="../member/joinMemberPage.do"><img
							src="../resources/img/btn_join.gif"></a> <img
							src="../resources/img/btn_search.gif">
					</div>
				</c:otherwise>
			</c:choose>


		</article>

		<nav id="sub_menu">
			<ul>
				<li><a href="../freeboard/freeboard_list.do">+ 자유 게시판</a></li>
				<li><a href="#">+ 방명록</a></li>
				<li><a href="#">+ 공지사항</a></li>
				<li><a href="#">+ 등업요청</a></li>
				<li><a href="#">+ 포토갤러리</a></li>
			</ul>
		</nav>

		<article id="sub_banner">
			<ul>
				<li><img src="../resources/img/banner1.png"></li>
				<li><img src="../resources/img/banner2.png"></li>
				<li><img src="../resources/img/banner3.png"></li>
			</ul>
		</article>
	</aside>