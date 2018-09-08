/**  

* <p>Title: HonorService.java</p>  

* <p>Description: </p>  

* <p>Copyright: Copyright (c) 2017</p>  

* <p>Company: 中科立信</p>  

* @author 王冬冬

* @date 2018年7月23日  下午2:03:23

* @version 1.0  

*/  
package com.zklx.service;

import java.util.List;

import com.zklx.domain.Honor;
import com.zklx.domain.ProSystemHeadWithBLOBs;

/**  

* <p>Title: HonorService.java</p>  

* <p>Description: </p>  

* <p>Copyright: Copyright (c) 2017</p>  

* <p>Company: 中科立信</p>  

* @author 王冬冬

* @date 2018年7月23日  下午2:03:23

* @version 1.0  

*/
public interface HonorService {
	//查询全部
		List<Honor> SelectAll();
		
		//查询单个
		Honor selectOne(String id);
		
		//add
		boolean addOne(Honor honor);
		
		boolean deleteOne(String id);
		
		boolean update(Honor honor);
}
