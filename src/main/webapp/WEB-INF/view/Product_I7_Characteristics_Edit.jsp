<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %> 
<%@ page import="util.*"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html><!-- InstanceBegin template="/Templates/admin.dwt" codeOutsideHTMLIsLocked="false" -->
<head>
<meta charset="utf-8">
<!-- InstanceBeginEditable name="doctitle" -->
<title>广东中科立信科技有限公司</title>
  <link rel="shortcut icon" type="image/x-icon" href="../../images/favicon.ico" />
</head>
<body>
		<jsp:include page="backnav.jsp">
    	<jsp:param value="4" name="number1"/>
    	<jsp:param value="4.1" name="number2"/>
  	</jsp:include>
      <div class="header">
        <div class="now color"><a href="../../back/index"  class="color">后台</a> -> 产品介绍 -> 云终端 -> I7主机</div>
      </div>
      
      <div class="flatmain">
      	<a class="style1">产品特点编辑</a>
        <div class="sform3">
            <ul>
              <form action="" method="post">
              <li>
                <div class="fll1">标题<strong class="red">*　　</strong></div>
                <div class="gil3"><input  class="contactinputs1" name="input" type="text" id="title">
                </div>
                
              </li>
              <li>
                <div class="fll1">介绍分项<strong class="red">*</strong></div>
                <div class="gil3">
                <ul>
                  <li>
                        <textarea class="textyu1" rows="3" id="textarea1"></textarea>
                       <input class="bottons2 c_green" name="input" type="button" value="+" onClick="add_li(this)">
                  </li>
                  <div class="li_box"></div>
                </ul>
                </div>
                
              </li>
              <li>
                <div class="fll1">展示内容<strong class="red">*</strong></div>
                <div class="ueditor1">
        <!-- 加载编辑器的容器 -->
        <script id="container" name="content" type="text/plain">
            
        </script>
        <!-- 实例化编辑器 -->
      </div>
                
              </li>
              
              </form>
            </ul>
        	</div>
      	
      <div class="save"><input class="bottons c_green" name="input" type="submit" value="添加" onClick="check_all()"><input class="bottons c_green" name="input" type="submit" value="sdd" onClick="now_li()">
    </div>
      </div>

    </div>
    <!-- InstanceEndEditable -->

</body>
<!-- InstanceBeginEditable name="EditRegion4" -->
<script>
function now_li(){
	var sstr="";
	var li_num=$(".gil3 ul li").size();
	for(i=0;i<=li_num-1;i++){
		var str=".gil3 ul li:eq("+i+")";
		var texa=$(str).find("textarea").val();
		sstr+=texa;
	}
	alert(sstr);

}
  function add_li(obj) {
	$(".li_box").append('<li><textarea class="textyu1" rows="3" id="textarea1"></textarea><input class="bottons2 c_red" name="input" type="button" value="-" onClick="del_li(this)"></li>');
  }
	function del_li(obj) {
    $(obj).parent().remove();
  }

function check_all(){
	var ti2=$(".textyu1").val();
	var tit=$("#title").val();
	if(tit==""||ti2==""){
		alert("注意，星号项为必填项！");
		}
	}
	var ue = UE.getEditor('container',{zIndex: 0});
</script>
<!-- InstanceEndEditable -->
        
<!-- InstanceEnd --></html>


