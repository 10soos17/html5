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
</head>
<body>

	<div id="wrap">
		<jsp:include page="../commons/header.jsp"></jsp:include>


		<section id="main">
			<img src="../resources/img/comm.gif">
			<h2 id="board_title">자유 게시판</h2>
			<div id="view_title_box">
				<span id="info">
					<h2>제목 : ${content.boardVo.board_title} 작성자 :
						${content.memberVo.member_nick}</h2>
				</span> <span>작성일 : <fmt:formatDate
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
			</p>
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
								</Button>
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



			<!--보여줄때 : board_no(board) 
			작성: 가져오기 member_no(login user session) + board_no(board) & insert(recommend)-->

			<!-- 1. 리플 -->
			<!-- 로그인해야보이도록 할 부분 -->
			<!--comment-->

			<hr>
			<c:if test="${!empty sessionUser}">
							댓글 : ${sessionUser.member_nick}<br>
				<form action="./writeComment.do" method="post">
					<div id="comment_box">
						<img id="title_comment" src="../resources/img/title_comment.gif">
						<input type="hidden" name="board_no"
							value="${content.boardVo.board_no}">
						<textarea name="comment_content" rows="4" cols="40"></textarea>
						<Button>
							<img id="ok_ripple" src="../resources/img/ok_ripple.gif">
						</Button>
					</div>
				</form>
			</c:if>

			<hr>

			<c:forEach items="${content.boardCommentVoList}" var="boardCommentVo">

				<input type="text" name="comment_content"
					value="${boardCommentVo.comment_content}"
					style="border-color: rgb(0, 0, 0, 0); background-color: rgb(0, 0, 0, 0);"
					disabled>
				<br>
							||작성자 : ${content.boardCommentMemberVoList.get(content.boardCommentVoList.indexOf(boardCommentVo)).member_nick} 
							||작성일 : <fmt:formatDate
					value="${boardCommentVo.comment_writedate}"
					pattern="yyyy년 MM월 dd일 hh시 mm분 ss초" />

				<c:if
					test="${sessionUser.member_no == content.boardCommentMemberVoList.get(content.boardCommentVoList.indexOf(boardCommentVo)).member_no}">
					<form action="./updateCommentBoard.do" method="post">
						<input type="hidden" name="board_no"
							value="${content.boardVo.board_no}"> <input type="hidden"
							name="comment_no" value="${boardCommentVo.comment_no}">
						<button name="" value="수정">수정</button>
					</form>
					<form action="./deleteComment.do" method="post">
						<input type="hidden" name="board_no"
							value="${content.boardVo.board_no}"> <input type="hidden"
							name="comment_no" value="${boardCommentVo.comment_no}">
						<button name="" value="삭제">삭제</button>
					</form>
				</c:if>
				<hr>

			</c:forEach>


			<div id="buttons">
				<!--로그인상태 && 글 소유자가 본인일 경우만 보이도록 -->
				<!-- sessionUser 값 있는가 && sessionUser의 MemberVo의 member_no, content속성에 BoardVo의 board_no 동일한가-->
				<c:if
					test="${!empty sessionUser && sessionUser.member_no == content.memberVo.member_no}">
					<a
						href="./deleteContentProcess.do?board_no=${content.boardVo.board_no}"><img
						src="../resources/img/delete.png"></a>
					<a
						href="./updateContentBoard.do?board_no=${content.boardVo.board_no}">수정</a>
					<a href="./board_write.do"><img
						src="../resources/img/write.png"></a>

				</c:if>

				<a href="./board_list.do"><img src="../resources/img/list.png"></a>

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