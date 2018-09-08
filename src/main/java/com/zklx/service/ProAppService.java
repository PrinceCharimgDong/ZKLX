/**  

* <p>Title: ProAppService.java</p>  

* <p>Description: </p>  

* <p>Copyright: Copyright (c) 2017</p>  

* <p>Company: 中科立信</p>  

* @author 王冬冬

* @date 2018年7月23日  上午11:25:54

* @version 1.0  

*/  
package com.zklx.service;

import java.util.List;

import com.zklx.domain.ProApp;
import com.zklx.domain.ProMulti;
import com.zklx.domain.ProSystemHeadWithBLOBs;

/**  

* <p>Title: ProAppService.java</p>  

* <p>Description: </p>  

* <p>Copyright: Copyright (c) 2017</p>  

* <p>Company: 中科立信</p>  

* @author 王冬冬

* @date 2018年7月23日  上午11:25:54

* @version 1.0  

*/
public interface ProAppService {
	//查询全部
		List<ProApp> SelectAll();
		
		//查询单个
		ProApp selectOne(String id);
		
		//add
		boolean addOne(ProApp proApp);
		

		boolean deleteOne(String id);
		
		boolean update(ProApp proApp);

		List<ProApp> selectByName(String name);
}
