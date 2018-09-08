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
      
      <div class="flatmain">
      	<a class="style2">公司简介</a>
        <div class="save1"><input class="bottons c_qing" name="input" type="submit" value="编辑"  onClick="window.location.href='update'">
    </div>
        <div class="gsjj">
      <div class="jjmain">
        <a class="jjt"><img src="${photopath}"/></a>
        <p>${text}</p>

        </div>
      </div>
      	
      
      </div>
      
          
          
    </div>
    <!-- InstanceEndEditable -->

</body>
<!-- InstanceBeginEditable name="EditRegion4" -->



<script type="text/javascript">
	
</script>
<!-- InstanceEndEditable -->
        
<!-- InstanceEnd --></html>


