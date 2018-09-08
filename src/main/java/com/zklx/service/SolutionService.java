/**  

* <p>Title: SolutionService.java</p>  

* <p>Description: </p>  

* <p>Copyright: Copyright (c) 2017</p>  

* <p>Company: 中科立信</p>  

* @author 王冬冬

* @date 2018年8月8日  下午4:30:15

* @version 1.0  

*/  
package com.zklx.service;

import java.util.List;

import com.zklx.domain.ProApp;
import com.zklx.domain.Solution;

/**  

* <p>Title: SolutionService.java</p>  

* <p>Description: </p>  

* <p>Copyright: Copyright (c) 2017</p>  

* <p>Company: 中科立信</p>  

* @author 王冬冬

* @date 2018年8月8日  下午4:30:15

* @version 1.0  

*/
public interface SolutionService {
			//查询全部
			List<Solution> SelectAll();
			
			//查询单个
			Solution selectOne(String id);
			
			//add
			boolean addOne(Solution solution);
			

			boolean deleteOne(String id);
			
			boolean update(Solution solution);
}
