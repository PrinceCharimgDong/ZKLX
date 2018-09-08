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
<!-- InstanceEndEditable -->
  <link rel="shortcut icon" type="image/x-icon" href="../../images/favicon.ico" />
    <!-- InstanceBeginEditable name="head" -->
    <!-- InstanceEndEditable -->
</head>
<body onload="load()">
	<jsp:include page="backnav.jsp">
    	<jsp:param value="4" name="number1"/>
    	<jsp:param value="4.1" name="number2"/>
  	</jsp:include>
      <div class="header">
        <div class="now color"><a href="../../back/index"  class="color">后台</a> -> 产品介绍 -> 云终端 -> I7主机</div>
      </div>
      
      <div class="flatmain">
      	<a class="style1">产品介绍编辑</a>
        <div class="sform3">
            <ul>
              <form action=" <c:if test="${state.equals('pasave')}">pasave?bid=${bid}</c:if>
							<c:if test="${state.equals('paupdate')}">paupdate?id=${entity.pid}&bid=${entity.belong}</c:if> " method="post" id="sysForm">
              <li>
                <div class="fll1">标题<strong class="red">*</strong></div>
                <div class="gil3"><input  class="contactinputs1" value="${entity.context}" id="pname" name="pname" type="text" id="title">
                </div>
                
              </li>
              <li>
                <div class="fll1">展示内容<strong class="red">*</strong></div>
                <div class="ueditor1">
        <!-- 加载编辑器的容器 -->
        <script id="editor" name="sphoto" type="text/plain">
            
        </script>
        <!-- 实例化编辑器 -->
      </div>
                
              </li>
              
              </form>
            </ul>
        	</div>
      	
      <div class="save">
      <input class="bottons c_green" name="input" type="submit" value="添加" onClick="upload();">
    </div>
      </div>

    </div>
    <!-- InstanceEndEditable -->

</body>
<!-- InstanceBeginEditable name="EditRegion4" -->
<script>
 function load(){
	/* var sstr="";
	var keyList = eval('${strings}');
	var li_num=$(".gil3 ul li").size();//有多少个li
	for(i=0;i<=li_num-1;i++){
		var str=".gil3 ul li:eq("+i+")";
		var texa=$(str).find("textarea").val();
		sstr+=texa;
		$(".gil3 ul li:eq("+i+")").find("textarea").val(keyList[i]);
	}  */
 }
	
	/* alert(arr1.size());
	for(i=0;i<=thelist.size()-1;i++){
		var str=".gil3 ul li:eq("+i+")";
		var texa=$(str).find("textarea").val();
		sstr+=texa;
		alert(thelist.get(i));
		$(".gil3 ul li:eq("+i+")").find("textarea").val("asd");
	} */



upload= function (){
		var formId = document.getElementById('sysForm');
		var tit=$("#title").val();
		if(tit==""){
			alert("注意，星号项为必填项！");
			}else{
				formId.submit();
			}
		}
 
 

var ue = UE.getEditor('editor');
var aa =   "${intro}";
	ue.ready(function() { 
		UE.getEditor('editor').setContent(aa); 
		}); 
</script>
<!-- InstanceEndEditable -->
        
<!-- InstanceEnd --></html>


