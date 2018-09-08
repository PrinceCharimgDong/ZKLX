<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <link rel="stylesheet" type="text/css" href="CSS/admin.css">
    <script type="text/javascript" src="js/jquery.min.js"></script>
  <link rel="shortcut icon" type="image/x-icon" href="images/favicon.ico" />
	<title>广东中科立信科技有限公司</title>
	 <style >
@charset "utf-8";
/* 以下实际使用若已初始化可删除 .nav height父级需逐级设置为100%*/
* {
    margin: 0;
    padding: 0;
}
body,html{height: 100%;background: #E2E2E2}
body,ul{margin:0;padding:0}
body{font:14px "微软雅黑","宋体","Arial Narrow",HELVETICA;-webkit-text-size-adjust:100%;} 
li{list-style:none} 
a{
	text-decoration: none;

}
/* 以上实际使用若已初始化可删除 */

.main {
	margin-left: 150px;
	clip: rect(auto,auto,auto,0px);
}
.main .header {
	width: 96%;
	padding-right: 2%;
	padding-left: 2%;
	float: left;
	height: 40px;
}
.bg {
	background-image: url(images/login_bg.jpg);
	background-repeat: repeat;
}
.login {
	width: 745px;
	height: 400px;
	position: absolute;
	left: 50%;
	top: 50%;
	margin-left: -320px;
	margin-top: -200px;
}
.button {
	width: 50px;
	background-repeat: no-repeat;
	background-position: left center;
	height: 54px;
	float: left;
	display: block;
	text-indent: -9999px;
	border: none;
	margin-top: 10px;
	position: relative;
	background-image: url(images/login_button.jpg);
	margin-left: 5px;
}
.logo {
	background-image: url(images/admin_logo.png);
	background-repeat: no-repeat;
	background-position: 80px center;
	height: 150px;
}
.login_form {
	height: 120px;
	margin-left: auto;
	margin-right: auto;
	width: 705px;
} 
.login_form .user{ background-image:url(images/login_name_bg1.jpg); width:640px; height:120px; float:left;}
.login_form .reb{
	float: left;
	height: 56px;
	margin-top: 25px;
	margin-left: 15px;
}
.login_form .text_value {
	float: left;
	margin-left: 14px;
	padding-left: 10px;
	margin-top: 10px;
	width: 230px;
	height: 56px;
	line-height: 50px;
	font-size: 16px;
	color: #666;
	font-weight: bold;
	border: none;
	background-color: #f5f6f7;
	padding-right: 10px;
}
.login_form .text_reb {
	float: left;
	width: 20px;
	height: 20px;
	font-size: 16px;
	color: #666;
	font-weight: bold;
	border: none;
	background-color: #f5f6f7;
}
.login .msgbox{
	float: left;
	width: 640px;
	height: 40px;
	font-family: "微软雅黑";
	font-size: 20px;
	color: #F00;
	text-align: center;
	}
.foot { padding-top:30px; text-align:center; color:#FFF; padding-right:80px;}


input {
	border-radius: 3px;
	font-family: "微软雅黑";
	line-height: 120%;
	background-color: #FFF;
	color: #333;
	height: 25px;
	font-size: 16px;
	width: 350px;
}




canvas{position: fixed; top: 0px; left: 0px; }
		
	 
	 </style>
</head>

<body class="bg" >  
  <canvas id="cas">
    </canvas>
    <canvas class="particles-js-canvas-el" style="width: 100%; height: 100%;" width="1600" height="763">
    </canvas> 
	<div class="login">
	<form onsubmit="return false;">
	<div class="logo"></div>
    <div class="login_form"> 
    	<div class="user">
        	<input class="text_value"  name="username" type="text" id="username">
            <input class="text_value"  name="password" type="password" id="password">
            <div class="reb"><input class="text_reb" type="checkbox" name="RM">记住密码</div>
             <label class="msgbox" id="result"/>
        </div>
        
        <button class="button"   id="login" type="button" value="login"><button>
    </div>

    
    <div id="tip"></div>
    <div class="foot">Copyright © 2017 gdzklx.com 粤ICP备17081505号</div>
    </form>
	
    </div>
</body >
<script>
function check_all(){
	var username=$("#username").val();
	var password=$("#password").val();
	if(username==""||password==""){
		alert("请输入正确的账号名或密码！");
		return false;
		}
	}
</script>
<script type="text/javascript">
$(document).ready(function() {
	$("#login").click(function() {
		
		var json = {
			"username" : $("#username").val(),
			"password" : $("#password").val(),
			"rememberme" : "false",
		};
		$('input[name="RM"]:checked').each(function() {
			json.rememberme = "true";
		});
		$.ajax({
			url : 'login',
			type : "POST",
			data : JSON.stringify(json), //转JSON字符串  
			dataType : 'json',
			contentType : 'application/json;charset=UTF-8',
			success : function(info) {
				$("#result").html(info.message);
				if (info.message.indexOf("login success") != -1) {
					window.location.href = "back/index";
				} else if (info.message.indexOf("Unauthorized") != -1) {
					alert("未授权!");
				}
			},
			error : function(info) {
				alert(JSON.stringify(info))
			}
		});
	});
});
</script>

 <script>
        var canvas = document.getElementById("cas");
        var ctx = canvas.getContext("2d");
        resize();
        window.onresize = resize;
        function resize() {
            canvas.width = window.innerWidth || document.documentElement.clientWidth || document.body.clientWidth;
            canvas.height = window.innerHeight || document.documentElement.clientHeight || document.body.clientHeight;
        }
        var RAF = (function () {
            return window.requestAnimationFrame || window.webkitRequestAnimationFrame || window.mozRequestAnimationFrame || window.oRequestAnimationFrame || window.msRequestAnimationFrame || function (callback) {
                window.setTimeout(callback, 1000 / 60);
            };
        })();
        // 鼠标活动时，获取鼠标坐标
        var warea = { x: null, y: null, max: 20000 };
        window.onmousemove = function (e) {
            e = e || window.event;
            warea.x = e.clientX;
            warea.y = e.clientY;
        };
        window.onmouseout = function (e) {
            warea.x = null;
            warea.y = null;
        };
        // 添加粒子
        // x，y为粒子坐标，xa, ya为粒子xy轴加速度，max为连线的最大距离
        var dots = [];
        for (var i = 0; i < 300; i++) {
            var x = Math.random() * canvas.width;
            var y = Math.random() * canvas.height;
            var xa = Math.random() * 2 - 1;
            var ya = Math.random() * 2 - 1;
            dots.push({
                x: x,
                y: y,
                xa: xa,
                ya: ya,
                max: 6000
            })
        }
        // 延迟100秒开始执行动画，如果立即执行有时位置计算会出错
        setTimeout(function () {
            animate();
        }, 100);
        // 每一帧循环的逻辑
        function animate() {
            ctx.clearRect(0, 0, canvas.width, canvas.height);
            // 将鼠标坐标添加进去，产生一个用于比对距离的点数组
            var ndots = [warea].concat(dots);
            dots.forEach(function (dot) {
                // 粒子位移
                dot.x += dot.xa;
                dot.y += dot.ya;
                // 遇到边界将加速度反向
                dot.xa *= (dot.x > canvas.width || dot.x < 0) ? -1 : 1;
                dot.ya *= (dot.y > canvas.height || dot.y < 0) ? -1 : 1;
                // 绘制点
                ctx.fillRect(dot.x - 0.5, dot.y - 0.5, 1, 1);
                // 循环比对粒子间的距离
                for (var i = 0; i < ndots.length; i++) {
                    var d2 = ndots[i];
                    if (dot === d2 || d2.x === null || d2.y === null) continue;
                    var xc = dot.x - d2.x;
                    var yc = dot.y - d2.y;
                    // 两个粒子之间的距离
                    var dis = xc * xc + yc * yc;
                    // 距离比
                    var ratio;
                    // 如果两个粒子之间的距离小于粒子对象的max值，则在两个粒子间画线
                    if (dis < d2.max) {
                        // 如果是鼠标，则让粒子向鼠标的位置移动
                        if (d2 === warea && dis > (d2.max / 2)) {
                            dot.x -= xc * 0.03;
                            dot.y -= yc * 0.03;
                        }
                        // 计算距离比
                        ratio = (d2.max - dis) / d2.max;
                        // 画线
                        ctx.beginPath();
                        ctx.lineWidth = ratio / 2;
                        ctx.strokeStyle = 'rgba(0,0,0,' + (ratio + 0.2) + ')';
                        ctx.moveTo(dot.x, dot.y);
                        ctx.lineTo(d2.x, d2.y);
                        ctx.stroke();
                    }
                }
                // 将已经计算过的粒子从数组中删除
                ndots.splice(ndots.indexOf(dot), 1);
            });
            RAF(animate);
        }
        $("body").keydown(function() {
            if (event.keyCode == "13") {
                $('#login').click();
            }
        });
    </script>
    
</html>


