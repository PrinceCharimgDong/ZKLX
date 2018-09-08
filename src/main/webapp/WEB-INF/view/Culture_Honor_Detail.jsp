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
<!-- InstanceEndEditable -->
  <link rel="shortcut icon" type="image/x-icon" href="../../images/favicon.ico" />
    <!-- InstanceBeginEditable name="head" -->
    <!-- InstanceEndEditable -->
</head>
<body>
	
 <%--  <jsp:include page="backnav.jsp"/> --%>
  
   <jsp:include page="backnav.jsp">
    
    	<jsp:param value="2" name="number1"/>
    	<jsp:param value="2.3" name="number2"/>
  </jsp:include> 
      <div class="header">
        <div class="now color"><a href="../../back/index" class="color">后台</a> -> 企业简介 -> 荣誉资质</div>
      </div>
<div class="logomain">
      <a class="style1">荣誉资质-添加图片</a>
      <div class="sform3">
            <ul>
          <form action="<c:if test="${state.equals('save')}">save</c:if><c:if test="${state.equals('update')}">update?id=${honor.sid }</c:if>" class="container" enctype="multipart/form-data" method="post" id='sysForm' > 		
          			 <li>
                <div class="fll1">标题<strong class="red">*　</strong></div>
                	<div class="gill"><input  class="contactinputs" name="title" value="${honor.title }" type="text" id="title">
                </div>
              </li>
              <li>
                <div class="fll1">展示内容<strong class="red">*</strong></div>
                <div class="ueditor1">
        <!-- 加载编辑器的容器 -->
        <script  id="editor" name="content" type="text/plain" >
            
            </script>
        <!-- 实例化编辑器 -->
      </div>
                
              </li>
              
                
          </form>
          </ul>
	</div>
    <div class="save"><input class="bottons c_green" name="input" type="submit" value="保存" onClick="check_all()">
    </div>
</div>
    </div>
    <!-- InstanceEndEditable -->

</body>
<!-- InstanceBeginEditable name="EditRegion4" -->
<script>
function check_all(){
	var formId = document.getElementById('sysForm');
	var tit=$("#title").val();
	if(tit==""){
		alert("注意，星号项为必填项！");
		}else{
			formId.submit();
		}
	}

//var ue = UE.getEditor('container',{zIndex: 0});

//实例化编辑器
//建议使用工厂方法getEditor创建和引用编辑器实例，如果在某个闭包下引用该编辑器，直接调用UE.getEditor('editor')就能拿到相关的实例
var ue = UE.getEditor('editor');
var aa =   "${intro}";
	ue.ready(function() { 
		UE.getEditor('editor').setContent(aa); 
		});  
	
	
			  $('.i_flie').on('change',function(){
			var filePath = $(this).val(),         //获取到input的value，里面是文件的路径
				fileFormat = filePath.substring(filePath.lastIndexOf(".")).toLowerCase();
			// 检查是否是图片
			if( !fileFormat.match(/.png|.jpg|.jpeg/) ) {
				alert('上传错误,图片格式必须为：png/jpg/jpeg');
				return;  
			}
			$('.i_flie').attr('src',filePath);
			$('#loding').show();
	});
			$('#chooseImage').on('change',function(){
    	var filePath = $(this).val(),         //获取到input的value，里面是文件的路径
    		fileFormat = filePath.substring(filePath.lastIndexOf(".")).toLowerCase(),
    		src = window.URL.createObjectURL(this.files[0]); //转成可以在本地预览的格式

        $('#cropedBigImg2').attr('src',src);
});
</script>
<!-- InstanceEndEditable -->
        
<!-- InstanceEnd --></html>


