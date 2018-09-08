/**  

* <p>Title: ShowText.java</p>  

* <p>Description: </p>  

* <p>Copyright: Copyright (c) 2017</p>  

* <p>Company: 中科立信</p>  

* @author 王冬冬

* @date 2018年8月1日  上午11:30:10

* @version 1.0  

*/  
package util;

/**  

* <p>Title: ShowText.java</p>  

* <p>Description: 去掉图片</p>  

* <p>Copyright: Copyright (c) 2017</p>  

* <p>Company: 中科立信</p>  

* @author 王冬冬

* @date 2018年8月1日  上午11:30:10

* @version 1.0  

*/
public class ShowText {
	public String getText(String strHtml) {
		 String txtcontent = strHtml.replaceAll("<(img|IMG)(.*?)(>|></img>|/>)", ""); //剔出<html>的标签  
		 return txtcontent; 
	}
}
