<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html><!-- InstanceBegin template="/Templates/admin.dwt" codeOutsideHTMLIsLocked="false" -->
<head>
<meta charset="utf-8">
<!-- InstanceBeginEditable name="doctitle" -->
<title>广东中科立信科技有限公司</title>
<!-- InstanceEndEditable -->

    <!-- InstanceBeginEditable name="head" -->
  <link rel="shortcut icon" type="image/x-icon" href="../../images/favicon.ico" />
    <script type="text/javascript" src="../js/echarts.min.js"></script>
</head>
<body>

		 <jsp:include page="backnav.jsp">
    	<jsp:param value="0" name="number1"/>
    	<jsp:param value="0" name="number2"/>
  	</jsp:include> 
	<div class="notice"></div>
    <div id="charts"></div>
    <script type="text/javascript">
        // 基于准备好的dom，初始化echarts实例
        var myChart = echarts.init(document.getElementById('charts'));

        // 指定图表的配置项和数据
        var option = {
            title: {
                text: '网站录入情况'
            },
            tooltip: {},
            legend: {
                data:['数据']
            },
            xAxis: {
                data: ["网站首页","企业简介","公司新闻","产品介绍","项目案例","联系我们"]
            },
            yAxis: {},
            series: [{
                name: '数据',
                type: 'bar',
                data: [ ${indexcount}, ${companyCount}, ${newsCount}, ${proCount}, ${caseCount}, ${aboutCount}]
            }]
        };

        // 使用刚指定的配置项和数据显示图表。
        myChart.setOption(option);
    </script>
    <div class="charts"></div>
          <!-- InstanceEndEditable -->

</body>
<!-- InstanceBeginEditable name="EditRegion4" -->

<!-- InstanceEndEditable -->
        
<!-- InstanceEnd --></html>


