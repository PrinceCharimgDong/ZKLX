<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html >
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
  <title>广东中科立信科技有限公司</title>
  <link rel="shortcut icon" type="image/x-icon" href="../images/favicon.ico" />
  <link href="../CSS/css.css" rel="stylesheet" type="text/css" />
</head>
<body>
   <jsp:include page="head.jsp">
    	<jsp:param value="5" name="number1"/>
  </jsp:include> 
    
    <div id="fhtop" onclick="pageScroll()" style="display:none"><img src="../images/float_4.png" width="55" height="55" /></div>
    
    <div id="main">
	<div class="cnanv">
	<div class="qqq">当前位置：<a href="../index">首页</a>-><a href="../case/list">项目案例</a></div>
    <div class="cluture1">
        <a href="../case/list" >系统集成</a>
        <a href="../promulti/list"  class="on">多媒体会议系统</a>
        <a href="../proapp/list">应用系统</a>
        <a href="../proit/list">IT运维</a>
    </div>
</div>

		
	<div class="mainbk">
	     <div class="xxmain">
	     <div class="alname">${title}</div>
	    
	     <div class="alnews">
	     ${introduciton }
		</div>
	</div>
   
     </div>
     
   </div>
   
 
  <jsp:include page="footer.jsp"/>

</body>
          </html>
