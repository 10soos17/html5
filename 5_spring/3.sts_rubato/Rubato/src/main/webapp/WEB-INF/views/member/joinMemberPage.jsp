<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
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
<link rel="stylesheet" type="text/css"
	href="../resources/css/board_left.css">
<link rel="stylesheet" type="text/css"
	href="../resources/css/board_view_main.css">

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

	<jsp:include page="../commons/header.jsp"></jsp:include>
	

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

		<jsp:include page="../commons/footer.jsp"></jsp:include>

	</div>
	<!-- wrap -->
</body>
</html>