<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
	<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %> 
<!DOCTYPE HTML>
<html>
<head>
<title>系统集成</title>
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<script type="text/javascript" src="../js/jquery-1.7.2.min.js"></script>
<script type="text/javascript" src="../js/jquery.SuperSlide.2.1.1.js"></script>    
<script type="text/javascript" src="../ueditor/ueditor.config.js"></script>
<script type="text/javascript" src="../ueditor/ueditor.all.min.js"></script>
<script type="text/javascript" src="../ueditor/lang/zh-cn/zh-cn.js"></script>
</head> 
<!--主体 包含具体说明内容-->
<body> 
<form action="<c:if test="${state.equals('save')}">save</c:if>
<c:if test="${state.equals('update')}">update?id=${proSystemHeadWithBLOBs.sid }</c:if> " enctype="multipart/form-data"  method="post">
标题:<input type="text" name ="title"  value="${proSystemHeadWithBLOBs.title }"/><br/>
内容:  <script id="editor" name="content" type="text/plain" style="width:1024px;height:500px;">112</br>312</script>
<input  class="layui-btn layui-btn-primary" name="提交" type="submit" value="提交12">
</div>

</form >
<script type="text/javascript">

    //实例化编辑器
    //建议使用工厂方法getEditor创建和引用编辑器实例，如果在某个闭包下引用该编辑器，直接调用UE.getEditor('editor')就能拿到相关的实例
    var ue = UE.getEditor('editor');
    var aa =   "${intro}";
  	ue.ready(function() { 
  		UE.getEditor('editor').setContent(aa); 
  		}); 

</script>
</body>
</html>