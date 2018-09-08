/**  

* <p>Title: ProItService.java</p>  

* <p>Description: </p>  

* <p>Copyright: Copyright (c) 2017</p>  

* <p>Company: 中科立信</p>  

* @author 王冬冬

* @date 2018年7月23日  上午11:29:33

* @version 1.0  

*/  
package com.zklx.service;

import java.util.List;

import com.zklx.domain.ProIt;
import com.zklx.domain.ProMulti;
import com.zklx.domain.ProSystemHeadWithBLOBs;

/**  

* <p>Title: ProItService.java</p>  

* <p>Description: </p>  

* <p>Copyright: Copyright (c) 2017</p>  

* <p>Company: 中科立信</p>  

* @author 王冬冬

* @date 2018年7月23日  上午11:29:33

* @version 1.0  

*/
public interface ProItService {
	//查询全部
		List<ProIt> SelectAll();
		
		//查询单个
		ProIt selectOne(String id);
		
		//add
		boolean addOne(ProIt proIt);
		

		boolean deleteOne(String id);
		
		boolean update(ProIt proIt);
		
		List<ProIt> selectByTitle(String title);
}
