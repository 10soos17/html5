<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.5.0/font/bootstrap-icons.css">
<!DOCTYPE html>

<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<jsp:include page="../commons/globalNav.jsp"></jsp:include>
	
		<div style="width: 1200px; margin: 0 auto">
		<div class="row">
		
			<div class="col"></div>
			<div class="col-8">
			
				<div class="row mt-5"><!-- 배너 -->
				
					<div class="col">
					<div class="row mt-5">
						<div class="col"></div>
						<div class="col-3">
							<h1>게시글 보기</h1>
						</div>
						<div class="col"></div>
						</div>
					</div>
				</div>
				
				<div class="row mt-3"><!-- 데이터 로우 -->
					<div class="col">
					<div class="row mt-5">
						<div class="col"></div>
						<div class="col-6">
							<h2>제목 : ${content.boardVo.board_title}         
							작성자 : ${content.memberVo.member_nick}</h2>
						</div>
						<div class="col"></div>
						</div>
					</div>
				</div>

				<div class="row mt-2"><!-- 데이터 로우 -->
					<div class="col">
					<div class="row mt-2">
						<div class="col"></div>
						<div class="col-6">
														
							작성일 : <fmt:formatDate value="${content.boardVo.board_writedate}" pattern="yyyy년 MM월 dd일 hh시 mm분 ss초" />
							조회수: ${content.boardVo.board_readcount}<br>
	
							<c:forEach items="${content.boardImageVoList}" var="boardImageVo">
								<img src="/upload/${boardImageVo.image_url}"><br>
							</c:forEach>
						
							<br> 내용 :
							<br> ${content.boardVo.board_content}
							<br>
						
						</div>
						<div class="col"></div>
						</div>
					</div>
				</div>	
				
				<div class="row mt-3"><!-- 데이터 로우 -->
					<div class="col">
					<div class="row mt-5">
						<div class="col"></div>
						<div class="col-6">
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
									<c:when test="${!empty sessionUser && sessionUser.member_no != content.memberVo.member_no}">
											<input type="hidden" name="board_no" value="${content.boardVo.board_no}"> 
											<input type="hidden" name="member_no" value="${sessionUser.member_no}">
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
							<a href="./mainPage.do">목록으로</a>

							<!--로그인상태 && 글 소유자가 본인일 경우만 보이도록 -->
							<!-- sessionUser 값 있는가 && sessionUser의 MemberVo의 member_no, content속성에 BoardVo의 board_no 동일한가-->
							<c:if
								test="${!empty sessionUser && sessionUser.member_no == content.memberVo.member_no}">
								<a href="./deleteContentProcess.do?board_no=${content.boardVo.board_no}">삭제</a>
								<a href="./updateContentPage.do?board_no=${content.boardVo.board_no}">수정</a>
							</c:if>
						</div>
						<div class="col">

						</div>
						</div>
					</div>
				</div>
				
				<div class="row mt-1"><!-- 데이터 로우 -->
					<div class="col">
					<div class="row mt-1">
						<div class="col"></div>
						<div class="col-6">
	
						<!--
						보여줄때 : board_no(board) 
						작성: 가져오기 member_no(login user session) + board_no(board) & insert(recommend)-->
						
						<!-- 1. 리플 -->
						<!-- 로그인해야보이도록 할 부분 -->
						<hr>
						<form action = "./updateCommentProcess.do" method="post">
						
							<c:forEach items="${content.boardCommentVoList}" var="boardCommentVo">
								
								<c:choose>
									<c:when test="${sessionUser.member_no == content.boardCommentMemberVoList.get(content.boardCommentVoList.indexOf(boardCommentVo)).member_no}">
										<input type="text" name="comment_content" value="${boardCommentVo.comment_content}" >
									</c:when>
									<c:otherwise>
										<input type="text" name="comment_content" value="${boardCommentVo.comment_content}" disabled>
									</c:otherwise>
								</c:choose>
								
								<br>
								|| 작성자 : ${content.boardCommentMemberVoList.get(content.boardCommentVoList.indexOf(boardCommentVo)).member_nick}
								|| 작성일 : <fmt:formatDate value="${boardCommentVo.comment_writedate}" pattern="yyyy년 MM월 dd일 hh시 mm분 ss초"/>
								
								<c:if test="${sessionUser.member_no == content.boardCommentMemberVoList.get(content.boardCommentVoList.indexOf(boardCommentVo)).member_no}">
										<input type="hidden" name="board_no" value="${content.boardVo.board_no}">	
										<input type="hidden" name="comment_no" value="${boardCommentVo.comment_no}">
										<input type="submit" value="수정">
									
								</c:if>
								
								<hr>
								
							</c:forEach>
						</form>

						
						</div>
						<div class="col"></div>
						</div>
					</div>
				</div>
				
				</div>
				<div class="col"></div>
				
			</div>
		</div>
	




	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
		crossorigin="anonymous"></script>
</body>
</html>