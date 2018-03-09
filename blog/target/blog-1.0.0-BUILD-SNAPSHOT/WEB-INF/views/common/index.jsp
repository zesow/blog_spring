<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<%@ include file="head.jsp" %>
<title>Insert title here</title>
    <!-- Custom styles for this template -->
    <link href="/resources/cleanblog/css/clean-blog.css" rel="stylesheet">
</head>
<body>
<%@ include file="navbar.jsp" %>
<!-- Page Header -->
    <header class="masthead" style=" background-image: url('../resources/img/profile/main_1.JPG')">
      <div class="overlay"></div>
      <div class="container">
        <div class="row">
          <div class="col-lg-8 col-md-10 mx-auto">
            <div class="site-heading">
              <h1>거스</h1>
              <span class="subheading">일상,</span>
            </div>
          </div>
        </div>
      </div>
    </header>
    <header class="masthead" style=" background-image: url('../resources/img/profile/main_2.JPG')">
      <div class="overlay"></div>
      <div class="container">
        <div class="row">
          <div class="col-lg-8 col-md-10 mx-auto">
            <div class="site-heading">
              <h2>블로그.</h2>
              <span class="subheading">CS,</span>
            </div>
          </div>
        </div>
      </div>
    </header>
        <header class="masthead" style=" background-image: url('../resources/img/profile/main_3.JPG')">
      <div class="overlay"></div>
      <div class="container">
        <div class="row">
          <div class="col-lg-8 col-md-10 mx-auto">
            <div class="site-heading">
              <h2>환영합니다.</h2>
              <span class="subheading">취미.</span>
            </div>
          </div>
        </div>
      </div>
    </header>
    <!-- Main Content -->
    <div class="container">
      <div class="row">
        <div class="col-lg-8 col-md-10 mx-auto">
        <c:forEach items="${list}" var="boardVO">
          <div class="post-preview">
            <a href="/board/read?idx=${boardVO.idx }">
              <h2 class="post-title">
                ${ boardVO.title}
              </h2>
            </a>
            <p class="post-meta">게시판 : 
              <a href="/board/${boardVO.boardName}">${boardVO.boardRealName }</a>
                 게시일 : ${boardVO.regdate }
            </p>
          </div>
          <hr>
          </c:forEach>
          
          
          <!-- Pager -->
          <div class="clearfix">
            <a class="btn btn-primary float-right" href="board/list">Older Posts &rarr;</a>
          </div>
        </div>
      </div>
    </div>

    <hr>

    <!-- Footer -->
    <footer>
      <div class="container">
        <div class="row">
          <div class="col-lg-8 col-md-10 mx-auto">
            <ul class="list-inline text-center">
              <li class="list-inline-item">
                <a href="#">
                  <span class="fa-stack fa-lg">
                    <i class="fa fa-circle fa-stack-2x"></i>
                    <i class="fa fa-twitter fa-stack-1x fa-inverse"></i>
                  </span>
                </a>
              </li>
              <li class="list-inline-item">
                <a href="#">
                  <span class="fa-stack fa-lg">
                    <i class="fa fa-circle fa-stack-2x"></i>
                    <i class="fa fa-facebook fa-stack-1x fa-inverse"></i>
                  </span>
                </a>
              </li>
              <li class="list-inline-item">
                <a href="#">
                  <span class="fa-stack fa-lg">
                    <i class="fa fa-circle fa-stack-2x"></i>
                    <i class="fa fa-github fa-stack-1x fa-inverse"></i>
                  </span>
                </a>
              </li>
            </ul>
            <p class="copyright text-muted">Copyright &copy; 거스의 웹</p>
          </div>
        </div>
      </div>
    </footer>


    <!-- Custom scripts for this template -->
    <script src="/resources/cleanblog/js/clean-blog.min.js"></script>
</body>
</html>

