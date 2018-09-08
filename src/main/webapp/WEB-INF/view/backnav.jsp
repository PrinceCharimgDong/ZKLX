<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head> 
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/CSS/admin.css">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/CSS/iconfont.css">
	<!-- 配置文件 -->
    <script type="text/javascript" src="${pageContext.request.contextPath }/ueditor/ueditor.config.js"></script>
    <!-- 编辑器源码文件 -->
    <script type="text/javascript" src="${pageContext.request.contextPath }/ueditor/ueditor.all.js"></script>
    <link rel="shortcut icon" type="image/x-icon" href="${pageContext.request.contextPath }/images/bitbug_favicon.ico" />
    <script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery.min.js"></script> 
    <script type="text/javascript" src="${pageContext.request.contextPath }/js/nav.js"></script>   
</head>
<body>
<%String head_temp = request.getParameter("number1");
String detail_temp = request.getParameter("number2");
%>
	<div class="top">
        <a>广东中科立信科技有限公司</a>
    </div>
    <!-- InstanceBeginEditable name="Editmain" --> 
    <div class="nav">
        <div class="nav-top">
            <div  class="ntimg" style="border-bottom:1px solid rgba(255,255,255,.1)"><a class="ass" href="admin.html"><img src="${pageContext.request.contextPath }/images/mini.png" ></a>
            </div>
            <div class="userbox">admin </div>
        </div>
        <ul>
            <li <c:choose><c:when test="<%=head_temp.equals(\"1\") %>">class="nav-item nav-show"</c:when><c:otherwise>class="nav-item"</c:otherwise></c:choose>>
                <a href="javascript:;"><i class="my-icon nav-icon icon_1"></i><span>网站首页</span><i class="my-icon nav-more"></i></a>
                <ul>
                    <li><a href="${pageContext.request.contextPath }/logo/back/show" <c:if test="<%=detail_temp.equals(\"1.1\") %>">style="color:#FFF;background:rgba(0,0,0,.1);"</c:if> ><span>LOGO</span></a></li>
                    <li><a href="${pageContext.request.contextPath }/hb/back/list" <c:if test="<%=detail_temp.equals(\"1.2\") %>">style="color:#FFF;background:rgba(0,0,0,.1);"</c:if>><span>Banner</span></a></li>
                    <li><a href="${pageContext.request.contextPath }/succ/back/list" <c:if test="<%=detail_temp.equals(\"1.3\") %>">style="color:#FFF;background:rgba(0,0,0,.1);"</c:if>><span>成功案例</span></a></li>
                    <li><a href="${pageContext.request.contextPath }/sol/back/list" <c:if test="<%=detail_temp.equals(\"1.4\") %>">style="color:#FFF;background:rgba(0,0,0,.1);"</c:if>><span>解决方案</span></a></li>
                    <li><a href="javascript:;"><span>展示板块</span></a></li>
                </ul>
            </li>
            <li <c:choose><c:when test="<%=head_temp.equals(\"2\") %>">class="nav-item nav-show"</c:when><c:otherwise>class="nav-item"</c:otherwise></c:choose>>
                <a href="javascript:;"><i class="my-icon nav-icon icon_2"></i><span>企业简介</span><i class="my-icon nav-more"></i></a>
                <ul>
                    <li><a href="${pageContext.request.contextPath }/short/back/list" <c:if test="<%=detail_temp.equals(\"2.1\") %>">style="color:#FFF;background:rgba(0,0,0,.1);"</c:if>><span> 公司简介</span></a></li>
                    <li><a href="${pageContext.request.contextPath }/ele/back/list" <c:if test="<%=detail_temp.equals(\"2.2\") %>">style="color:#FFF;background:rgba(0,0,0,.1);"</c:if>><span>团队风采</span></a></li>
                    <li><a href="${pageContext.request.contextPath }/honor/back/list"<c:if test="<%=detail_temp.equals(\"2.3\") %>">style="color:#FFF;background:rgba(0,0,0,.1);"</c:if>><span>荣誉资质</span></a></li>
                </ul>
            </li>
            <li <c:choose><c:when test="<%=head_temp.equals(\"3\") %>">class="nav-item nav-show"</c:when><c:otherwise>class="nav-item"</c:otherwise></c:choose>>
                <a href="javascript:;"><i class="my-icon nav-icon icon_3"></i><span>公司新闻</span><i class="my-icon nav-more"></i></a>
                <ul>
                    <li><a href="${pageContext.request.contextPath }/news/back/list" <c:if test="<%=detail_temp.equals(\"3.1\") %>">style="color:#FFF;background:rgba(0,0,0,.1);"</c:if>><span>新闻列表</span></a></li>
                </ul>
            </li>
            <li <c:choose><c:when test="<%=head_temp.equals(\"4\") %>">class="nav-item nav-show"</c:when><c:otherwise>class="nav-item"</c:otherwise></c:choose>>
                <a href="javascript:;"><i class="my-icon nav-icon icon_3"></i><span>产品介绍</span><i class="my-icon nav-more"></i></a>
                <ul>
                    <li><a href="${pageContext.request.contextPath }/product/back/list" <c:if test="<%=detail_temp.equals(\"4.1\") %>">style="color:#FFF;background:rgba(0,0,0,.1);"</c:if>><span>产品</span></a></li>
                </ul>
            </li>
            <li <c:choose><c:when test="<%=head_temp.equals(\"5\") %>">class="nav-item nav-show"</c:when><c:otherwise>class="nav-item"</c:otherwise></c:choose>>
                <a href="javascript:;"><i class="my-icon nav-icon icon_3"></i><span>项目案例</span><i class="my-icon nav-more"></i></a>
                <ul>
                    <li><a href="${pageContext.request.contextPath }/case/back/list" <c:if test="<%=detail_temp.equals(\"5.1\") %>">style="color:#FFF;background:rgba(0,0,0,.1);"</c:if>><span>系统集成</span></a></li>
                    <li><a href="${pageContext.request.contextPath }/promulti/back/list" <c:if test="<%=detail_temp.equals(\"5.2\") %>">style="color:#FFF;background:rgba(0,0,0,.1);"</c:if>><span>多媒体会议</span></a></li>
                    <li><a href="${pageContext.request.contextPath }/proapp/back/list" <c:if test="<%=detail_temp.equals(\"5.3\") %>">style="color:#FFF;background:rgba(0,0,0,.1);"</c:if>><span>应用系统</span></a></li>
                    <li><a href="${pageContext.request.contextPath }/proit/back/list" <c:if test="<%=detail_temp.equals(\"5.4\") %>">style="color:#FFF;background:rgba(0,0,0,.1);"</c:if>><span>IT运维</span></a></li>
                </ul>
            </li>
            <li <c:choose><c:when test="<%=head_temp.equals(\"6\") %>">class="nav-item nav-show"</c:when><c:otherwise>class="nav-item"</c:otherwise></c:choose>>
                <a href="javascript:;"><i class="my-icon nav-icon icon_3"></i><span>联系我们</span><i class="my-icon nav-more"></i></a>
                <ul>
                    <li><a href="${pageContext.request.contextPath }/about/back/update" <c:if test="<%=detail_temp.equals(\"6.1\") %>">style="color:#FFF;background:rgba(0,0,0,.1);"</c:if>><span>公司信息</span></a></li>
                </ul>
            </li>
             <li <c:choose><c:when test="<%=head_temp.equals(\"7\") %>">class="nav-item nav-show"</c:when><c:otherwise>class="nav-item"</c:otherwise></c:choose>>
                <a href="javascript:;"><i class="my-icon nav-icon icon_3"></i><span>用户管理</span><i class="my-icon nav-more"></i></a>
                <ul>
                    <li><a href="${pageContext.request.contextPath }/changePass"><span>修改密码</span></a></li>
                    <li><a href="${pageContext.request.contextPath }/logout"><span>退出</span></a></li>
                </ul>
            </li>
        </ul>
    </div>
    <div class="box"></div>
    
    <div class="main">  
    
    <a class="h1">控制面板</a>
</body>
</html>