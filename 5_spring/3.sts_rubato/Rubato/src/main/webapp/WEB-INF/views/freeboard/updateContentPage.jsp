<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
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
	href="../resources/css/board_write_main.css">
	
	<script>
	//유효성 검사
	function frmSubmit() {

		var frm = document.getElementById("freeboarupdate_frm");

		//조건 확인: 입력 여부
		//아이디 중복 검사: 서버측에서 판단(db 때문에)

		var pwText = document.getElementById("pwText");
		if (pwText.value == "") {
			alert("비밀번호를 입력해주세요~!");
			pwText.focus();
			//return;
		}

		var pwConfirmText = document.getElementById("pwConfirmText");
		if (pwText.value != pwConfirmText.value) {
			alert("비밀번호 확인을 다시 해주세요~!");
			pwText.value = "";
			pwConfirmText.value = "";
			pwText.focus();
			//return;
		}

		frm.submit();
	}
	
	</script>
</head>
<body>
	<div id="wrap">

	<jsp:include page="../commons/header.jsp"></jsp:include>

		<section id="main">
			<img src="../resources/img/comm.gif">
			<h2 id="board_title">자유 게시판</h2>

			<!-- 글쓰기 폼 -->
				<form id="" action="./updateContentProcess.do" method="post">

				<div id="write_title">
					<h2>글쓰기</h2>
				</div>

				<table>
					
					<input type="hidden" name="freeboard_pw" value="${content.freeboardVo.freeboard_pw}">
				
					<tr id="name">
						<td class="col1">이름</td>
						<td class="col2">${content.freeboardVo.freeboard_nick}<!--  input type="text"--></td>
					</tr>
					<tr id="subject">
						<td class="col1">제목</td>
						<td class="col2"><input name="freeboard_title" type="text" value="${content.freeboardVo.freeboard_title}"></td>
					</tr>
					<tr id="content">
						<td class="col1">내용</td>
						<td class="col2" ><textarea name="freeboard_content">${content.freeboardVo.freeboard_content}</textarea></td>
					</tr>
					<tr id="upload">
						<td class="col1">업로드 파일</td>
						<td class="col2"><input type="text"> <input name="freeboard_files" type="file" accept="image/*" multiple></td>
					</tr>
					<tr id="pw">
						<td class="col1">비밀번호</td>
						<td class="col2"><input type="password" id="pwText"> </td>
					</tr>
					<tr id="confirmPassword">
						<td class="col1">비밀번호 확인</td>
						<td class="col2"><input type="password" id="pwConfirmText" name="this_pw"></td>
					</tr>
				</table>
				<input type="hidden" name="freeboard_no" value="${content.freeboardVo.freeboard_no}"><!-- board_no 값 넘기는 법 -->
				<div id="buttons">
					<Button><img src="../resources/img/ok.png"></Button>
					<a href="./freeboard_list.do"><img src="../resources/img/list.png"></a>
				</div>
			</form>
			
			
		</section>
		<!-- section main -->

		<jsp:include page="../commons/footer.jsp"></jsp:include>

	</div>
	<!-- wrap -->
</body>
</html>