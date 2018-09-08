<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
  <link rel="shortcut icon" type="image/x-icon" href="images/favicon.ico" />
    <script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery-1.7.2.min.js"></script>
    
<script type="text/javascript">
    
    $(function(){
        
        $("#change").on("click",function(){
            
            var tit1=$("#box1").val();
			var tit2=$("#box2").val();
			/* var tit3=$("#box3").val(); */
			var tit4=$("#box4").val();
			var tit5=$("#box5").val();
			if (tit4!=tit5) {
				alert("两次输入密码不一致");
				return false;
			}
            var obj = {id:1,username:tit2,password:tit4};
            var jsonStr = JSON.stringify(obj);
			/* if(tit1==""||tit2==""||tit3==""||tit4==""||tit5==""){
				alert("注意，星号项为必填项！");
				return false;  
				}else{
					if (!tit4==tit5) {
						alert("注意，两次输入密码不一致！");
						return false;  
					}
				} */
            /*
                contentType属性表示本次请求给服务器发送的数据类型是什么
                    对应了之前请求头中的属性:Content-Type
                dataType属性表示本次请求希望服务器返回的数据类型是什么
                    对应了之前请求头中的属性:Accept
            */
            
            
            $.ajax({
                type: "POST",
                url: "request_body/test2",
                contentType: "application/json",
                data: jsonStr,
                dataType: "text",
                success: function(info){
                	var info= eval("("+info+")");
                	$("#result").html(info.message);
                	console.log(info.message);
                	console.log(info);
                   // console.log(info);
                },
				error : function(info) {
					alert(JSON.stringify(info))
				}
            });
            
        });
        
    });
    
</script>
</head>
<body>
	 <jsp:include page="backnav.jsp">
    	<jsp:param value="7" name="number1"/>
    	<jsp:param value="7.2" name="number2"/>
  	</jsp:include>
	     <div class="header">
        <div class="now color"><a href="First.html" class="color">后台</a> -> 用户管理</div>
      </div>
	  <div class="flatmain">
      	<a class="style1">用户密码管理</a>
      	<div class="contactbox">
        	<div class="sform1">
            <ul>
              <form ><li>
                <div class="gill"><input  class="contactinputs" name="id" value="${user.id }" type="hidden" id="box1"/></div>
              </li>
              <li>
                <div class="fll1">用户名<strong class="red">*</strong>　</div>
                <div class="gill"><input  class="contactinputs" name="name" value="${user.username}" type="text" id="box2"/></div>
              </li>
              <!-- <li>
                <div class="fll1">当前密码<strong class="red">*</strong></div>
                <div class="gill"><input  class="contactinputs" name="oldpa"  type="password" id="box3" /></div>
              </li> -->
              <li>
                <div class="fll1">新密码<strong class="red">*</strong>　</div>
                <div class="gill"><input  class="contactinputs" name="pass" type="password" id="box4" /></div>
              </li>
             <li>
                <div class="fll1">确认密码<strong class="red">*</strong></div>
                <div class="gill"><input  class="contactinputs" name="pass" type="password" id="box5" /></div>
              </li>
              <label class="msgbox" id="result"/>
              </form>
            </ul>
        	</div><!--  onClick="check_all()" -->
        	<div class="save"><input class="bottons c_green" name="input" type="submit" value="修改" id="change">
    </div>
        </div>
      </div>
    </div>
    
</body>
<script type="text/javascript">
	function check_all(){
		
/* 
		var formId = document.getElementById('sysForm');
		var tit1=$("#box1").val();
		var tit2=$("#box2").val();
		var tit3=$("#box3").val();
		var tit4=$("#box4").val();
		var tit5=$("#box5").val();

		if(tit1==""||tit2==""||tit3==""||tit4==""||tit5==""){
			alert("注意，星号项为必填项！");
			}else{
				formId.submit();
			} */
		}
	
</script>
</html>