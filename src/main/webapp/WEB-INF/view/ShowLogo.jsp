<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="util.*"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html><!-- InstanceBegin template="/Templates/admin.dwt" codeOutsideHTMLIsLocked="false" -->
<head>
<meta charset="utf-8">
<!-- InstanceBeginEditable name="doctitle" -->
<title>广东中科立信科技有限公司</title>
</head>
<body>
<jsp:include page="backnav.jsp">
    	<jsp:param value="1" name="number1"/>
    	<jsp:param value="1.1" name="number2"/>
  	</jsp:include>
	
      <div class="header">
        <div class="now color"><a href="../../back/index" class="color">后台</a> -> 网站首页</div>
      </div>
      
      <div class="logomain">
      <a class="style1">LOGO管理</a>
      <div class="boox">
          <div id="header22"> 
    <div id="logo">
	    <a>
	    	<img src="${intro }" title="广东中科立信科技有限公司"/>
	    </a>
    </div> 
    
    
    </div>
	</div>
    <div class="save"><input class="bottons c_green" name="input" type="submit" value="编辑"onClick="window.open('update','_self')">
    </div>
</div>
     
          <!-- InstanceEndEditable -->

</body>
<!-- InstanceBeginEditable name="EditRegion4" -->
<script>
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
  
        $('#cropedBigImg').attr('src',src);
});
          </script>


<!-- InstanceEndEditable -->
        
<!-- InstanceEnd --></html>


