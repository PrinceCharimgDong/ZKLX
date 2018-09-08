/**  

* <p>Title: ShowPhoto.java</p>  

* <p>Description: </p>  

* <p>Copyright: Copyright (c) 2017</p>  

* <p>Company: 中科立信</p>  

* @author 王冬冬

* @date 2018年7月31日  下午2:39:49

* @version 1.0  

*/  
package util;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**  

* <p>Title: ShowPhoto.java</p>  

* <p>Description: 截取第一张图</p>  

* <p>Copyright: Copyright (c) 2017</p>  

* <p>Company: 中科立信</p>  

* @author 王冬冬

* @date 2018年7月31日  下午2:39:49

* @version 1.0  

*/
public class ShowPhoto {

	public  static String getPhoto(String content) {
	        List<String> srcList = new ArrayList<String>(); //用来存储获取到的图片地址
	    	Pattern p = Pattern.compile("<(img|IMG)(.*?)(>|></img>|/>)");//匹配字符串中的img标签
	    	if (content==null) {
				return "";
			}else {
				
		    	Matcher matcher = p.matcher(content);
		    	boolean hasPic = matcher.find();
		    	if(hasPic == true)//判断是否含有图片
		    	{
		    		if(hasPic) //如果含有图片，那么持续进行查找，直到匹配不到
		    		{
		    			String group = matcher.group(2);//获取第二个分组的内容，也就是 (.*?)匹配到的
		    			Pattern srcText = Pattern.compile("(src|SRC)=(\"|\')(.*?)(\"|\')");//匹配图片的地址
		    			Matcher matcher2 = srcText.matcher(group);
		    			if( matcher2.find() ) 
		    			{
		    				srcList.add( matcher2.group(3) );//把获取到的图片地址添加到列表中
		    			}
		    			hasPic = matcher.find();//判断是否还有img标签
		    		}
		    	}else {
		    		return "";
		    	}
			}
	        return String.join("", srcList);  
	}
}
