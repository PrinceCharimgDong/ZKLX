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
        <div class="now color"><a href="../../back/index"  class="color">后台</a> -> 产品介绍</div>
      </div>
      
      <div class="banneraddmain">
     	 <a class="style1">添加产品类型</a>
         <div class="contactbox1">
        	<div class="sform2">
            <ul>
              <form action="<c:if test="${state.equals('save')}">save</c:if>
<c:if test="${state.equals('update')}">update?id=${product.pid }</c:if>" id="sysForm" method="post">
              <li>
                <div class="fll1">类型名称<strong class="red">*</strong></div>
                <div class="gill"><input  class="contactinputs"  value="${product.pname }" name="pname" type="text" id="title">
                </div>
                
              </li>
              </form>
            </ul>
        	</div>
        	<div class="save"><input class="bottons c_green" name="input" type="submit" value="添加" onClick="check_all()">
    </div>
        </div>

      </div>
          
          
    </div>
    <!-- InstanceEndEditable -->

</body>
<!-- InstanceBeginEditable name="EditRegion4" -->
<script>
function check_all(){
	var tit=$("#title").val();
	 var formId = document.getElementById('sysForm');
	if(tit==""){
		alert("注意，星号项为必填项！");
		}else{
			formId.submit();
		}
	}
</script>
<!-- InstanceEndEditable -->
        
<!-- InstanceEnd --></html>


