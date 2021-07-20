<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>클래식기타 커뮤니티</title>
<link rel="stylesheet" type="text/css"
	href="../resources/css/common.css">
<link rel="stylesheet" type="text/css"
	href="../resources/css/header.css">
<link rel="stylesheet" type="text/css"
	href="../resources/css/footer.css">
<link rel="stylesheet" type="text/css" href="../resources/css/main.css">
		<script>

			//유효성 검사
			function frmSubmit(){
				//alert("안녕하세요");
				var frm1 = document.getElementById("frm1");

				//조건 확인: 입력 여부
				//아이디 중복 검사: 서버측에서 판단(db 때문에)
				var idText = document.getElementById("idText")
				if(idText.value == ""){
					alert("아이디를 입력해주세요~!");
					idText.focus();
					return;
				}

				var pwText = document.getElementById("pwText");
				if(pwText.value == ""){
					alert("비밀번호를 입력해주세요~!");
					pwText.focus();
					return;
				}

				var pwConfirmText = document.getElementById("pwConfirmText");
				if(pwText.value != pwConfirmText.value){
					alert("비밀번호 확인을 다시 해주세요~!");
					pwText.value = "";
					pwConfirmText.value = "";
					pwText.focus();
					return;
				}


				frm1.submit();
			}

			function checkAllHobby(){
				//배열로 받아짐
				var hobbyCheckList = document.getElementsByClassName("hobbyCheck");

				for(hobbyCheck of hobbyCheckList){
					if(hobbyCheck.checked){
						hobbyCheck.checked = false;
					}else{
						hobbyCheck.checked = true;
					}
				}
			}

		</script>

</head>
<body>
	<div id="wrap">
		<header>
			<a href="index.html"><img id="logo"
				src="../resources/img/logo.png"></a>
			<nav id="top_menu">HOME | LOGIN | JOIN | NOTICE</nav>
			<nav id="main_menu">
				<ul>
					<li><a href="board_list.html">자유 게시판</a></li>
					<li><a href="#">기타 연주</a></li>
					<li><a href="#">공동 구매</a></li>
					<li><a href="#">연주회 안내</a></li>
					<li><a href="#">회원 게시판</a></li>
				</ul>
			</nav>
		</header>
		<!-- header -->

		<aside>
			<article id="login_box">
				<img id="login_title" src="../resources/img/ttl_login.png">
				<div id="input_button">
				
					<!-- login -->
					<form action="./loginProcess.do" method="post">
					<ul id="login_input">
						<li><input type="text" name="member_id"></li>
						<li><input type="password" name="member_pw"></li>
					</ul>
					<button style="border:0px;"><img id="login_btn" src="../resources/img/btn_login.gif"></button>
					</form>
				
				</div>
				<div class="clear"></div>
				<div id="join_search">
					<a href="./joinMemberPage.do"><img src="../resources/img/btn_join.gif"></a>
					 <img src="../resources/img/btn_search.gif">
					 
				</div>
				<ul>
					<li>안녕하세요!</li>
					<li>안녕하세요!</li>
					<li>안녕하세요!</li>
					<li>안녕하세요!</li>
				</ul>
			</article>
		</aside>

		<section id="main">

		<h1>회원 가입</h1>
		<!-- db insert : 무조건 post -->
		<form id="frm1" action="./joinMemberProcess.do" method="post">
			ID : <input type="text" name="member_id" id="idText"><br>
			PW : <input type="password" name="member_pw" id="pwText"><br>
			PW 확인 : <input type="password" id="pwConfirmText"><br>
			Nick : <input type="text" name="member_nick" id=""><br>
			성별 : 
			<input type="radio" name="member_gender" id="" value="M" checked>남
			<input type="radio" name="member_gender" id="" value="F">여<br>
			생년월일 : <input type="date" name="member_birth" id=""><br>
			전화번호 : <input type="text" name="member_phone" id=""><br>
			E-Mail : <input type="text" name="member_email" id=""><br>
			취미 : <input type="button" value="전체선택" onclick="checkAllHobby()">
			<!-- joinMemberPage.do 요청시, FP_hobby_category_table db 읽어와서 Model설정, 화면에 뿌려주기 -->
			<c:forEach items="${hobbyCategoryList}" var="xxxx">
				<input name="hobby_category_no" class="hobbyCheck" value="${xxxx.hobby_category_no}" type="checkbox">${xxxx.hobby_category_name}
			</c:forEach>
			<br>
			<!--  input type="button" value="회원 가입"-->
			<!-- js로 submit 처리 -->
			<input type="button" value="회원 가입" onclick="frmSubmit()">

		</form>
		</section>
		<!-- section main -->
		<div class="clear"></div>

		<footer>
			<img id="footer_logo" src="../resources/img/footer_logo.gif">
			<ul id="address">
				<li>서울시 강남구 삼성동 1234 우 : 123-1234</li>
				<li>TEL : 031-123-1234 Email : email@domain.com</li>
				<li>COPYRIGHT (C) 루바토 ALL RIGHTS RESERVED</li>
			</ul>
			<ul id="footer_sns">
				<li><img src="../resources/img/facebook.gif"></li>
				<li><img src="../resources/img/blog.gif"></li>
				<li><img src="../resources/img/twitter.gif"></li>
			</ul>
		</footer>
		<!-- footer -->

	</div>
	<!-- wrap -->
</body>
</html>