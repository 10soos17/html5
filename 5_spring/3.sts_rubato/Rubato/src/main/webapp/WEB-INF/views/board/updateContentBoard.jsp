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
</head>
<body>
	<div id="wrap">

	<jsp:include page="../commons/header.jsp"></jsp:include>

		<section id="main">
			<img src="../resources/img/comm.gif">
			<h2 id="board_title">자유 게시판</h2>

			<!-- 글쓰기 폼 -->
				<form action="./updateContentProcess.do" method="post">

				<div id="write_title">
					<h2>글쓰기</h2>
				</div>

				<table>
				
					<tr id="name">
						<td class="col1">이름</td>
						<td class="col2">${content.memberVo.member_nick}<!--  input type="text"--></td>
					</tr>
					<tr id="subject">
						<td class="col1">제목</td>
						<td class="col2"><input name="board_title" type="text" value="${content.boardVo.board_title}"></td>
					</tr>
					<tr id="content">
						<td class="col1">내용</td>
						<td class="col2" ><textarea name="board_content">${content.boardVo.board_content}</textarea></td>
					</tr>
					<tr id="upload">
						<td class="col1">업로드 파일</td>
						<td class="col2"><input type="text"> <input name="board_files" type="file" accept="image/*" multiple></td>
					</tr>
				</table>
				<input type="hidden" name="board_no" value="${content.boardVo.board_no}"><!-- board_no 값 넘기는 법 -->
				<div id="buttons">
					<Button><img src="../resources/img/ok.png"></Button>
					<a href="./board_list.do"><img src="../resources/img/list.png"></a>
				</div>
			</form>
			
			
		</section>
		<!-- section main -->

		<jsp:include page="../commons/footer.jsp"></jsp:include>

	</div>
	<!-- wrap -->
</body>
</html>