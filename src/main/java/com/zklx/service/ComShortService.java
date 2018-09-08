/**  

* <p>Title: ComShortService.java</p>  

* <p>Description: </p>  

* <p>Copyright: Copyright (c) 2017</p>  

* <p>Company: 中科立信</p>  

* @author 王冬冬

* @date 2018年8月1日  上午9:38:02

* @version 1.0  

*/  
package com.zklx.service;

import java.util.List;

import com.zklx.domain.ComShort;
import com.zklx.domain.Honor;

/**  

* <p>Title: ComShortService.java</p>  

* <p>Description: </p>  

* <p>Copyright: Copyright (c) 2017</p>  

* <p>Company: 中科立信</p>  

* @author 王冬冬

* @date 2018年8月1日  上午9:38:02

* @version 1.0  

*/
public interface ComShortService {
			//查询全部 其实就一个
			ComShort SelectAll();
			
			//查询单个
			ComShort selectOne(String id);
			
			//add
			boolean addOne(ComShort comShort);

			boolean update(ComShort comShort);
}
