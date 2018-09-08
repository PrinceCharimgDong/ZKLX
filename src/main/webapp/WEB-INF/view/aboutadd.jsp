<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="<c:if test="${state.equals('save')}">save</c:if>
<c:if test="${state.equals('update')}">update?id=${about.aid }</c:if>" enctype="multipart/form-data"  method="post">
公司名称:<input type="text" name ="comname" value="${about.comname }"/><br/>
地址:<input type="text" name ="address" value="${about.address }"/><br/>
联系电话:<input type="text" name ="comtel" value="${about.comtel }"/><br/>
联系人:<input type="text" name ="person1" value="${about.person1 }"/><br/>
手机号码:<input type="text" name ="phone" value="${about.phone }"/><br/>
联系人:<input type="text" name ="person2" value="${about.person2 }"/><br/>
邮箱:<input type="text" name ="emial" value="${about.emial }"/><br/>
服务电话:<input type="text" name ="servicetel" value="${about.servicetel }"/><br/>
<input  class="layui-btn layui-btn-primary" name="提交" type="submit" value="提交">
</div>
</form >
</body>
</html>