<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<body>
<%String head_temp = request.getParameter("number1");
%>
  <div id="header"> 
    <div id="logo"><a href="${pageContext.request.contextPath }/index"><img src="${photo}" title="广东中科立信科技有限公司"/></a></div> 
    
    <div class="juz">

		<div  id="nanv">
          <ul>
            <li><a href="${pageContext.request.contextPath }/index"        <c:if test="<%=head_temp.equals(\"1\") %>">class="on" </c:if>>首页</a></li>
            <li><a href="${pageContext.request.contextPath }/short/list"   <c:if test="<%=head_temp.equals(\"2\") %>">class="on" </c:if>>企业简介</a></li>
            <li><a href="${pageContext.request.contextPath }/news/list"    <c:if test="<%=head_temp.equals(\"3\") %>">class="on" </c:if>>公司新闻</a></li>
            <li><a href="${pageContext.request.contextPath }/product/init" <c:if test="<%=head_temp.equals(\"4\") %>">class="on" </c:if>>产品介绍</a></li>
            <li><a href="${pageContext.request.contextPath }/case/list"    <c:if test="<%=head_temp.equals(\"5\") %>">class="on" </c:if>>项目案例</a></li>
            <li><a href="${pageContext.request.contextPath }/about/list"   <c:if test="<%=head_temp.equals(\"6\") %>">class="on" </c:if>>联系我们</a></li>
          </ul>
        </div>
				
      </div>
    </div>
    
</body>
</html>