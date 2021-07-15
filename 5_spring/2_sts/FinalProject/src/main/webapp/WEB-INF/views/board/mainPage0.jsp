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
						<img src="../resources/img/img03.jpeg" height="150px" align="middle">
					</div>
				</div>
				
				<form action="./mainPage.do" method="get">
				<div class="row mt-2"><!-- 검색 -->
					<div class="col">
						<select name="search_type" class="form-select">
							<option value ="title">제목</option>
							<option value ="content">내용</option>
							<option value ="nick">닉네임</option>
						</select>
					</div>
					<div class="col-8">
						<input name="search_word" type="text" class="form-control">
					</div>
					<div class="col d-grid">
						<input type="submit" value="검색" class="btn btn-primary">
					</div>
				</div>
				</form>
				
				<div class="row mt-3"><!-- 데이터 로우 -->
					<div class="col">
						<table class="table">
							<tr>
								<td>글 번호</td>
								<td>제목</td>
								<td>작성자</td>
								<td>조회수</td>
								<td>작성일</td>
							</tr>
							<c:forEach items="${contentList}" var="data">
								<tr>
									<td>${data.boardVo.board_no}</td>
									<td><a href="./readContentPage.do?board_no=${data.boardVo.board_no}">${data.boardVo.board_title}</a></td>
									<td>${data.memberVo.member_nick}</td>
									<td>${data.boardVo.board_readcount}</td>
									<td><fmt:formatDate value="${data.boardVo.board_writedate}" pattern="MM.dd"/></td>
								</tr>
							</c:forEach>
						</table>
					</div>
				</div>
				
				
				<div class="row mt-2"> <!-- 페이징 및 글 쓰기 버튼 -->
					<div class="col-2"></div>
					<div class="col">
					
					<form action="./mainPage.do" method="post">
						<nav>
						  <ul class="pagination mb-0">
						  	 <input type="hidden" name="search_type" value="${search_type}">
						  	 <input type="hidden" name="search_word" value="${search_word}">
						  	<c:choose>
						  		<c:when test="${beginPage <= 1}">
						  			<li class="page-item disabled"><input type="submit" class="page-link" name="page_num" value= "${beginPage-1}" value="&lt;">
						  			</li>
						  		</c:when>
						  		<c:otherwise>
						  			<li class="page-item"><input type="submit" class="page-link" name="page_num" value= "${beginPage-1}" value="&lt;"></li>
						  		</c:otherwise>
						  	</c:choose>
						  	
						  	<c:forEach begin="${beginPage}" end="${endPage}" var="i">
						  		<c:choose>
						  			<c:when test="${currntPage == i}">
						    			 <li class="page-item active" ><input type="submit" class="page-link" name="page_num" value="${i}"></li>		
						  			</c:when>
						  			<c:otherwise>
						    	 		<li class="page-item" ><input type="submit" class="page-link" name="page_num" value="${i}"></li>
						  				
						  			</c:otherwise>
						  		</c:choose>
						    </c:forEach>
						    
						   <c:choose>
						  		<c:when test="${endPage >= totalPageCount}">
						   			 <li class="page-item disabled"><input type="submit" class="page-link" name="page_num" value="${endPage+1}" value="&gt;"></li>
						  		</c:when>
						  		<c:otherwise>
						   		 	<li class="page-item"><input type="submit" class="page-link" name="page_num" value="${endPage+1}" value="&gt;"></li>
						  		</c:otherwise>
						  	</c:choose>
						  	
						  </ul>
						</nav>	
							</form>
					</div>
					
					
					
					<div class="col-2 d-grid">
						<c:if test="${!empty sessionUser}">
						<a class="btn btn-primary" href="./writeContentPage.do">글 쓰기</a>
						</c:if>
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