/**  

* <p>Title: SuccefulService.java</p>  

* <p>Description: </p>  

* <p>Copyright: Copyright (c) 2017</p>  

* <p>Company: 中科立信</p>  

* @author 王冬冬

* @date 2018年8月13日  下午4:48:36

* @version 1.0  

*/  
package com.zklx.service;

import java.util.List;

import com.zklx.domain.Headbanner;
import com.zklx.domain.Succeful;

/**  

* <p>Title: SuccefulService.java</p>  

* <p>Description: </p>  

* <p>Copyright: Copyright (c) 2017</p>  

* <p>Company: 中科立信</p>  

* @author 王冬冬

* @date 2018年8月13日  下午4:48:36

* @version 1.0  

*/
public interface SuccefulService {

	//查询全部
	List<Succeful> SelectAll();
	
	//查询单个
	Succeful selectOne(String id);
	
	//add
	boolean addOne(Succeful succeful);
	

	boolean deleteOne(String id);
	
	boolean update(Succeful succeful);
}
