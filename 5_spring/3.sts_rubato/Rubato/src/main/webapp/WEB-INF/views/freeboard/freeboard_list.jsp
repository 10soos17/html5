<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
  <link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>클래식기타 커뮤니티</title>

  <link rel="stylesheet" type="text/css" href="../resources/css/common.css">
  <link rel="stylesheet" type="text/css" href="../resources/css/header.css">
  <link rel="stylesheet" type="text/css" href="../resources/css/footer.css">
  <link rel="stylesheet" type="text/css" href="../resources/css/board_left.css">
  <link rel="stylesheet" type="text/css" href="../resources/css/board_list_main.css">
  
</head>
<body>

	<div id="wrap">

		<jsp:include page="../commons/header.jsp"></jsp:include>

		<section id="main">
			<img src="../resources/img/comm.gif">
			<h2 id="board_title">자유 게시판</h2>
			<div id="total_search">
				<div id="total">▷ 총 ${freeboardList.size()} 게시물이 있습니다.</div>
				<div id="search">
					<div id="select_img">
						<img src="../resources/img/select_search.gif">
					</div>

					<!-- 검색 -->
					<form action="./freeboard_list.do" method="get">
						<div id="search_select">
							<select name="freeboard_search_type">
								<option value="freeboard_title">제목</option>
								<option value="freeboard_content">내용</option>
								<option value="freeboard_nick">글쓴이</option>
							</select>
						</div>
						<div id="search_input">
							<input type="text" name="freeboard_search_word">
						</div>
						<div id="search_btn">
							<Button>
								<img src="../resources/img/search_button.gif">
							</Button>
						</div>
					</form>

				</div>
			</div>
			<table>
				<tr>
					<th>번호</th>
					<th>제목</th>
					<th>글쓴이</th>
					<th>일시</th>
					<th>조회수</th>
				</tr>

				<!-- 글 목록 불러오기 -->
				<c:forEach items="${freeboardList}" var="data">
					<tr>
						<td class="col1">${data.freeboard_no}</td>
						<td class="col2"><a href="./freeboard_view.do?freeboard_no=${data.freeboard_no}">${data.freeboard_title}</a></td>
						<td class="col3">${data.freeboard_nick}</td>
						<td class="col4">${data.freeboard_readcount}</td>
						<td class="col5"><fmt:formatDate value="${data.freeboard_writedate}" pattern="MM.dd" /></td>
					</tr>
				</c:forEach>
			</table>

			<!-- 페이징 및 글 쓰기 버튼 -->
			<div id="buttons">
				<div class="col1">

					<nav>
						<ul class="pagination mb-0">
							<c:choose>
								<c:when test="${beginPage <= 1}">
									<li class="page-item disabled"><a class="page-link"
										href="./freeboard_list.do?freeboard_page_num=${beginPage-1}${addParam}">&lt;</a></li>
								</c:when>
								<c:otherwise>
									<li class="page-item"><a class="page-link"
										href="./freeboard_list.do?freeboard_page_num=${beginPage-1}${addParam}">&lt;</a></li>
								</c:otherwise>
							</c:choose>

							<c:forEach begin="${beginPage}" end="${endPage}" var="i">
								<c:choose>
									<c:when test="${currentPage == i}">
										<li class="page-item active"><a class="page-link"
											href="./freeboard_list.do?freeboard_page_num=${i}${addParam}">${i}</a></li>
									</c:when>
									<c:otherwise>
										<li class="page-item"><a class="page-link"
											href="./freeboard_list.do?freeboard_page_num=${i}${addParam}">${i}</a></li>
									</c:otherwise>
								</c:choose>
							</c:forEach>

							<c:choose>
								<c:when test="${endPage >= totalPageCount}">
									<li class="page-item disabled"><a class="page-link"
										href="./freeboard_list.do?freeboard_page_num=${endPage+1}${addParam}">&gt;</a></li>
								</c:when>
								<c:otherwise>
									<li class="page-item"><a class="page-link"
										href="./freeboard_list.do?freeboard_page_num=${endPage+1}${addParam}">&gt;</a></li>
								</c:otherwise>
							</c:choose>

						</ul>
					</nav>


				</div>

				<!-- 글쓰기 -->
				
				<div class="col2">

					<div id="buttons">
						<!--로그인상태 && 글 소유자가 본인일 경우만 보이도록 -->
						<!-- sessionUser 값 있는가 && sessionUser의 MemberVo의 member_no, content속성에 BoardVo의 board_no 동일한가-->
						<!-- c:if
					test="${!empty sessionUser && sessionUser.member_no == content.memberVo.member_no}"-->
						<a href="./freeboard_deleteContentProcess.do?freeboard_no=${freeboardList_view.freeboard_no}">
						<a href="./freeboard_write.do"><img src="../resources/img/write.png"></a>

						<!--/c:if-->

						<a href="./freeboard_list.do"><img src="../resources/img/list.png"></a>

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