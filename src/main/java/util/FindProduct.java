/**  

* <p>Title: FindProduct.java</p>  

* <p>Description: </p>  

* <p>Copyright: Copyright (c) 2017</p>  

* <p>Company: 中科立信</p>  

* @author 王冬冬

* @date 2018年8月14日  上午11:18:48

* @version 1.0  

*/  
package util;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**  

* <p>Title: FindProduct.java</p>  

* <p>Description:产品里的列表截取 </p>  

* <p>Copyright: Copyright (c) 2017</p>  

* <p>Company: 中科立信</p>  

* @author 王冬冬

* @date 2018年8月14日  上午11:18:48

* @version 1.0  

*/
public class FindProduct { 
	 public List<String> getSubUtil(String soap){  
		 if (soap==null||soap.equals("")) {
			soap="<wdd> </wdd>";
		}
	    	String rgex="<wdd>(.*?)</wdd>";
	        List<String> list = new ArrayList<String>();  
	        Pattern pattern = Pattern.compile(rgex);// 匹配的模式  
	        Matcher m = pattern.matcher(soap);  
	        while (m.find()) {  
	            int i = 1;  
	            list.add(m.group(i));  
	            i++;  
	        }
	        if (list.isEmpty()) {
				list.add(0," ");
			}
	        return list;  
	    }  
}
