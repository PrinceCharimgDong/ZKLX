<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %> 
<!DOCTYPE html>
<html><!-- InstanceBegin template="/Templates/admin.dwt" codeOutsideHTMLIsLocked="false" -->
<head>
<meta charset="utf-8">
<!-- InstanceBeginEditable name="doctitle" -->
<title>广东中科立信科技有限公司</title>
    <!-- InstanceBeginEditable name="head" -->
    <!-- InstanceEndEditable -->
  <link rel="shortcut icon" type="image/x-icon" href="../../images/favicon.ico" />
</head>
<body>

	 <jsp:include page="backnav.jsp">
    	<jsp:param value="6" name="number1"/>
    	<jsp:param value="6.1" name="number2"/>
  	</jsp:include>


      <div class="header">
        <div class="now color"><a href="../../back/index" class="color">后台</a> -> 联系我们</div>
      </div>
	  <div class="flatmain">
      	<a class="style1">公司信息管理</a>
      	<div class="contactbox">
        	<div class="sform1">
            <ul>
              <form action="save?id=${about.aid }" method="post" enctype="multipart/form-data" id="aboutForm">
            ${resu}  <c:if test="${resu}">
	              <li>
	                <div class="fll1">公司名称<strong class="red">${resu }</strong></div>
	              </li>
              </c:if>
              <li>
                <div class="fll1">公司名称<strong class="red">*</strong></div>
                <div class="gill"><input  class="contactinputs" name="comname" value="${about.comname }" type="text" id="box1"></div>
              </li>
              <li>
                <div class="fll1">地址<strong class="red">*</strong>　　</div>
                <div class="gill"><input  class="contactinputs" name="address" value="${about.address }" type="text" id="box2"></div>
              </li>
              <li>
                <div class="fll1">联系电话<strong class="red">*</strong></div>
                <div class="gill"><input  class="contactinputs" name="comtel" type="text"  value="${about.comtel }" id="box3"></div>
              </li>
              <li>
                <div class="fll1">联系人<strong class="red">*</strong>　</div>
                <div class="gill"><input  class="contactinputs" name="person1" type="text" value="${about.person1 }" id="box4"></div>
              </li> 
              <li>
                <div class="fll1">手机号码<strong class="red">*</strong></div>
                <div class="gill"><input  class="contactinputs" name="phone"  value="${about.phone }" type="text" id="box5"></div>
              </li>
              <li>
                <div class="fll1">联系人<strong class="red">*</strong>　</div>
                <div class="gill"><input  class="contactinputs" name="person2" value="${about.person2 }" type="text" id="box6"></div>
              </li>
              <li>
                <div class="fll1">公司邮箱<strong class="red">*</strong></div>
                <div class="gill"><input  class="contactinputs" name="emial"  value="${about.emial }" type="text" id="box7"></div>
              </li>
              <li>
                <div class="fll1">服务电话<strong class="red">*</strong></div>
                <div class="gill"><input  class="contactinputs" name="servicetel" value="${about.servicetel }" type="text" id="box8"></div>
              </li>
            
              </form>
            </ul>
        	</div>
        	<div class="save"><input class="bottons c_green" name="input" type="submit" value="保存" onClick="check_all()"/>
    </div>
        </div>
      </div>
    </div>
    <!-- InstanceEndEditable -->

</body>
<!-- InstanceBeginEditable name="EditRegion4" -->
<script type="text/javascript">
function check_all(){
	var tit1=$("#box1").val();
	var tit2=$("#box2").val();
	var tit3=$("#box3").val();
	var tit4=$("#box4").val();
	var tit5=$("#box5").val();
	var tit6=$("#box6").val();
	var tit7=$("#box7").val();
	var tit8=$("#box8").val();
    var formId = document.getElementById('aboutForm');
	if(tit1==""||tit2==""||tit3==""||tit4==""||tit5==""||tit6==""||tit7==""||tit8==""){
		alert("注意，星号项为必填项！");
		}
	else{
		 formId.submit();
	}
	}

</script>
<!-- InstanceEndEditable -->
        
<!-- InstanceEnd --></html>


