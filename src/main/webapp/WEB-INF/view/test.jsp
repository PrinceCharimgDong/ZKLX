<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%> 
<!DOCTYPE html> 
<html> 
<head> 
  <meta charset="UTF-8"> 
  <title>Title</title> 
  <script src="resources/jquery/jquery-3.0.0.js"></script> 
</head> 
<body> 
<form action="newadd" method="post" enctype="multipart/form-data">
	<table class="form">
	      <tr>
	           <td class="field">证件照：</td>
	           <td><input type="file" id="wkpicpath" class="text" name="attachs" />  </td>
	           <td class="field"id="hderrorinfo" style="margin-left:0px">${sessionScope.uploadwkError}</td>
	     </tr>
	     <tr>
	          <td class="field">头像：</td>
	          <td><input type="file" id="hdpicpath"  class="text" name="attachs" /></td>
	          <td class="field"id="hderrorinfo" style="margin-left:0px">${sessionScope.uploadhdError}</td>
	     </tr>
	     <tr>
	          <td></td>
	          <td><label class="ui-blue"><input type="submit" name="submit" value="添加" /></label></td>
	     </tr>
	</table>
</form>
</body> 
</html> 