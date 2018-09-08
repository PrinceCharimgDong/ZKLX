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
    <!-- InstanceBeginEditable name="head" -->
    <!-- InstanceEndEditable -->
</head>
<body>
		<jsp:include page="backnav.jsp">
    	<jsp:param value="4" name="number1"/>
    	<jsp:param value="4.1" name="number2"/>
  	</jsp:include>
      <div class="header">
        <div class="now color"><a href="../../back/index"  class="color">后台</a> -> 产品介绍</div>
      </div>
      
      <div class="list">
      <a class="style1">产品分类</a>
        <div class="listbox">
            
            <div class="buttonbox">
                <input type="button" value="添加" class="bottons c_green" onClick="window.location.href='add'">
                
            </div>
            <div class="tablemain">
                <table width="100%">
                  <tr>
                    <th width="1%" scope="col"></th>
                    <th width="24%" scope="col">产品类型</th>
                    <th width="26%" scope="col">操作</th>
                  </tr>
                   <c:forEach var="item" items="${list}" varStatus="xh">
                  <tr>
                    <td><input name="select" type="checkbox" class="fang_cb"></td>
                    <td><a href="sublist?id=${item.pid}" class="color1">${item.pname }</a></td>
                    <td>
                    	<input type="button" value="编辑" class="bottons c_qing" onclick="location.href='update?id=${item.pid}'">
                        <input type="button" value="删除" class="bottons c_red" onClick="alert_del(${item.pid})">
                    </td>
                  </tr>
                 </c:forEach>
                  
                </table>
    
            </div>
        </div>
      </div>
          
          
    </div>
    <!-- InstanceEndEditable -->

</body>
<!-- InstanceBeginEditable name="EditRegion4" -->
<script>
function alert_show1(){
		var returned = window.confirm("是否更改当前状态？"); 
		var key=$("#selecta1").val();
		if(returned==true&&key=="1"){ 
			$("#selecta1 option[value='1']").prop("selected","selected");      
		}
		if(returned==true&&key=="0"){ 
			$("#selecta1 option[value='0']").prop("selected","selected");      
		} 
		if(returned==false&&key=="0"){ 
			$("#selecta1 option[value='1']").prop("selected","selected");      
		} 
		if(returned==false&&key=="1"){ 
			$("#selecta1 option[value='0']").prop("selected","selected");      
		} 
			
		}


function alert_show2(){
		var returned = window.confirm("是否更改当前状态？"); 
		var key=$("#selecta2").val();
		if(returned==true&&key=="1"){ 
			$("#selecta2 option[value='1']").prop("selected","selected");      
		}
		if(returned==true&&key=="0"){ 
			$("#selecta2 option[value='0']").prop("selected","selected");      
		} 
		if(returned==false&&key=="0"){ 
			$("#selecta2 option[value='1']").prop("selected","selected");      
		} 
		if(returned==false&&key=="1"){ 
			$("#selecta2 option[value='0']").prop("selected","selected");      
		} 
			
		}
	function alert_del(aa) {
		var res = confirm("是否删除当前内容？");
		if(res){
			location.href='delete?id='+aa
		}
		}

</script>
<!-- InstanceEndEditable -->
        
<!-- InstanceEnd --></html>


