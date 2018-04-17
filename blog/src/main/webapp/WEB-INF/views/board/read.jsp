<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<%@ include file="../common/head.jsp" %>
<title>글 읽기</title>
<style>
#modDiv {
	width: 300px;
	height: 100px;
	background-color: gray;
	position: absolute;
	top: 50%;
	left: 50%;
	margin-top: -50px;
	margin-left: -150px;
	padding: 10px;
	z-index: 1000;
}
</style>
</head>
<body>
<%@ include file="../common/navbar.jsp" %>
<div class="container">
<div class="board">
	<div class="page-header">
		<h3>${boardVO.title }</h3>	
	</div>

<div class="panel panel-default">
<div class="panel-heading">
	<h4 class="panel-title">
		글쓴이: ${boardVO.writer} &nbsp; 등록일: ${boardVO.regdate} &nbsp; 조회수: ${boardVO.count }
	</h4>
</div>
<div class="panel-body">
	<div class="content post" style="line-height:30px;" >
	${boardVO.content }
	</div>
</div>
</div>

<!-- 댓글. -->
<div id="comment">
<h3>댓글</h3>
	<div id='replies'></div>

	
	<div class="form-group">
		<h4>댓글 작성하기(댓글은 누구나 남기실 수 있습니다.)</h4>
		<div>
			<label>작성자</label> 
			<input type="text" name="replyer" id="newReplyWriter" class="form-control" value="${ login.id}">
		</div>
		<div>
			<label>내용</label> 
			<textarea type="text" name="replyText" id="newReplyText" class="summernote"></textarea>
		</div>
			
			<button id="replyAddBtn" class="btn btn-success">댓글 등록</button>
	</div>

</div>

<form method="post" role="form" >
	<input type="hidden" name='idx' value='${boardVO.idx }'>
	<input type="hidden" name="page" value='${cri.page }'>
	<input type="hidden" name="perPageNum" value='${cri.perPageNum }'>
	<input type="hidden" name="boardName" value='${boardVO.boardName }'>
</form>
<c:if test="${login.id == 'zesow' }">
	<button type="submit" class="btn btn-danger">삭제</button>
	<button type="submit" class="btn btn-warning">수정</button>
</c:if>
<button type="submit" class="btn btn-primary">목록</button>
</div>
</body>
</html>

<script type="text/javascript">
var bNo = ${boardVO.idx};
function afterReg(){
	 			$('#newReplyWriter').val("");
				$('#newReplyText').summernote('reset');
				document.body.scrollTop = 0;
    				document.documentElement.scrollTop = 0;
}
/* getList */
function getAllList(){
	  $.getJSON("/replies/all/" + bNo, function(data) {
		    var str = "";
		    $(data).each(
		        function() {
		          str +=  
					 "<div class='panel panel-default'>"
					+"<div class='panel-heading'>"
					+"<h4 class='panel-title'>"
					+ "글쓴이 : "
					+ this.replyer
					+ "  등록일 : "
					+ this.regDate
					+"<div class='pull-right'>"
					+"<a onclick=commentDelete("+this.rNo+") style='cursor:pointer'>" + "삭제" + "</a>"
					+"</for>"
					+"</h4>"
					+"</div>"
					+"<div class='panel-body'>"
					+ "<p>" + this.replyText + "</p>"
					+"</div>"					
					+"</div>";
					
		    		});
		 
		    		$("#replies").html(str);

			});	
}
/* set */
$("#replyAddBtn").on("click",function(){
	var replyer = $("#newReplyWriter").val();
	var replyText = $("#newReplyText").val();
	
	if(replyer == "") {
		    alert("작성자를 입력해 주세요.");
		    return false;
	}
	else if(replyText == "") {
		    alert("작성내용을 입력해 주세요.");
		    return false;
	}
	
	      $.ajax({
		        type : 'post',
		        url : '/replies',
		        headers : {
		          "Content-Type" : "application/json",
		          "X-HTTP-Method-Override" : "POST"
		        },
		        dataType : 'text',
		        data : JSON.stringify({
		          bNo : bNo,
		          replyer : replyer,
		          replyText : replyText
		        }),
		        success : function(result) {
		 
		          if (result == 'SUCCESS') {
		 
		            alert("등록 되었습니다."); 

		            getAllList();
					afterReg();

		          }
		        }
		      });

});
		
