<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.5.0/font/bootstrap-icons.css">
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
	function frmSubmit() {

		var frm1 = document.getElementById("frm1");

		//조건 확인: 입력 여부
		//아이디 중복 검사: 서버측에서 판단(db 때문에)

		var pwText = document.getElementById("pwText_comment");
		if (pwText.value == "") {
			alert("비밀번호를 입력해주세요~!");
			pwText.focus();
			return;
		}

		var pwConfirmText = document.getElementById("pwConfirmText_comment");
		if (pwText.value != pwConfirmText.value) {
			alert("비밀번호 확인을 다시 해주세요~!");
			pwText.value = "";
			pwConfirmText.value = "";
			pwText.focus();
			return;
		}

		frm1.submit();
	
	}


	function deleteComment(){
		var frm = document.getElementById("freeboardCommentDelete_form")

		if(document.querySelector('#comment_deleteBtn').value === '제출'){
			document.querySelector('#comment_pw_delete').style.display = 'none'
			document.querySelector('#comment_deleteBtn').value = '삭제︎'
			frm.submit();
			return;
			
		}else{
			document.querySelector('#comment_pw_delete').style.display = 'flex';
			document.querySelector('#comment_deleteBtn').value = '제출';
			return;
		}
	}
	
	function updateComment(){
		var frm = document.getElementById("freeboardCommentUpdate_form")
		
		if(document.querySelector('#comment_updateBtn').value === '제출︎'){
			document.querySelector('#comment_pw_update').style.display = 'none'
			document.querySelector('#comment_updateBtn').value = '수정'
			frm.submit();
			document.getElementById("comment_content").disabled = true;
			return;
			
		}else{
			document.querySelector('#comment_pw_update').style.display = 'flex'
			document.querySelector('#comment_updateBtn').value = '제출︎'
			document.getElementById("comment_content").disabled = false;
			return;
		}
	}
	
	
</script>
</head>
<body>

	<div id="wrap">
	
		<jsp:include page="../commons/header.jsp"></jsp:include>

		<section id="main">
			<img src="../resources/img/comm.gif">
			<h2 id="board_title">자유 게시판</h2>
			<div id="view_title_box">
				<span id="info">
					<h2>제목 : ${content.freeboardVo.freeboard_title} 작성자 :
						${content.freeboardVo.freeboard_nick}</h2>
				</span> <span>작성일 : <fmt:formatDate
						value="${content.freeboardVo.freeboard_writedate}"
						pattern="yyyy년 MM월 dd일 hh시 mm분 ss초" /> 조회수:
					${content.freeboardVo.freeboard_readcount}
				</span><br>
			</div>
			<p id="view_content">
				<c:forEach items="${content.freeboardImageVoList}"
					var="boardImageVo">
					<img src="/freeboard_upload/${boardImageVo.freeboard_image_url}">
					<br>
				</c:forEach>
				<br> ${content.freeboardVo.freeboard_content}
			</p>

			<!-- 좋아요 표시, 카운트-->

			<form action="./upRecommend.do" method="post">
				<input type="hidden" name="freeboard_no" value="${content.freeboardVo.freeboard_no}">
				<Button >
					<i class="bi bi-heart text-danger fs-1"></i>
				</Button>
				좋아요 수: ${content.freeboardVo.freeboard_recommendcount}
			</form>

			<!-- 리플 -->
			<hr>

			댓글 : 
			<br>
			<form action="./writeComment.do" method="post">
				<div id="comment_box">
				
					<!-- img id="title_comment" src="../resources/img/title_comment.gif"-->
					
					<input type="hidden" name="freeboard_no" value="${content.freeboardVo.freeboard_no}">
					<br>
					닉네임: <input type="text" name="freeboard_nick">
					<textarea name="freeboard_comment_content" rows="2" cols="10"></textarea>
					<br>
					비밀번호: <input type="password" id="pwText_comment">
					<br>
					비밀번호 확인: <input type="password" id="pwConfirmText_comment" name="freeboard_comment_pw">
					
					<Button>
						<img id="ok_ripple" src="../resources/img/ok_ripple.gif">
					</Button>
					
				</div>
			</form>
			<br><br><br>
			<hr>
			
			<c:forEach items="${content.freeboardCommentVoList}" var="freeboardCommentVo">


				
				<form id="freeboardCommentUpdate_form" action="./updateComment.do" method="post">
				
				<input type="text" id="comment_content" name="freeboard_comment_content"
					value="${freeboardCommentVo.freeboard_comment_content}"
					style="border-color: rgb(0, 0, 0, 0); background-color: rgb(0, 0, 0, 0);"
					disabled>
					<br>
							||작성자 : ${freeboardCommentVo.freeboard_nick} 
							||작성일 : <fmt:formatDate
					value="${freeboardCommentVo.freeboard_comment_writedate}"
					pattern="yyyy년 MM월 dd일 hh시 mm분 ss초" />
				
					<input type="hidden" name="freeboard_no"
						value="${freeboardCommentVo.freeboard_no}"> 
					<input
						type="hidden" name="freeboard_comment_no"
						value="${freeboardCommentVo.freeboard_comment_no}">
					<br> 비밀번호: <input type="hidden" name="this_pw" value="${freeboardCommentVo.freeboard_comment_pw}">
						
					<input type="password" id="comment_pw_update" name="freeboard_comment_pw" style="display:none;">
	
					<input type="button" id="comment_updateBtn" value="수정" onclick="updateComment()">
				</form>
				
				<form id="freeboardCommentDelete_form" action="./deleteComment.do" method="post">
				
					<input type="hidden" name="freeboard_no"
						value="${freeboardCommentVo.freeboard_no}"> 
					<input
						type="hidden" name="freeboard_comment_no"
						value="${freeboardCommentVo.freeboard_comment_no}">
					<br> 비밀번호: <input type="hidden" name="this_pw" value="${freeboardCommentVo.freeboard_comment_pw}">
						
					<input type="password" id="comment_pw_delete" name="freeboard_comment_pw" style="display:none;">
					
					<input type="button" id="comment_deleteBtn" value="삭제" onclick="deleteComment()">
			
				</form>

				<hr>

			</c:forEach>


			<div id="buttons">
				
				<a
					href="./deleteContentProcess.do?freeboard_no=${content.freeboardVo.freeboard_no}"><img
					src="../resources/img/delete.png"></a> <a
					href="./updateContentPage.do?freeboard_no=${content.freeboardVo.freeboard_no}">수정</a>
				<a href="./freeboard_write.do"><img src="../resources/img/write.png"></a>
				
				<a href="./freeboard_list.do"><img
					src="../resources/img/list.png"></a>


			</div>

		</section>
		
		<!-- section main -->

		<jsp:include page="../commons/footer.jsp"></jsp:include>

	</div>
	<!-- wrap -->
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
		crossorigin="anonymous"></script>
</body>
</html>