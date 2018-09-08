<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
 <script type="text/javascript" src="../js/jquery-1.7.2.min.js"></script>
  <script type="text/javascript" src="../js/jquery.SuperSlide.2.1.1.js"></script>    
</head>
<body>
 <div class="modal-footer">
证书名:<input type="text" name="title" id="title">
    <div id="message1" class="pull-left message">
       证书图片: <input    name="file1" type="file" value="选择" size="50" style="line-height: 18px;" height="18px" id="fileUpload1">
    </div>
    <img src="" alt="1111">
    <button type="button" class="btn btn-primary" onclick="uploadpic();">&nbsp;开始上传&nbsp;</button>
</div>
</body>

 
<script type="text/javascript">
//
uploadpic = function (){
    var filepath = $("#fileUpload1").val();
    //商品id,数据库写死记录
    alert(filepath)
    
    var sid = "123";
    var title = $("#title").val();
    if(filepath == ""|| filepath==null){
        return;
    }
    jQuery.ajax({
        type: 'post',
        url: "add",
        async: false,
        cache: false,
            contentType:'application/x-www-form-urlencoded; charset=UTF-8',
            data: {"sid":sid,"title":title,"filepath":filepath},
            success: function (data) {
                //头像存库后再读取出来响应到img标签
                showPic(sid);
            }
    });
}
//展示头像
function showPic(sid){
 //img标签src属性支持流输出，后面要给上随机参数，预防读缓存
    $(".img_").attr("src","tgoodspicService/getGoodsPic.do?sid="+sid+"&mas="+Math.random());
}


$(function(){
	$("#fileUpload1").on("change",function () {
        var $file = $(this);
        var fileObj = $file[0];

        var windowURL = window.URL || window.webkitURL;
        var dataURL;
        var $img = $("img");

        if (fileObj && fileObj.files && fileObj.files[0]) {
            dataURL = windowURL.createObjectURL(fileObj.files[0]);
            $img.attr('src', dataURL);
        } else {
            dataURL = $file.val();
            var imgObj = document.getElementById("preview");
            imgObj.style.filter = "progid:DXImageTransform.Microsoft.AlphaImageLoader(sizingMethod=scale)";
            imgObj.filters.item("DXImageTransform.Microsoft.AlphaImageLoader").src = dataURL;

        }
    });
});
</script>
</html>

