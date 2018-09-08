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
<body> <jsp:include page="head.jsp">
    	<jsp:param value="2" name="number1"/>
  </jsp:include> 
  
    <div id="fhtop" onclick="pageScroll()" style="display:none"><img src="../images/float_4.png" width="55" height="55" /></div>
    <div id="main">
    
<div id="qsq" class="qsq">
			
			<div class="bd">
				<ul>
					<c:forEach var="item1" items="${list1}" varStatus="xlh">
					 <c:if test="${xlh.index==0}">
					<c:set var="intro1" value="${item1.photo }" scope="request"/>
					 <%  Object inString1;
					   ByteToStr byteToStr =new ByteToStr();
					   CutLength cutLength = new CutLength();
					   ShowPhoto showPhoto = new ShowPhoto();
					 %>    
					 <%inString1 = request.getAttribute("intro1") ;%>
						<li><a href="http://${item1.website }"><img src="<%=showPhoto.getPhoto(byteToStr.objToStr(inString1))%>" /></a>
						</li>
						</c:if>
			 		</c:forEach>
				</ul>
			</div>


		</div>

<div class="cnanv">
    <div class="qqq">当前位置：<a href="../index">首页</a>-><a href="list">荣誉资质</a></div>
    <div class="cluture">
        <a href="../short/list" >公司简介</a>
        <a href="../honor/list" class="on">荣誉资质</a>
    </div>
    </div>
    <div class="hengxian"></div>
  
  
  <div class="hono">
	<div class="hono_in">
		<div class="hono_left">
			<img src="../images/clutrue/img1.jpg"  alt="守合同重信用企业牌匾" title="守合同重信用企业牌匾" />
		</div>
		<div class="hono_right">
			<ul class="hono_ul clearfix">
			<c:forEach var="item" items="${list}" varStatus="xh">
			<c:set var="intro" value="${item.photo}" scope="request"/>
   		  	<%  Object inString;
			   ByteToStr byteToStr =new ByteToStr();
			   CutLength cutLength = new CutLength();
			   ShowPhoto showPhoto = new ShowPhoto();
			%>
			<%inString = request.getAttribute("intro") ;%>
				<li >
				<img src="<%=showPhoto.getPhoto(byteToStr.objToStr(inString)) %>"  alt="${item.title}" title="${item.title}"/>
			</c:forEach>
			</ul>
			<div class="fanye2 clearfix">
				        				
			</div>
		</div>
	</div>
</div>
<script type="text/javascript">
	$(function(){
		$(".hono_ul li").click(function() {
			var src = $(this).children('img').attr("src");
			var tit=$(this).children('img').attr("title");
			$(".hono_left").children('img').attr("src",src);
			$(".hono_left").children('img').attr("title",tit);
			$(this).addClass('on').siblings('li').removeClass('on');
		});
	});

</script>
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