/**  

* <p>Title: strToByteArray.java</p>  

* <p>Description: </p>  

* <p>Copyright: Copyright (c) 2017</p>  

* <p>Company: 中科立信</p>  

* @author 王冬冬

* @date 2018年7月23日  上午10:25:04

* @version 1.0  

*/  
package util;

import java.io.UnsupportedEncodingException;

import oracle.net.aso.i;

/**  

* <p>Title: strToByteArray.java</p>  

* <p>Description: </p>  

* <p>Copyright: Copyright (c) 2017</p>  

* <p>Company: 中科立信</p>  

* @author 王冬冬

* @date 2018年7月23日  上午10:25:04

* @version 1.0  

*/
public class strToByteArray {
	public static byte[] strToByteArray(String str) {
	    if (str == null) {
	        return null;
	    }
	    byte[] byteArray = null;
		try {
			byteArray = str.getBytes("utf-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		
	    return byteArray;
	}
	
	public static void AssessBM(String str) {
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
