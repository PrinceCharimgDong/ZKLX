<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %> 
<%@ page import="util.*"%>
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
    	<jsp:param value="2" name="number1"/>
    	<jsp:param value="2.1" name="number2"/>
  	</jsp:include>
      <div class="header">
        <div class="now color"><a href="../../back/index" class="color">后台</a> -> 企业简介</div>
      </div>
      <form action="update?id=${comShort.cid }" method="post" id="sysForm">
      <div class="flatmain">
      	<a class="style1">公司简介</a>
        
      	<div class="ueditor">
        <!-- 加载编辑器的容器 -->
         <script  id="editor" name="content" type="text/plain" >
            
            </script>
        <!-- 实例化编辑器 -->
      </div>
      <div class="save"><input class="bottons c_green" name="input" type="submit" value="添加" onClick="check_all()">
    </div>
      </div>
      </form>
          
          
    </div>
    <!-- InstanceEndEditable -->

</body>
<!-- InstanceBeginEditable name="EditRegion4" -->



<script type="text/javascript">
function check_all(){
	 var formId = document.getElementById('sysForm');

			formId.submit();
		
	}
	
//var ue = UE.getEditor('container',{zIndex: 0});

//实例化编辑器
//建议使用工厂方法getEditor创建和引用编辑器实例，如果在某个闭包下引用该编辑器，直接调用UE.getEditor('editor')就能拿到相关的实例
var ue = UE.getEditor('editor');
var q= '${intro}';
/* var aa =   "${intro}"; */
 	ue.ready( function() {
		 UE.getEditor('editor').setContent(q); 
		});   
</script>
<!-- InstanceEndEditable -->
        
<!-- InstanceEnd --></html>


