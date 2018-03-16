<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" import= "java.util.regex.Pattern" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>거스의 책 리뷰 </title>
	<%@ include file="../common/head.jsp" %>
</head>
<body>

<div class="container">
<%@ include file="../common/navbar.jsp" %>

	<div class="board">
	<h1>책 게시판</h1>
	<table class = "table table-striped table-hover">
		<thead>
		<tr>
			<th>제목 </th>
			<th>작성자 </th>
			<th>날짜 </th>
			<th>조회수 </th>
		</tr>
		</thead>
		<tbody>
		
			<c:forEach items="${list}" var="boardVO">
				<tr>
					<td><a href='/board/read${pageMaker.makeQuery(pageMaker.cri.page)}&idx=${boardVO.idx }'>${boardVO.title}</a></td>
					<td>${boardVO.writer}</td>
					<td>${boardVO.regdate}</td>
					<td>${boardVO.count}</td>
				</tr>
			</c:forEach>

		</tbody>
	</table>
	
					<div class="box-footer">
						<div class="text-center">
							<ul class="pagination">
								<c:if test="${pageMaker.prev}">
									<li class="page-item "><a class="page-link"
										href="<c:url value='/board/${pageMaker.cri.boardName }?page=${pageMaker.startPage -1 }'/>"
										tabindex="-1">&laquo;</a></li>
								</c:if>
								<c:if test="${not pageMaker.prev}">
									<li class="page-item disabled"><a class="page-link"
										href="#" tabindex="-1">&laquo;</a></li>
								</c:if>
								<c:forEach begin="${pageMaker.startPage }"
									end="${pageMaker.endPage }" var='idx'>
									<li
										<c:out value="${pageMaker.cri.page==idx?'class =active page-item':'class =page-item' }"/>><a
										class="page-link"
										href="<c:url value='/board/${pageMaker.cri.boardName }?page=${idx }'/>">${idx }</a></li>
								</c:forEach>
								<c:if test="${pageMaker.next && pageMaker.endPage > 0}">
									<li class="page-item"><a class="page-link"
										href="<c:url value='/board/${pageMaker.cri.boardName }?page=${pageMaker.endPage +1}'/>">&raquo;</a>
									</li>
								</c:if>
								<c:if test="${not pageMaker.next || pageMaker.endPage <= 0}">
									<li class="page-itemv disabled"><a class="page-link"
										href="#">&raquo;</a></li>
								</c:if>
							</ul>
						</div>
					</div>
	<c:if test="${not empty login.id}">
		<a href = "/board/insert?boardno=${pageMaker.cri.boardno }" class="btn btn-default">글쓰기 </a>
		</c:if>
</div>
</div>
</body>
</html>