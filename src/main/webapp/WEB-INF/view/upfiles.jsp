<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
 <script type="text/javascript" src="js/jquery-1.7.2.min.js"></script>
  <script type="text/javascript" src="js/jquery.SuperSlide.2.1.1.js"></script>    
</head>
<body>
 <div class="modal-footer">
 标题:<input type="text" name="title" id="title">
    <div id="message1" class="pull-left message">
        <input  name="file1" type="file" value="选择" size="50" style="line-height: 18px;" height="18px" id="fileUpload1">
    </div>
    <button type="button" class="btn btn-primary" onclick="uploadpic();">&nbsp;开始上传&nbsp;</button>
 内容:<input type="text" name="introduciton" id="introduciton">
</div>

12321321

<div id="editor" style="width:794px;height:340px;">231</div>

</body>
<script type="text/javascript">
	var ue = UE.getEditor('editor');
</script>
 
<script type="text/javascript">
//
uploadpic = function (){
    var filepath = $("#fileUpload1").val();
    //商品id,数据库写死记录
    alert(filepath)
    
    var cid = "123";
    var title = $("#title").val();
    var introduciton = $("#introduciton").val();
    alert(introduciton)
    if(filepath == ""|| filepath==null){
        return;
    }
    jQuery.ajax({
        type: 'post',
        url: "upfiles",
        async: false,
        cache: false,
            contentType:'application/x-www-form-urlencoded; charset=UTF-8',
            data: {"cid":cid,"title":title,"introduciton":introduciton,"filepath":filepath}/* ,
            success: function (data) {
                //头像存库后再读取出来响应到img标签
                showPic(sid);
            } */
    });
}
//展示头像
/* function showPic(sid){
 //img标签src属性支持流输出，后面要给上随机参数，预防读缓存
    $(".img_").attr("src","tgoodspicService/getGoodsPic.do?sid="+sid+"&mas="+Math.random());
} */

</script>
</html>

