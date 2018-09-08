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
        <div class="now color"><a href="../../back/index"  class="color">后台</a> -> 产品介绍 -> ${name }</div>
      </div>
      
      <div class="list">
      <a class="style1">${name }</a>
        <div class="listbox">
            
            
            <div class="tablemain">
                <table width="100%">
                  <tr>
                    <th width="1%" scope="col"></th>
                    <th width="10%" scope="col">序号</th>
                    <th width="50%" scope="col">标题</th>
                    <th width="39%" scope="col">操作</th>
                  </tr>
                  <tr>
                    <td><input name="select" type="checkbox" class="fang_cb"></td>
                    <td>1</td>
                    <td>产品介绍</td>
                    <td>
                    	<input type="button" value="编辑" class="bottons c_qing" onClick="window.location.href='short<c:if test="${shcount>=1 }">update</c:if><c:if test="${shcount<1 }">add</c:if>?bid=${bid}'">
                    </td>
                  </tr>
                 <tr>
                    <td><input name="select" type="checkbox" class="fang_cb"></td>
                    <td>2</td>
                    <td>产品特点</td>
                    <td>
                    	<input type="button" value="编辑" class="bottons c_qing" onClick="window.location.href='ch<c:if test="${chcount>=1 }">update</c:if><c:if test="${chcount<1 }">add</c:if>?bid=${bid}'">
                    </td>
                  </tr>
                  <tr>
                    <td><input name="select" type="checkbox" class="fang_cb"></td>
                    <td>3</td>
                    <td>功能概述</td>
                    <td>
                    	<input type="button" value="编辑" class="bottons c_qing" onClick="window.location.href='func<c:if test="${fucount>=1 }">update</c:if><c:if test="${fucount<1 }">add</c:if>?bid=${bid}'">
                    </td>
                  </tr>
                 <tr>
                    <td><input name="select" type="checkbox" class="fang_cb"></td>
                    <td>4</td>
                    <td>产品参数</td>
                    <td>
                    	<input type="button" value="编辑" class="bottons c_qing" onClick="window.location.href='pa<c:if test="${pacount>=1 }">update</c:if><c:if test="${pacount<1 }">add</c:if>?bid=${bid}'">
                    </td>
                  </tr>
                  
                </table>
    
            </div>
        </div>
      </div>
          
          
    </div>
    <!-- InstanceEndEditable -->

</body>
<!-- InstanceBeginEditable name="EditRegion4" -->

<!-- InstanceEndEditable -->
        
<!-- InstanceEnd --></html>


