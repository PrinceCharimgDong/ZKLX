 <%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %> 
<%@ page import="util.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml"><!-- InstanceBegin template="/Templates/muban.dwt" codeOutsideHTMLIsLocked="false" -->
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
  <!-- InstanceBeginEditable name="doctitle" -->
  <title>广东中科立信科技有限公司</title>
  <!-- InstanceEndEditable --> 
  <!-- InstanceBeginEditable name="head" -->
  <!-- InstanceEndEditable --> 
  <link href="../CSS/css.css" rel="stylesheet" type="text/css" />
  <script type="text/javascript" src="../js/jquery-1.7.2.min.js"></script>
  <script type="text/javascript" src="../js/jquery.SuperSlide.2.1.1.js"></script>    
  <link rel="shortcut icon" type="image/x-icon" href="../images/favicon.ico" />
</head> 
<body  >
			<%  Object inString1,inString2,inString3,inString4;
			   ByteToStr byteToStr =new ByteToStr();
			   ShowPhoto showPhoto = new ShowPhoto();
			%>
 <jsp:include page="head.jsp">
    	<jsp:param value="4" name="number1"/>
  </jsp:include> 
    <div id="fhtop" onclick="pageScroll()" style="display:none"><img src="../images/float_4.png" width="55" height="55" /></div>
    <div id="main">
     <!-- InstanceBeginEditable name="main" -->
     
     
     
    <div class="fenlei">
      <ul>
	       <c:forEach var="item" items="${list}" varStatus="xh2">
		 	 <li><a href="listchange?id=${item.pid}" <c:if test="${item.pid==product}">  style="color:#F00"</c:if>>
		 	 
		 	
		 	 ${item.pname}</a></li>
		   </c:forEach> 
      </ul>
    </div>
   
    <div class="nenav">
      <ul>
         <c:forEach var="item1" items="${list1}" varStatus="xh3">
	        <li><a  href="listOne?id=${item1.pid}&bid=${item1.belong}" class="xiak" <c:if test="${item1.pid==productSub}">  style="color:#F00"</c:if>>${item1.pname}</a></li>
		 </c:forEach>
      </ul>
    </div>
    <div class="beijin">
   
	   

			<c:set var="intro" value="${shortobj.sphoto}" scope="request"/>

			<%inString1 = request.getAttribute("intro") ;%>
			 
      <div class="prodimg"><img src="<%=showPhoto.getPhoto(byteToStr.objToStr(inString1))%>"/></div>
      
      <div class="mainwz">
        <h3>${shortobj.pname }</h3>
        <ul>
<c:forEach var="sh" items="${shortlist}" varStatus="xh4">
		 	<li> ${sh}</li>
</c:forEach>
        </ul>
      </div>
    </div>
    
<div class="tedian">

         
			<c:set var="ch1" value="${charaobj.cphoto}" scope="request"/>

			<%inString2 = request.getAttribute("ch1") ;%>
      <span class="big">${charaobj.pname}<span class="hong"> 特点</span></span>
      <span class="bigs">${charaobj.pengname} FEATURES</span>
    <div class="tdmain">
       <div class="tdimg"><img src="<%=showPhoto.getPhoto(byteToStr.objToStr(inString2))%>"/></div>
       <div class="tdfon">
         <ul>
		 	<c:forEach var="ch" items="${charalist}" varStatus="xh4">
		 	<li> ${ch}</li>
			</c:forEach>
        </ul>
      </div>
    </div> 
</div>
 
   <div class="gngs">
   

			<c:set var="fu1" value="${funcobj.fphoto}" scope="request"/>

			<%inString3 = request.getAttribute("fu1") ;%>
	    <div class="gnimg"> <img src="<%=showPhoto.getPhoto(byteToStr.objToStr(inString3))%>" /></div>
	    <div class="gnmiaos">
	    <span class="gntit">${funcobj.pname } <span class="hong">功能概述</span></span>
		 	
			 	<c:forEach var="fu" items="${funclist}" varStatus="xh4">
			 	<p class="ngbai"> 
					<li class="ngbai"> ${fu}</li>
				</p>
				</c:forEach>
			
    </div>
    </div> 
    
    <div class="canshu">
    <span class="big hong">产品参数</span>
    <span class="bigs">PRODUCT PARAMETERS</span>
    <c:set var="pa1" value="${paraobj.pname}" scope="request"/>

			<%inString4 = request.getAttribute("pa1") ;%>
    <div class="csimg"><img src="<%=showPhoto.getPhoto(byteToStr.objToStr(inString4))%>"/></div>
    </div> 
    
	<script type="text/javascript">
      jQuery(".hangye .hynanv").slide({ mainCell:"ul",vis:4,prevCell:".sPrev",nextCell:".sNext",effect:"leftLoop"});
    </script>
    	
    
    
    
    
    
    
    <!-- InstanceEndEditable --> 
   </div>
   
 </div>
 <div id="footer"> 
  <div  id="copyright" class="align">Copyright © 2017 gdzklx.com 粤ICP备17081505号</div>
  <div id="nanvs">
    <ul>
      <li><a href="culture.html">企业简介</a></li> 
      <li><a href="news.html">公司新闻</a></li>
      <li><a href="productq.html">产品介绍</a></li>
      <li><a href="case.html">项目案例</a></li>
      <li><a href="contact.html">联系我们</a></li>
    </ul>
  </div>

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
