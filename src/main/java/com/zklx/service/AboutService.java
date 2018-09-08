/**  

* <p>Title: AboutService.java</p>  

* <p>Description: </p>  

* <p>Copyright: Copyright (c) 2017</p>  

* <p>Company: 中科立信</p>  

* @author 王冬冬

* @date 2018年8月1日  下午4:07:21

* @version 1.0  

*/  
package com.zklx.service;

import com.zklx.domain.About;
import com.zklx.domain.ComShort;
import com.zklx.domain.ProSystemHeadWithBLOBs;

/**  

* <p>Title: AboutService.java</p>  

* <p>Description: </p>  

* <p>Copyright: Copyright (c) 2017</p>  

* <p>Company: 中科立信</p>  

* @author 王冬冬

* @date 2018年8月1日  下午4:07:21

* @version 1.0  

*/

public interface AboutService {
	//查询全部 其实就一个
	About SelectAll();
	
	//add
	boolean addOne(About about);
	
	//查询单个
	About selectOne(String id);
	
	boolean deleteOne(String id);
	
	boolean update(About about);
}
