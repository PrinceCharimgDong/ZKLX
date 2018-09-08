<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+request.getContextPath()+"/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<base href="<%=basePath %>" />
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>json2.jsp</title>
<script type="text/javascript" src="js/jquery-1.7.2.min.js"></script>

<script type="text/javascript">
    
    $(function(){
        
        $("#btn1").on("click",function(){
            
            var obj = {id:1,name:"tom",age:20};
            var jsonStr = JSON.stringify(obj);
            
            /*
                contentType属性表示本次请求给服务器发送的数据类型是什么
                    对应了之前请求头中的属性:Content-Type
                dataType属性表示本次请求希望服务器返回的数据类型是什么
                    对应了之前请求头中的属性:Accept
            */
            
            
            $.ajax({
                type: "POST",
                url: "request_body/test2",
                contentType: "application/json",
                data: jsonStr,
                dataType: "text",
                success: function(msg){
                    console.log(msg);
                }
            });
            
        });
        
    });
    
</script>
</head>
<body>
    <h1>json2.jsp</h1>
    <hr>
    
    <input id="btn1" type="button" value="按钮1">
    

</body>
</html>