/**  

* <p>Title: HeadbannerService.java</p>  

* <p>Description: </p>  

* <p>Copyright: Copyright (c) 2017</p>  

* <p>Company: 中科立信</p>  

* @author 王冬冬

* @date 2018年8月8日  上午8:50:25

* @version 1.0  

*/  
package com.zklx.service;

import java.util.List;

import com.zklx.domain.Headbanner;

/**  

* <p>Title: HeadbannerService.java</p>  

* <p>Description: </p>  

* <p>Copyright: Copyright (c) 2017</p>  

* <p>Company: 中科立信</p>  

* @author 王冬冬

* @date 2018年8月8日  上午8:50:25

* @version 1.0  

*/
public interface HeadbannerService {

	//查询全部
	List<Headbanner> SelectAll();
	
	//查询单个
	Headbanner selectOne(String id);
	
	//add
	boolean addOne(Headbanner headbanner);
	

	boolean deleteOne(String id);
	
	boolean update(Headbanner headbanner);
	
	boolean updateIsShowById(Headbanner record);
}
