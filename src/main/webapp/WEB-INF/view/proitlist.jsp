<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %> 
<%@ page import="util.*"%>
<%@page isELIgnored="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml"><!-- InstanceBegin template="/Templates/muban.dwt" codeOutsideHTMLIsLocked="false" -->
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
  <!-- InstanceBeginEditable name="doctitle" -->
    <title>广东中科立信科技有限公司</title>
    <!-- InstanceEndEditable --> 
  <!-- InstanceBeginEditable name="head" -->
    <!-- InstanceEndEditable --> <!-- 
  <link href="../CSS/admin.css" rel="stylesheet" type="text/css" /> -->
  <link rel="shortcut icon" type="image/x-icon" href="../images/favicon.ico" />
  <link href="../CSS/css.css" rel="stylesheet" type="text/css" />
  <script type="text/javascript" src="../js/jquery-1.7.2.min.js"></script>
  <script type="text/javascript" src="../js/jquery.SuperSlide.2.1.1.js"></script>    
</head> 
<body   >
   <jsp:include page="head.jsp">
    	<jsp:param value="5" name="number1"/>
  </jsp:include> 
  
  <div id="fhtop" onclick="pageScroll()" style="display:none"><img src="../images/float_4.png" width="55" height="55" /></div>
  <div id="main">
<div class="cnanv">
<div class="qqq">当前位置：<a href="../index">首页</a>-><a href="../case/list">项目案例</a></div>
    <div class="cluture1">
    	<a href="../case/list" >系统集成</a>
        <a href="../promulti/list">多媒体会议系统</a>
        <a href="../proapp/list" >应用系统</a>
        <a href="../proit/list" class="on">IT运维</a>
    </div>
</div>
<div class="hengxian"></div>
<div class="almain">
  <ul><c:forEach var="item" items="${list}" varStatus="xh">
  
  			<c:set var="intro" value="${item.introduciton}" scope="request"/>
   		  	<%  Object inString;
			   ByteToStr byteToStr =new ByteToStr();
			   CutLength cutLength = new CutLength();
			   ShowPhoto showPhoto = new ShowPhoto();
			%>
			
			<%inString = request.getAttribute("intro") ;%>
    <li> 
        <div class="alzong">
            <div class="alimg"><img src="<%=showPhoto.getPhoto(byteToStr.objToStr(inString)) %>" /></div>
            <div class="alxs">
            <div class="albigt">${item.title}</div>
            <div class="alzxx">
				 <%= cutLength.StripHT(byteToStr.objToStr(inString))  %>
			</div>
            <div class="more"><div class="gdt"><img src="../images/case/liimg.png"/></div>
              <a href="detail?id=${item.aid}">查看详情</a></div>
            </div>
            </div>
    </li>
    </c:forEach>
   </ul>
        <div style="text-align:center"  id="pag">
    			<c:set  var="intro" value="${(page.start/10)+1}" scope="request"/>
				<c:set  var="finally" value="${(page.last/10)+1}" scope="request"/>
				<%Object inString = request.getAttribute("intro") ;
					Object last = request.getAttribute("finally") ;
				%>
				<%int a =Integer.parseInt(new java.text.DecimalFormat("0").format(inString));
					int b =Integer.parseInt(new java.text.DecimalFormat("0").format(last));
				%>
					<a href="?start=0">首  页</a>
					<c:if test="<%=!(a==1) %>">
						<a href="?start=${page.start-page.count}">上一页</a>
					</c:if>
					
					<%=a %>/<%=b %>
					<c:if test="<%=!(a==b) %>">
						<a href="?start=${page.start+page.count}">下一页</a>
					</c:if>
					<a href="?start=${page.last}">末  页</a>
	 
  </div>
 </div>
   
 </div>

  <jsp:include page="footer.jsp"/>
</body>

<script type="text/javascript">



  $(document).ready(function(){

   $(".prev,.next").hover(function(){
    $(this).stop(true,false).fadeTo("show",0.9);
  },function(){
    $(this).stop(true,false).fadeTo("show",0.4);
  });
   
   $(".gsjjimage-box").slide({
    titCell:".hd ul",
    mainCell:".bd ul",
    effect:"fold",
    interTime:3000,
    delayTime:1000,
    autoPlay:true,
    autoPage:true, 
    trigger:"click" ,
	mouseOverStop:true
  });


 });
  function pageScroll(){
    window.scrollBy(0,-4);
    scrolldelay = setTimeout('pageScroll()',1);
    var sTop=document.documentElement.scrollTop+document.body.scrollTop;
    if(sTop==0) clearTimeout(scrolldelay);
  }
  $(function () {              
            //绑定滚动条事件  
              //绑定滚动条事件  
              $(window).bind("scroll", function () {  
                var sTop = $(window).scrollTop();  
                var sTop = parseInt(sTop);  
                if (sTop >= 400) {  
                  if (!$("#fhtop").is(":visible")) {  
                    try {  
                      $("#fhtop").slideDown();  
                    } catch (e) {  
                      $("#fhtop").show();  
                    }                        
                  }  
                }  
                else {  
                  if ($("#fhtop").is(":visible")) {  
                    try {  
                      $("#fhtop").slideUp();  
                    } catch (e) {  
                      $("#fhtop").hide();  
                    }                         
                  }  
                }   
              });  
            })  
          </script>

          <!-- InstanceEnd --></html>