/* 삭제 */
//$("#replyDelBtn").on("click", function() {
function commentDelete(rNo){
  $.ajax({
    type : 'delete',
    url : '/replies/' + rNo,
    headers : {
      "Content-Type" : "application/json",
      "X-HTTP-Method-Override" : "DELETE"
    },
    dataType : 'text',
    success : function(result) {
      console.log("result: " + result);
      if (result == 'SUCCESS') {
        alert("삭제 되었습니다.");
        getAllList();
      }
    }
  });
}

$(document).ready(function() {
	getAllList();
	var formObj = $("form[role='form']");
	var boardName = "${boardVO.getBoardName()}";
	console.log(boardName)
	$(".btn-warning").on("click", function() {
		formObj.attr("action", "/board/modify");
		formObj.attr("method", "get");
		formObj.submit();
	});
	$(".btn-danger").on("click", function() {
		formObj.attr("action", "/board/remove");
		formObj.submit();
	});
	$(".btn-primary").on("click", function() {
		formObj.attr("action", "/board/"+boardName);
		formObj.attr("method", "get");
		formObj.submit();
	});
	
    $('.summernote').summernote({
        height: 100,          // 기본 높이값
        minHeight: null,      // 최소 높이값(null은 제한 없음)
        maxHeight: null,      // 최대 높이값(null은 제한 없음)
        focus: true,          // 페이지가 열릴때 포커스를 지정함
        lang: 'ko-KR',         // 한국어 지정(기본값은 en-US)
        
      });
});
	var httpRequest = null;
	
	// 자바스크립트를 이용하여 서버로 보내는 http request 만들기.
	function getXMLHttpRequest(){
		var httpRequest = null;
		
		if(window.ActiveXObject){ // IE
			try{
				httpRequest = new ActiveXObject("Msxm12.XMLHTTP");
			}catch(e){
				try{
					httpRequest = new ActiveXObject("Microsoft.XMLHTTP");
				}catch(e2){
					httpRequest = null;
				}
			}
		}
		else if(window.XMLHttpRequest){ // safari
			httpRequest = new window.XMLHttpRequest();
		}
		
		return httpRequest;
	}
	
	function writeCmt(){
		
		var form = document.getElementById("writeCommentForm");
		
		var board = form.comment_board.value;
		var id = form.comment_id.value;
		var content = form.comment_content.value;
		
		if(!content){
			alert("내용을 입력하세요.");
			return false;
		}
		else{
			var param="comment_board="+board+"&comment_id="+id+"&comment_content="+content;
			
			// 1단계. http request 만들기.
			httpRequest = getXMLHttpRequest();
			// 서버로 보낸 요청에 대한 응답을 받았을 때 어떤 동작을 할 것인지.
			httpRequest.onreadystatechange =checkFunc;
			// 실질적으로 서버에 request 함.
			httpRequest.open("POST","commentWriteAction.do",true);
			httpRequest.setRequestHeader('Content-Type','application/x-www-form-urlencoded;charset=UTF-8');
			httpRequest.send(param);
		}
	}
	
	function checkFunc(){
		// 2단계. 서버 응답에 대한 처리. 4는 서버로부터 모든 응답을 받았다는 뜻.
		if(httpRequest.readyState == 4){
			document.location.reload();
		}
	}
	
	function deleteCmt(comment_num){
		var param = "comment_num=" + comment_num;
		// 1단계. http request 만들기.
		httpRequest = getXMLHttpRequest();
		// 서버로 보낸 요청에 대한 응답을 받았을 때 어떤 동작을 할 것인지.
		httpRequest.onreadystatechange =checkFunc;
		// 실질적으로 서버에 request 함.
		httpRequest.open("POST","commentDeleteAction.do",true);
		httpRequest.setRequestHeader('Content-Type','application/x-www-form-urlencoded;charset=UTF-8');
		httpRequest.send(param);
	
	}
		
</script>