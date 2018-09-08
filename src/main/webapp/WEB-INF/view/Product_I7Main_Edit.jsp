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
<body onload="load()">	<jsp:include page="backnav.jsp">
    	<jsp:param value="4" name="number1"/>
    	<jsp:param value="4.1" name="number2"/>
  	</jsp:include>
  	<label class="msgbox" id="result"/>
  	<input type="hidden"  id="pid" value="${entity.pid}"/>
      <div class="header">
        <div class="now color"><a href="../../back/index"  class="color">后台</a> -> 产品介绍  -> 产品编辑</div>
      </div>
      
      <div class="flatmain">
      	<a class="style1">产品信息编辑</a>
        <div class="sform3">
            <ul>
              <form action="" method="post">
              <li>
                <div class="fll1">标题<strong class="red">*</strong></div>
                <div class="gil3"><input  class="contactinputs1" value="${entity.pname}" id="pname" name="pname" type="text" id="title">
                </div>
                
              </li>
              <li>
                <div class="fll1">介绍分项<strong class="red">*</strong></div>
                <div class="gil3">
                <ul><c:forEach items="${jsonArray}" var="item" varStatus="xh">
                  <li> 
                        <textarea class="textyu1"  rows="3" id="textarea1"></textarea>
                        <c:if test="${state.equals('shortupdate')||state.equals('chupdate')||state.equals('funcupdate') }">
							 <c:if test="${xh.index==0}">
	                 			<input class="bottons2 c_green" name="input" id="change" type="button" value="+" onClick="add_li(this)">
	                 		</c:if>                       		
							<c:if test="${xh.index!=0}">
                       			<input class="bottons2 c_red" name="input" id="change" type="button" value="-" onClick="del_li(this)">
                 			</c:if>
                 		</c:if>
                 		
                  </li>
                  </c:forEach>
                  <li> 
                  <c:if test="${state.equals('shortsave')||state.equals('chsave')||state.equals('funcsave') }">
                       		<textarea class="textyu1"  rows="3" id="textarea1"></textarea>
                       		<input class="bottons2 c_green" name="input" id="change" type="button" value="+" onClick="add_li(this)">
                 	</c:if>
                 	</li>
                  <div class="li_box"></div>
                </ul>
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
      	
      <div class="save">
      <input class="bottons c_green"  id="add" name="input" type="submit" value="添加" >
    </div>
      </div>

    </div>
    <!-- InstanceEndEditable -->

</body>
<!-- InstanceBeginEditable name="EditRegion4" -->
<script>
 function load(){

	
 	var sstr="";
	var li = '${ jsonArray}';
	var keyList =  eval(li);
	var li_num=$(".gil3 ul li").size();//有多少个li
	if (li!="") {
		for(i=0;i<=li_num-1;i++){
			var str=".gil3 ul li:eq("+i+")";
			var texa=$(str).find("textarea").val();
			sstr+=texa;
			$(".gil3 ul li:eq("+i+")").find("textarea").val(keyList[i]);
		}  

		
	}

	
 }
	
	/* alert(arr1.size());
	for(i=0;i<=thelist.size()-1;i++){
		var str=".gil3 ul li:eq("+i+")";
		var texa=$(str).find("textarea").val();
		sstr+=texa;
		alert(thelist.get(i));
		$(".gil3 ul li:eq("+i+")").find("textarea").val("asd");
	} */



/* upload= function (){
	var context="";
	var li_num=$(".gil3 ul li").size();
	for(i=0;i<=li_num-1;i++){
		var str=".gil3 ul li:eq("+i+")";
		var texa=$(str).find("textarea").val();
		context+="<wdd>"+texa+"</wdd>";
	}
    var pname = $("#pname").val();
    var sphoto = UE.getEditor('editor').getContent();
    console.log("context"+context);
    console.log("pname"+pname);
    console.log("sphoto"+sphoto);
    jQuery.ajax({
        type: 'post',
        
        url: "${state}?bid=${bid}",
        async: false,
        cache: false,*/
            /* contentType:'application/x-www-form-urlencoded; charset=UTF-8', */
          /*   data: {"context":context,"pname":pname ,"sphoto":sphoto },
            success: function (data) {
            	 console.log("成功");
            }
    });
}   */
  function add_li(obj) {
	$(".li_box").append('<li><textarea class="textyu1" rows="3" id="textarea1"></textarea><input class="bottons2 c_red" name="input" type="button" value="-" onClick="del_li(this)"></li>');
  }
	function del_li(obj) {
 
		
    $(obj).parent().remove();
  }
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

function check_all(){
	var ti2=$(".textyu1").val();
	var tit=$("#title").val();
	if(tit==""||ti2==""){
		alert("注意，星号项为必填项！");
		}
	}
var ue = UE.getEditor('editor');
var aa =   '${intro}';
	ue.ready(function() { 
		UE.getEditor('editor').setContent(aa); 
		}); 
	
	
	$(document).ready(function() {
		$("#add").click(function() {
		    var context="";
			var li_num=$(".gil3 ul li").size();
			
			for(i=0;i<=li_num-1;i++){
				var str=".gil3 ul li:eq("+i+")";
				var texa=$(str).find("textarea").val();
				if (texa!=undefined) {
					texa = texa.replace(/[\r\n]/g,"");
					context+="<wdd>"+texa+"</wdd>";
				}
			}
			var json = {
				"pname" : $("#pname").val() ,
				"sphoto" :stringToByte(UE.getEditor('editor').getContent())  ,
				"context" :stringToByte( context),
				"belong" : ${bid},   
				"cphoto" :stringToByte(UE.getEditor('editor').getContent())  ,
				"fphoto" :stringToByte(UE.getEditor('editor').getContent())  ,
				"pid":$("#pid").val()
			};
			
			$.ajax({
				url : '${state}',
				type : "POST",
				data : JSON.stringify(json), //转JSON字符串  
				dataType : 'json',
				contentType : 'application/json;charset=UTF-8',
				success : function(info) {
					$("#result").html(info.message);
					if (info.message.indexOf("login success") != -1) {
						alert("成功");
						window.location.href = "detail?bid="+${bid};
					} else if (info.message.indexOf("Unauthorized") != -1) {
						alert("未授权!");
					}
				},
				error : function(info) {
					
					window.location.href = "detail?bid="+${bid};
				}
			});
		});
	});
</script>
<!-- InstanceEndEditable -->
        
<!-- InstanceEnd --></html>


