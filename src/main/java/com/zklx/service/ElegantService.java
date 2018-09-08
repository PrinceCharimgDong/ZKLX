/**  

* <p>Title: ElegantService.java</p>  

* <p>Description: </p>  

* <p>Copyright: Copyright (c) 2017</p>  

* <p>Company: 中科立信</p>  

* @author 王冬冬

* @date 2018年8月7日  上午11:20:20

* @version 1.0  

*/  
package com.zklx.service;

import java.util.List;

import com.zklx.domain.Elegant;
import com.zklx.domain.ProIt;

/**  

* <p>Title: ElegantService.java</p>  

* <p>Description: </p>  

* <p>Copyright: Copyright (c) 2017</p>  

* <p>Company: 中科立信</p>  

* @author 王冬冬

* @date 2018年8月7日  上午11:20:20

* @version 1.0  

*/
public interface ElegantService {


		//查询全部
		List<Elegant> SelectAll();
		
		//查询单个
		Elegant selectOne(String id);
		
		//add
		boolean addOne(Elegant elegant);
		

		boolean deleteOne(String id);
		
		boolean update(Elegant elegant);
		
		boolean updateIsShowById(Elegant elegant);
}
