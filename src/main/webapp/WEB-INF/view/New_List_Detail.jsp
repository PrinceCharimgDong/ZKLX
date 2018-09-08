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
  <link rel="shortcut icon" type="image/x-icon" href="${pageContext.request.contextPath }/images/favicon.ico" />
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/CSS/admin.css">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/font/iconfont.css">
	<!-- 配置文件 -->
    <script type="text/javascript" src="${pageContext.request.contextPath }/ueditor/ueditor.config.js"></script>
    <!-- 编辑器源码文件 -->
    <script type="text/javascript" src="${pageContext.request.contextPath }/ueditor/ueditor.all.js"></script>
    
    <script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery.min.js"></script> 
    <!-- InstanceBeginEditable name="head" -->
    <!-- InstanceEndEditable -->
</head>
<body>
	<jsp:include page="backnav.jsp">
    	<jsp:param value="3" name="number1"/>
    	<jsp:param value="3.1" name="number2"/>
  	</jsp:include>
      <div class="header">
        <div class="now color"><a href="../../back/index" class="color">后台</a> -> 公司新闻 -> 新闻列表</div>
      </div>
      
      <div class="flatmain">
      	<a class="style1">添加新闻</a>
        <div class="sform3">
            <ul>
              <form >
              <li>
                <div class="fll1">标题<strong class="red">*　</strong></div>
                <div class="gill"><input  class="contactinputs" name="title" value="${comNewsWithBLOBs.title }" type="text" id="title">
                </div>
                
              </li>
			  <li>
                <div class="fll1">新闻时间<strong class="red">*　</strong></div>
                <div class="gill"><input  type="text" class="inputh"  name ="fabutime" value="<fmt:formatDate value='${comNewsWithBLOBs.newstime}' pattern='yyyy-MM-dd'/>" id="test1">
                </div>
                
              </li>
              <li>
                <div class="fll1">展示内容<strong class="red">*</strong></div>
                <div class="ueditor1">
        <!-- 加载编辑器的容器 -->
        <script id="editor" name="content" type="text/plain">
            
            </script>
        <!-- 实例化编辑器 -->
      </div>
                
              </li>
              
              </form>
            </ul>
        	</div>
      	
      <div class="save"><input class="bottons c_green" name="input" type="submit" value="添加" id ="change">
    </div>
      </div>
          
          
    </div>
    <!-- InstanceEndEditable -->

</body>
<!-- InstanceBeginEditable name="EditRegion4" -->
<script type="text/javascript">
function stringToByte(str) {
	var bytes = new Array();
	var len, c;
	len = str.length;
	for(var i = 0; i < len; i++) {
		c = str.charCodeAt(i);
		if(c >= 0x010000 && c <= 0x10FFFF) {
			bytes.push(((c >> 18) & 0x07) | 0xF0);
			bytes.push(((c >> 12) & 0x3F) | 0x80);
			bytes.push(((c >> 6) & 0x3F) | 0x80);
			bytes.push((c & 0x3F) | 0x80);
		} else if(c >= 0x000800 && c <= 0x00FFFF) {
			bytes.push(((c >> 12) & 0x0F) | 0xE0);
			bytes.push(((c >> 6) & 0x3F) | 0x80);
			bytes.push((c & 0x3F) | 0x80);
		} else if(c >= 0x000080 && c <= 0x0007FF) {
			bytes.push(((c >> 6) & 0x1F) | 0xC0);
			bytes.push((c & 0x3F) | 0x80);
		} else {
			bytes.push(c & 0xFF);
		}
	}
	return bytes;


}

$(function(){
    
    $("#change").on("click",function(){
        var title=$("#title").val();
        var ue = UE.getEditor('editor').getContent();
		var fabudate=$("#test1").val();
		if (title=="") {
			alert("请输入标题");
			return false;
		}else{
			if (ue=="") {
				alert("请输入内容");
				return false;
			}
			if (fabudate=="") {
				alert("请选择时间");
				return false;
			}
		}
		var content = stringToByte(ue);
		var id = 1;
		if (!"${comNewsWithBLOBs.cid }"==("")) {
			id = parseInt("${comNewsWithBLOBs.cid }");
		}
        var obj = {"cid":id,"title":title,"newstime":fabudate,"introduciton":content};
        var jsonStr = JSON.stringify(obj);
		/* if(tit1==""||tit2==""||tit3==""||tit4==""||tit5==""){
			alert("注意，星号项为必填项！");
			return false;  
			}else{
				if (!tit4==tit5) {
					alert("注意，两次输入密码不一致！");
					return false;  
				}
			} */
        /*
            contentType属性表示本次请求给服务器发送的数据类型是什么
                对应了之前请求头中的属性:Content-Type
            dataType属性表示本次请求希望服务器返回的数据类型是什么
                对应了之前请求头中的属性:Accept
        */
        
        
        $.ajax({
            type: "POST",
            url: "${state}",
            contentType: "application/json",
            data: jsonStr,
            dataType: "text",
            success: function(info){
            	var info= eval("("+info+")");
            	alert(info.message);
            	window.location.href='list';
            },
			error : function(info) {
				alert(JSON.stringify(info))
			}
        });
        
    });
    
});


/* 
function check_all(){
	 var formId = document.getElementById('sysForm');
		var tit=$("#title").val();
		if(tit==""){
			alert("注意，星号项为必填项！");
			}else{
				formId.submit();
			}
	}
 */
var ue = UE.getEditor('editor');
var aa =   "${intro}";
	ue.ready(function() {
		UE.getEditor('editor').setContent(aa); 
		});
</script>
 <script src="../../js/laydate.js"></script> <!-- 改成你的路径 -->
    <script>
    lay('#version').html('-v'+ laydate.v);

    //执行一个laydate实例
    //常规用法
    laydate.render({
      elem: '#test1' //指定元素
    });
    </script>
<!-- InstanceEndEditable -->
        
<!-- InstanceEnd --></html>


