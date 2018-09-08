<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="util.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
 <script type="text/javascript" src="../js/jquery-1.7.2.min.js"></script>
  <script type="text/javascript" src="../js/jquery.SuperSlide.2.1.1.js"></script>   
<script type="text/javascript" src="../ueditor/ueditor.config.js"></script>
<script type="text/javascript" src="../ueditor/ueditor.all.min.js"></script>
<script type="text/javascript" src="../ueditor/lang/zh-cn/zh-cn.js"></script> 
</head>
<body>

 <div class="modal-footer">
 ----功能( 吧内容做成ul li)  给用户设置一个提醒 确定之会覆盖原来的内容
名称:<input type="text" name="shtitle" id="shtitle">
    <script id="editor"  name="shfile1" type="text/plain" style="width:1024px;height:500px;"></script>
<button type="button" class="btn btn-primary" onclick="uploadpic();">&nbsp;开始上传&nbsp;</button>
 

</body>

 
<script type="text/javascript">


//实例化编辑器
//建议使用工厂方法getEditor创建和引用编辑器实例，如果在某个闭包下引用该编辑器，直接调用UE.getEditor('editor')就能拿到相关的实例
var ue = UE.getEditor('editor');


//
uploadpic = function (){
    var shfile1 = UE.getEditor('editor').getContent();
    var shtitle = $("#shtitle").val();
    var belongid = <%=request.getAttribute("id") %>;
    alert(belongid)
    jQuery.ajax({
        type: 'post',
        url: "pasave",
        async: false,
        cache: false,
            contentType:'application/x-www-form-urlencoded; charset=UTF-8',
            data: {"shtitle":shtitle,"shfile1":shfile1,"belongid":belongid},
            success: function (data) {
                //头像存库后再读取出来响应到img标签
            }
    });
}

</script>
</html>

