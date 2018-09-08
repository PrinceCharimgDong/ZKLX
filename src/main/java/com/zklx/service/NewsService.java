/**  

* <p>Title: NewsService.java</p>  

* <p>Description: </p>  

* <p>Copyright: Copyright (c) 2017</p>  

* <p>Company: 中科立信</p>  

* @author 王冬冬

* @date 2018年7月17日  上午8:23:56

* @version 1.0  

*/  
package com.zklx.service;

import java.util.List;

import com.zklx.domain.ComNewsWithBLOBs;
import com.zklx.domain.ProSystemHeadWithBLOBs;

/**  

* <p>Title: NewsService.java</p>  

* <p>Description: </p>  

* <p>Copyright: Copyright (c) 2017</p>  

* <p>Company: 中科立信</p>  

* @author 王冬冬

* @date 2018年7月17日  上午8:23:56

* @version 1.0  

*/
public interface NewsService {

		//查询全部
		List<ComNewsWithBLOBs> SelectAll();
		
		//查询单个
		ComNewsWithBLOBs selectOne(String id);
		
		//add
		boolean addOne(ComNewsWithBLOBs comNewsWithBLOBs);

		/**
		 * @param comNewsWithBLOBs
		 * @return
		 */
		boolean update(ComNewsWithBLOBs comNewsWithBLOBs);
		
		boolean deleteById(String id);
		
		List<ComNewsWithBLOBs> SelectByTitle(String title);
		
}
