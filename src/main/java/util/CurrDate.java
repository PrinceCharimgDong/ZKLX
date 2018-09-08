/**  

* <p>Title: CurrDate.java</p>  

* <p>Description: </p>  

* <p>Copyright: Copyright (c) 2017</p>  

* <p>Company: 中科立信</p>  

* @author 王冬冬

* @date 2018年8月8日  下午3:23:54

* @version 1.0  

*/  
package util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**  

* <p>Title: CurrDate.java</p>  

* <p>Description: 获取当前日期</p>  

* <p>Copyright: Copyright (c) 2017</p>  

* <p>Company: 中科立信</p>  

* @author 王冬冬

* @date 2018年8月8日  下午3:23:54

* @version 1.0  

*/
public class CurrDate {

	public Date getDate() {
		Date date = new Date();//获得系统时间.

        Date time = null;
		try {
	        SimpleDateFormat sdf =   new SimpleDateFormat( " yyyy-MM-dd HH:mm:ss " );
			String nowTime = sdf.format(date);
			time = sdf.parse( nowTime );
		} catch (ParseException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return time;
	}
}
