<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="util.*"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml"><!-- InstanceBegin template="/Templates/muban.dwt" codeOutsideHTMLIsLocked="false" -->
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
  <!-- InstanceBeginEditable name="doctitle" -->
  <title>广东中科立信科技有限公司</title>
  <!-- InstanceEndEditable --> 
  <!-- InstanceBeginEditable name="head" -->
  <!-- InstanceEndEditable --> 
  <link rel="shortcut icon" type="image/x-icon" href="${pageContext.request.contextPath }/images/favicon.ico" />
  <link href="../CSS/css.css" rel="stylesheet" type="text/css" />
  <script type="text/javascript" src="../js/jquery-1.7.2.min.js"></script>
  <script type="text/javascript" src="../js/jquery.SuperSlide.2.1.1.js"></script>    
</head> 
<body   >
  	<jsp:include page="head.jsp">
    	<jsp:param value="3" name="number1"/>
  </jsp:include> 
  
  
    <div id="fhtop" onclick="pageScroll()" style="display:none"><img src="../images/float_4.png" width="55" height="55" /></div>
    <div id="main">
     <!-- InstanceBeginEditable name="main" -->

     <div class="cnanv">
    <div class="qqq">当前位置：<a href="../index">首页</a>-><a href="../news/list">公司新闻</a></div>
    
    </div>
    
    <div class="NewsMian"> 
    <div class="NWTitle">${comNewsWithBLOBs.title}</div>
    <div class="NWtime"><fmt:formatDate value="${comNewsWithBLOBs.newstime}" pattern="yyyy/MM/dd"/></div>
    	<c:set var="intro" value="${comNewsWithBLOBs.introduciton}" scope="request"/>
  			<%  Object inString;
			   ByteToStr byteToStr =new ByteToStr();
			   CutLength cutLength = new CutLength();
			   ShowPhoto showPhoto = new ShowPhoto();
			%>
			<%inString = request.getAttribute("intro") ;%>
			
    <div class="NWwz"><%= byteToStr.objToStr(inString)  %></div>
    
    </div>
     
     <!-- InstanceEndEditable --> 
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
