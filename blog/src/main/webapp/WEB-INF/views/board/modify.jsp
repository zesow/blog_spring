<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@page import="java.util.*" %>
<%@ page import = "java.sql.*" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>글 수정 </title>
  	<%@ include file="../common/head.jsp" %>
</head>
<body>
<%@ include file="../common/navbar.jsp" %>
<div class="container">
<h1>글수정 </h1>
<form method = "post">
<div class="form-group">
	<label for="text">제목 : </label>
	<input type="text" name="title" class="form-control" value="${boardVO.title}"/>
</div>
<div class="form-group">
	<label for="text">작성자  : </label>
	<input type="text" name="writer" class="form-control" value="${boardVO.writer}"/>
</div>

<div class="form-group">
	<label for="text">내용   : </label>
	<textarea rows="10" name="content" class="summernote" id="summernote">${boardVO.content}</textarea>
</div>	

<button type="submit" class="btn btn-default">submit</button>
</form>
</div>
<script>

$(document).ready(function() {
	var sendFile = function (file, el) {
	      var form_data = new FormData();
	      form_data.append('file', file);
	      $.ajax({
	        data: form_data,
	        type: "POST",
	        url: '/file',
	        cache: false,
	        contentType: false,
	        enctype: 'multipart/form-data',
	        processData: false,
	        success: function(url) {
	        		$('#summernote').summernote('insertImage', url);
		        $('#imageBoard > ul').append('<li><img src="'+ url +'" width="480" height="auto"/></li>');
	        }
	      });
	    }
  $('.summernote').summernote({
    height: 300,          // 기본 높이값
    minHeight: null,      // 최소 높이값(null은 제한 없음)
    maxHeight: null,      // 최대 높이값(null은 제한 없음)
    focus: true,          // 페이지가 열릴때 포커스를 지정함
    lang: 'ko-KR',         // 한국어 지정(기본값은 en-US)
    callbacks: {
        onImageUpload: function(files, editor, welEditable) {
          for (var i = files.length - 1; i >= 0; i--) {
            sendFile(files[i], this);
          }
        }
      }
  });
});


	function formCheck(){
	    var title = document.forms[0].title.value;     
	    var writer = document.forms[0].writer.value;
	    var content = document.forms[0].content.value; 
	    
	   	var emailPattern = /^[a-zA-Z0-9._-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,4}$/;
	    if (title == null || title == ""){                                    // null인지 비교한 뒤
	        alert('제목을 입력하세요');                                   // 경고창을 띄우고
	        document.forms[0].title.focus();                           // 해당태그에 포커스를 준뒤
	        return false;                                                     // false를 리턴합니다.
	    }
	 
	    if (writer == null ||  writer  == ""){          
	        alert('작성자를 입력하세요'); 
	        document.forms[0].writer.focus();                      
	        return false;               
	    }else if(writer.match(/^(\w+)@(\w+)[.](\w+)$/ig) == null){
	        alert('이메일 형식으로 입력하세요'); 
	        document.forms[0].writer.focus();                      
	        return false; 
	    }
	
	}
</script>
</body>
</html>