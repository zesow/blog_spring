<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<nav class="navbar navbar-inverse navbar-fixed-top">
 <div class="container">
  <div class="navbar-header">
   <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
    <span class="icon-bar"></span>
    <span class="icon-bar"></span>
    <span class="icon-bar"></span>
   </button>
   <div class="navbar-header">
   <a class="navbar-brand" href="/">Gus' Blog</a>
   </div>
  </div>
  <div class="collapse navbar-collapse" id="myNavbar">
   <ul class="nav navbar-nav">
    <li><a href="/about">Who is Gus?</a></li>
    <li class="dropdown">
    		<a class="dropdown-toggle" data-toggle="dropdown" href="/about">CS<span class="caret"></span></a>
    		<ul class="dropdown-menu">
    			<li><a href="/board/projects">프로젝트</a></li>
    			<li><a href="/board/algorithm">알고리즘</a></li>
    			<li><a href="/board/major">전공</a></li>
    			<li><a href="/board/others">기타</a></li>
    		</ul>
    </li>
    <li class="dropdown">
    		<a class="dropdown-toggle" data-toggle="dropdown" href="/about">상식<span class="caret"></span></a>
    		<ul class="dropdown-menu">
    			<li><a href="/board/finance">경제 </a></li>
    			<li><a href="/board/law">법 </a></li>
    		</ul>
    </li>
    <li class="dropdown">
    		<a class="dropdown-toggle" data-toggle="dropdown" href="/about">일상<span class="caret"></span></a>
    		<ul class="dropdown-menu">
    			<li><a href="/board/photo">사진 </a></li>
    			<li><a href="/board/food">맛집 </a></li>
    		</ul>
    </li>
        <li class="dropdown">
    		<a class="dropdown-toggle" data-toggle="dropdown" href="/about">취미<span class="caret"></span></a>
    		<ul class="dropdown-menu">
    			<li><a href="/board/game">게임</a></li>
    			<li><a href="/board/machine">기계</a></li>
    			<li><a href="/board/movie">영화</a></li>
    			<li><a href="/board/book">책</a></li>
    		</ul>
    </li>
    <li><a href="/free">자유게시판</a></li>
   </ul>
   <ul class="nav navbar-nav navbar-right">
  
  <c:choose>
   <c:when test="${empty sessionScope.login}">
      <li><a href="void(0);" onclick="alert('준비중입니다.');return false;"><span class="glyphicon glyphicon-user"></span> Sign Up</a></li>
      <li><a href="/user/login"><span class="glyphicon glyphicon-log-in"></span> Login</a></li>
    </c:when>
   	<c:otherwise>
      <li><a href="/user/account"><span class="glyphicon glyphicon-eye-open"></span> My Account</a></li>
      <li><a href="/user/logout"><span class="glyphicon glyphicon-log-out"></span> Logout</a></li>
   	</c:otherwise>
   </c:choose>
   
   </ul>
  </div>
  
 </div>
</nav>
