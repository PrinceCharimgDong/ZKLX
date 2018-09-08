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
    	<jsp:param value="2" name="number1"/>
    	<jsp:param value="2.2" name="number2"/>
  	</jsp:include>
      <div class="header">
        <div class="now color"><a href="../../back/index"  class="color">后台</a> -> 企业简介</div>
      </div>
      
      <div class="list">
      <a class="style1">团队风采-图片列表</a>
        <div class="listbox">
            
            <div class="buttonbox">
                <input type="button" value="添加" class="bottons c_green" onClick="window.location.href='add'">
                
            </div>
            <div class="tablemain">
                <table width="100%">
                  <tr>
                    <th width="1%" scope="col"></th>
                    <th width="24%" scope="col">标题</th>
                    <th width="23%" scope="col">更新时间</th>
                    <th width="9%" scope="col">状态</th>
                    <th width="20%" scope="col">操作</th>
                  </tr>
             <c:forEach var="item" items="${list}" varStatus="xh">
 		   <c:set var="intro" value="${item.photo}" scope="request"/>
 		   <%  Object inString;
			   ByteToStr byteToStr =new ByteToStr();
			   CutLength cutLength = new CutLength();
			   ShowPhoto showPhoto = new ShowPhoto();
		   %>
		   <%inString = request.getAttribute("intro") ;%>
                  <tr>
                    <td><input name="select" type="checkbox" class="fang_cb"></td>
                    <td>${item.title}</td>
                    <td>
            <fmt:formatDate value="${item.changeTime}" pattern="yyyy/MM/dd HH:mm"/></td>
                    <td>
                    	<select onChange="alert_show1(${item.eid})" name="state" value="0" class="c_blue" id="selecta1">
                            <c:choose>
                            	<c:when test="${item.isshow=='Y'}"><option value="Y" selected="selected">显示</option></c:when>
                            	<c:otherwise><option value="Y" >显示</option></c:otherwise>
                            </c:choose>
                            <c:choose>
                            	<c:when test="${item.isshow=='N'}"><option value="N" selected="selected">不显示</option></c:when>
                            	<c:otherwise><option value="N" >不显示</option></c:otherwise>
                            </c:choose>
                        </select>
					</td>
                    <td>
                    	<input type="button" value="编辑" class="bottons c_qing"  onclick="location.href='update?id=${item.eid}'">
                        <input type="button" value="删除" class="bottons c_red" onClick="alert_del(${item.eid})">
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
function alert_show1(hid){
	var returned = window.confirm("是否更改当前状态？"); 
	var key=$("#selecta1").val();
	var obj = {"eid":hid,"isshow":key};
    var jsonStr = JSON.stringify(obj);
    console.log(jsonStr);
    $.ajax({
        type: "POST",
        url: "isshow",
        contentType: "application/json",
        data: jsonStr,
        dataType: "text",
        success: function(info){
        	var info= eval("("+info+")");
        	alert(info.message);
        	//window.location.href='list';
        },
		error : function(info) {
			alert(JSON.stringify(info))
		}
    }); 
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

function alert_show3(){
		var returned = window.confirm("是否更改当前状态？"); 
		var key=$("#selecta3").val();
		if(returned==true&&key=="1"){ 
			$("#selecta3 option[value='1']").prop("selected","selected");      
		}
		if(returned==true&&key=="0"){ 
			$("#selecta3 option[value='0']").prop("selected","selected");      
		} 
		if(returned==false&&key=="0"){ 
			$("#selecta3 option[value='1']").prop("selected","selected");      
		} 
		if(returned==false&&key=="1"){ 
			$("#selecta3 option[value='0']").prop("selected","selected");      
		} 
			
		}

function alert_show4(){
		var returned = window.confirm("是否更改当前状态？"); 
		var key=$("#selecta4").val();
		if(returned==true&&key=="1"){ 
			$("#selecta4 option[value='1']").prop("selected","selected");      
		}
		if(returned==true&&key=="0"){ 
			$("#selecta4 option[value='0']").prop("selected","selected");      
		} 
		if(returned==false&&key=="0"){ 
			$("#selecta4 option[value='1']").prop("selected","selected");      
		} 
		if(returned==false&&key=="1"){ 
			$("#selecta4 option[value='0']").prop("selected","selected");      
		} 
			
		}

function alert_show5(){
		var returned = window.confirm("是否更改当前状态？"); 
		var key=$("#selecta5").val();
		if(returned==true&&key=="1"){ 
			$("#selecta5 option[value='1']").prop("selected","selected");      
		}
		if(returned==true&&key=="0"){ 
			$("#selecta5 option[value='0']").prop("selected","selected");      
		} 
		if(returned==false&&key=="0"){ 
			$("#selecta5 option[value='1']").prop("selected","selected");      
		} 
		if(returned==false&&key=="1"){ 
			$("#selecta5 option[value='0']").prop("selected","selected");      
		} 
			
		}

function alert_show6(){
		var returned = window.confirm("是否更改当前状态？"); 
		var key=$("#selecta6").val();
		if(returned==true&&key=="1"){ 
			$("#selecta6 option[value='1']").prop("selected","selected");      
		}
		if(returned==true&&key=="0"){ 
			$("#selecta6 option[value='0']").prop("selected","selected");      
		} 
		if(returned==false&&key=="0"){ 
			$("#selecta6 option[value='1']").prop("selected","selected");      
		} 
		if(returned==false&&key=="1"){ 
			$("#selecta6 option[value='0']").prop("selected","selected");      
		} 
			
		}
function alert_show7(){
		var returned = window.confirm("是否更改当前状态？"); 
		var key=$("#selecta7").val();
		if(returned==true&&key=="1"){ 
			$("#selecta7 option[value='1']").prop("selected","selected");      
		}
		if(returned==true&&key=="0"){ 
			$("#selecta7 option[value='0']").prop("selected","selected");      
		} 
		if(returned==false&&key=="0"){ 
			$("#selecta7 option[value='1']").prop("selected","selected");      
		} 
		if(returned==false&&key=="1"){ 
			$("#selecta7 option[value='0']").prop("selected","selected");      
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
        
<!-- InstanceEnd -->
</html>


