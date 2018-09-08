/**  

* <p>Title: ByteToStr.java</p>  

* <p>Description: </p>  

* <p>Copyright: Copyright (c) 2017</p>  

* <p>Company: 中科立信</p>  

* @author 王冬冬

* @date 2018年7月23日  下午5:53:23

* @version 1.0  

*/  
package util;

import java.io.UnsupportedEncodingException;

/**  

* <p>Title: ByteToStr.java</p>  

* <p>Description: </p>  

* <p>Copyright: Copyright (c) 2017</p>  

* <p>Company: 中科立信</p>  

* @author 王冬冬

* @date 2018年7月23日  下午5:53:23

* @version 1.0  

*/
public class ByteToStr {
	//数组转string
	public static String byteToStr(byte[] bytes) {
	    if (bytes == null) {
	        return " ";
	    }
	   String str = " ";
		try {
			str = new String(bytes,"UTF-8");
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//AssessBM(str);
	    return str;
	} 
	
	public static  String objToStr(Object object) {
		if (object == null) {
	        return null;
	    }
	    String str = null;
	    try {
			str = new String( (byte[]) object,"UTF-8");
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    return str;
	}
	
	// 判断编码
	public  void AssessBM(String str) {
		String encode = "UTF-8";
        try {
            if (str.equals(new String(str.getBytes(encode), encode))) { // 判断是不是
                String s3 = encode;
                System.out.println("是utf-8");
            }else {
            	System.out.println("不是UTF-8");
            }
        } catch (Exception exception3) {
        	
        }
	}
}
