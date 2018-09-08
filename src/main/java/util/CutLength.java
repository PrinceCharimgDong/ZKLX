/**  

* <p>Title: CutLength.java</p>  

* <p>Description: </p>  

* <p>Copyright: Copyright (c) 2017</p>  

* <p>Company: 中科立信</p>  

* @author 王冬冬

* @date 2018年7月31日  下午2:26:14

* @version 1.0  

*/  
package util;

/**  

* <p>Title: CutLength.java</p>  

* <p>Description:去除图片和html格式，截取100个字 </p>  

* <p>Copyright: Copyright (c) 2017</p>  

* <p>Company: 中科立信</p>  

* @author 王冬冬

* @date 2018年7月31日  下午2:26:14

* @version 1.0  

*/
public class CutLength {

	//从html中提取纯文本
		public static String StripHT(String strHtml) {
			String txtcontent = null;
			if (strHtml!=null) {
				
				ShowText showText = new ShowText();
				strHtml = showText.getText(strHtml);
				txtcontent = strHtml.replaceAll("</?[^>]+>", ""); //剔出<html>的标签  
		         txtcontent = txtcontent.replaceAll("<a>\\s*|\t|\r|\n</a>", "");//去除字符串中的空格,回车,换行符,制表符  
		         if (txtcontent.length()>100) {
		        	 txtcontent = txtcontent.substring(0, 100)+"...";
				} 
			}else {
				return "";
			}
			 
	         return txtcontent;
	    }
	
		
	
}
