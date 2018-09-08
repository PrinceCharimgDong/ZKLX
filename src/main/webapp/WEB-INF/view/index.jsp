<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %> 
<%@ page import="util.*"%>
<html xmlns="http://www.w3.org/1999/xhtml"><!-- InstanceBegin template="/Templates/muban.dwt" codeOutsideHTMLIsLocked="false" -->
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
  <!-- InstanceBeginEditable name="doctitle" -->
	<title>广东中科立信科技有限公司</title>
	<!-- InstanceEndEditable --> 
  <!-- InstanceBeginEditable name="head" -->
	<!-- InstanceEndEditable --> 
  <link href="CSS/css.css" rel="stylesheet" type="text/css" />
  <script type="text/javascript" src="js/jquery-1.7.2.min.js"></script>
  <script type="text/javascript" src="js/jquery.SuperSlide.2.1.1.js"></script>  
  <link rel="shortcut icon" type="image/x-icon" href="images/favicon.ico" />
</head> 
<body   >
  <%  Object inString,instring1,inString1;
					   ByteToStr byteToStr =new ByteToStr();
					   CutLength cutLength = new CutLength();
					   ShowPhoto showPhoto = new ShowPhoto();
					 	ShowText showText =new ShowText();
					 %>    
 <jsp:include page="head.jsp">
    	<jsp:param value="1" name="number1"/>
  </jsp:include> 
    <div id="fhtop" onclick="pageScroll()" style="display:none"><img src="images/float_4.png"  width="55%" height="55%" /></div>
    <div id="main">
     <!-- InstanceBeginEditable name="main" -->
			
<div id="qsq" class="qsq">
			
			<div class="bd">
				<ul>
					<c:forEach var="item" items="${list}" >
					
					<c:if test="${item.isshow!='N'}">
						<c:set var="intro" value="${item.photo }" scope="request"/>
						<%inString = request.getAttribute("intro") ;%>
							<li>
								<a href="http://${item.website}"><img src="<%=showPhoto.getPhoto(byteToStr.objToStr(inString))%>" /></a>
							</li>
					</c:if>
					
			 		</c:forEach>
				</ul>
			</div>
	<!-- 下面是前/后按钮代码，如果不需要删除即可 -->
			<a class="prev" href="javascript:void(0)"></a>
			<a class="next" href="javascript:void(0)"></a>

		</div>

		<script type="text/javascript">
			jQuery(".qsq").slide({mainCell:".bd ul",effect:"left",autoPlay:false,delayTime:1000});
		</script>
			
		
		<div class="cgal">
			<div class="cgcase">
				<div class="mousenanv"><div class="sss"><img src="images/index/dengpao.jpg"/></div>
                <div class="www">
					<ul>
					</ul>
                    </div>
				</div>
				<div class="mouseimg">
				<ul>
				<c:forEach var="item2" items="${succefulslist}">
				<c:set var="intro2" value="${item2.scontent }" scope="request"/>
					
					 <%instring1 = request.getAttribute("intro2") ;%>
						<li>
							<a href="javascript:void(0);"><img src="<%=showPhoto.getPhoto(byteToStr.objToStr(instring1))%>" /></a>
						</li>
				</c:forEach>
					
					</ul>
				</div>
			</div>
          </div>
			<div class="ywmain"><div class="ywjias">COST SAVING, RIGHT NOW!</div></div>
			<script type="text/javascript">
				jQuery(".cgcase").slide({
					mainCell:".mouseimg ul",
					titCell:".mousenanv ul",
					effect:"leftLoop",
					easing:"easeInOutCirc",
					delayTime:500,
					autoPlay:true,
					autoPage:true});
				</script>
				<div class="xushu"></div>
			<div class="big">节省<span class="hong">50%</span>IT成本，就在现在</div>
			<div class="zh"><img src="images/index/zh.jpg"/></div>
			<div class="qswy"><img src="images/index/gongneng.jpg"/></div>
            <div class="abc">
			<ul class="jycb_ul">
			
				<li>
					
					<span>
						A
					</span>
					<strong>
						<h2>云方案</h2>提供商
					</strong>
					<p>
						成本最优部署最简单的桌面云方案提供商
					</p>
                    <div class="ywcome">
					<img src="images/index/jycb_img1.png" alt="云终端">
					</div>
				</li>
				<li>
					
					<span>
						B
					</span>
					<strong>
						<h2>云终端</h2>厂商
					</strong>
					<p>
						国内唯一专注ARM架构硬解码技术的云终端厂商
					</p>
                    <div class="ywcome">
					<img src="images/index/jycb_img2.png" alt="云终端">
					</div>
				</li>
				<li>
					
					<span>
						C
					</span>
					<strong>
						<h2>虚拟桌面</h2>
					</strong>
					<p>
						虚拟桌面主流协议全系列支持
					</p>
                    <div class="ywcome">
					<img src="images/index/jycb_img3.png" alt="云终端">
					</div>
				</li>
			</ul>
		</div>
       
        </div>
        
        
        
        
        
<div class="jjfamain">
<div class="jjfa clearfix">
			<div class="jjfa_in">
				<div class="jjfa_top">
					<div class="jjfa_txt">
						<i>
							打造各行各业
							<span>解决方案</span>
						</i>
					</div>
					<div class="jjfa_img">
						<img src="images/index/jjfa_img.jpg"  alt="云桌面的优势">
					</div>
					<em>
						独一无二硬解码技术行业领导者
					</em>
					<div class="jjfa_xian"></div>
				</div>
				<div class="jjfa_lol">
					<div class="bd">
						<ul>
						
		<c:forEach items="${slist}" var="list" varStatus="row">
			<c:set var="intro1" value="${list.scontext }" scope="request"/>
					
			<%inString1 = request.getAttribute("intro1") ;%>
		<c:if test="${row.count%2!=0}">
                        <li>
	
		<div class="lol_txt">
			
			<i>
				<a href="" target="_blank">${list.title }</a>
			</i>
			
			<p>
			<%=showText.getText(byteToStr.objToStr(inString1)) %>
				
			</div>
			<img src="<%=showPhoto.getPhoto(byteToStr.objToStr(inString1))%>" alt="云终端"/>
		</li>
		</c:if>
		<c:if test="${row.count%2==0}">
							<li>
								
								<img src="<%=showPhoto.getPhoto(byteToStr.objToStr(inString1))%>" alt="云终端"/>							<div class="lol_txt">
								
								<i>
									<a href="/plandetail/41.html" target="_blank">${list.title }</a>
								</i>
								
								<p>
									<%=showText.getText(byteToStr.objToStr(inString1)) %>
								</div>
						</li>
						</c:if>
						</c:forEach>
        		</ul>
	</div>
	<div class="hd">
		<ul></ul>
	</div>
	<script type="text/javascript">
		jQuery(".jjfa_lol").slide({
			mainCell:".bd ul",
			titCell:".hd ul",
			effect:"leftLoop",
			easing:"easeInOutCirc",
			delayTime:500,
			scroll:2,
			vis:2,
			autoPage:true});
		</script>
	</div>

</div>
</div>
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
