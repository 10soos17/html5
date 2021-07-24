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
			<h2 id="board_title">회원 게시판</h2>
			<div id="view_title_box">
				<span id="info"><h2>제목 : ${content.boardVo.board_title}
						작성자 : ${content.memberVo.member_nick}</h2></span> <span>작성일 : <fmt:formatDate
						value="${content.boardVo.board_writedate}"
						pattern="yyyy년 MM월 dd일 hh시 mm분 ss초" /> 조회수:
					${content.boardVo.board_readcount}
				</span><br>
			</div>
			<p id="view_content">
				<c:forEach items="${content.boardImageVoList}" var="boardImageVo">
					<img src="/board_upload/${boardImageVo.image_url}">
					<br>
				</c:forEach>
				<br> ${content.boardVo.board_content}


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

				<c:choose>
					<c:when
						test="${!empty sessionUser && sessionUser.member_no != content.memberVo.member_no}">
						<input type="hidden" name="board_no"
							value="${content.boardVo.board_no}">
						<input type="hidden" name="member_no"
							value="${sessionUser.member_no}">
						<c:choose>
							<c:when test="${content.recommendCheck > 0}">
								<Button name="recommend" value="${content.recommendCheck}">
									<i class="bi bi-heart-fill fs-1"></i>
								</button>
						   						좋아요 수: ${content.recommendNo}
											</c:when>
							<c:otherwise>
								<Button name="recommend" value="${content.recommendCheck}">
									<i class="bi bi-heart text-danger fs-1"></i>
								</Button>
												좋아요 수: ${content.recommendNo}
											</c:otherwise>
						</c:choose>
					</c:when>
					<c:otherwise>
						<Button disabled>
							<i class="bi bi-heart text-danger fs-1"></i>
						</Button>
										좋아요 수: ${content.recommendNo}
									</c:otherwise>
				</c:choose>
			</form>
			<br>
			</p>




	
			<!--
						보여줄때 : board_no(board) 
						작성: 가져오기 member_no(login user session) + board_no(board) & insert(recommend)-->

			<!-- 1. 리플 -->
			<!-- 로그인해야보이도록 할 부분 -->
			<hr>
			<form action="./updateCommentProcess.do" method="post">

				<c:forEach items="${content.boardCommentVoList}"
					var="boardCommentVo">

					<c:choose>
						<c:when
							test="${sessionUser.member_no == content.boardCommentMemberVoList.get(content.boardCommentVoList.indexOf(boardCommentVo)).member_no}">
							<input type="text" name="comment_content"
								value="${boardCommentVo.comment_content}">
						</c:when>
						<c:otherwise>
							<input type="text" name="comment_content"
								value="${boardCommentVo.comment_content}" disabled>
						</c:otherwise>
					</c:choose>

					<br>
								|| 작성자 : ${content.boardCommentMemberVoList.get(content.boardCommentVoList.indexOf(boardCommentVo)).member_nick}
								|| 작성일 : <fmt:formatDate
						value="${boardCommentVo.comment_writedate}"
						pattern="yyyy년 MM월 dd일 hh시 mm분 ss초" />

					<c:if
						test="${sessionUser.member_no == content.boardCommentMemberVoList.get(content.boardCommentVoList.indexOf(boardCommentVo)).member_no}">
						<input type="hidden" name="board_no"
							value="${content.boardVo.board_no}">
						<input type="hidden" name="comment_no"
							value="${boardCommentVo.comment_no}">
						<input type="submit" value="수정">

					</c:if>

					<hr>

				</c:forEach>
			</form>

			<div id="buttons">
				<a href="#"><img src="../resources/img/delete.png"></a> <a
					href="./board_list.do"><img src="../resources/img/list.png"></a>
				<a href="./board_write.do"><img src="../resources/img/write.png"></a>
			</div>



		</section>
		<!-- section main -->

		<jsp:include page="../commons/footer.jsp"></jsp:include>
		
	</div>
	<!-- wrap -->
</body>
</html>