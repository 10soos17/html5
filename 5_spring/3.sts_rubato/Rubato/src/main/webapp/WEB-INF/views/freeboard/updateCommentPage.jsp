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
</head>
<body>

	<div id="wrap">
	
		<jsp:include page="../commons/header.jsp"></jsp:include>

		<section id="main">
			<img src="../resources/img/comm.gif">
			<h2 id="freeboard_title">자유 게시판</h2>
			<div id="view_title_box">
				<span id="info"><h2>제목 : ${content.freeboardVo.freeboard_title}
						작성자 : ${content.freeboardVo.freeboard_nick}</h2></span> <span>작성일 : <fmt:formatDate
						value="${content.freeboardVo.freeboard_writedate}"
						pattern="yyyy년 MM월 dd일 hh시 mm분 ss초" /> 조회수:
					${content.freeboardVo.freeboard_readcount}
				</span><br>
			</div>
			<p id="view_content">
				<c:forEach items="${content.freeboardImageVoList}" var="boardImageVo">
					<img src="/upload/${freeboardImageVo.freeboard_image_url}">
					<br>
				</c:forEach>
				<br> ${content.freeboardVo.freeboard_content}


				<!-- 2. -->
				<!-- 좋아요 표시, 카운트 -->
				<!-- 로그인 여부 -->
				<!-- 클릭 : 빨간색, / 재클릭 : 빈, -->
				<!-- db: table생성 
							ex.1번회원이 1번글 추천시 추천글 카운트+
								카운트 읽기:
								추천여부확인: select * from table where m_no="" and b_no =""; 개수 나오면 추천한것, 안나오면 추천하지 않은 것
								추천: insert ...member_no, board_no
								취소: delete from table where m_no="" and b_no="";
							-->
			<form action="./changeRecommend.do" method="post">

				<!-- 좋아 -->
			<br>
			</p>


				<!--로그인상태 && 글 소유자가 본인일 경우만 보이도록 -->
				<!-- sessionUser 값 있는가 && sessionUser의 MemberVo의 member_no, content속성에 BoardVo의 board_no 동일한가-->

			<div id="buttons">

				<!-- input type="password" name="freeboard_pw" style="display:none;"--> 
				
				<a
					href="./deleteContentProcess.do?board_no=${content.boardVo.board_no}"><img
					src="../resources/img/delete.png"></a> <a
					href="./updateContentBoard.do?board_no=${content.boardVo.board_no}">수정</a>
				<a href="./board_write.do"><img src="../resources/img/write.png"></a>
				
				<a href="./freeboard_list.do"><img
					src="../resources/img/list.png"></a>


			</div>

==
			<!-- 1. 리플 -->
			<!-- 로그인해야보이도록 할 부분 -->
			<hr>
			<form action="./updateCommentProcess.do" method="post">

				<c:forEach items="${contentfreeboardCommentVoList}"
					var="boardCommentVo">

					<br>
								|| 작성자 : ${content.freeboardCommentMemberVoList.get(content.freeboardCommentVoList.indexOf(freeboardCommentVo)).freeboard_nick}
								|| 작성일 : <fmt:formatDate
						value="${boardCommentVo.comment_writedate}"
						pattern="yyyy년 MM월 dd일 hh시 mm분 ss초" />


					<hr>

				</c:forEach>
			</form>

			<div id="buttons">
				<a href="#"><img src="../resources/img/delete.png"></a> <a
					href="./freeboard_list.do"><img src="../resources/img/list.png"></a>
				<a href="./freeboard_write.do"><img src="../resources/img/write.png"></a>
			</div>



		</section>
		<!-- section main -->

		<jsp:include page="../commons/footer.jsp"></jsp:include>
		
	</div>
	<!-- wrap -->
</body>
</html>