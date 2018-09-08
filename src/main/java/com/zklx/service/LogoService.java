/**  

* <p>Title: LogoService.java</p>  

* <p>Description: </p>  

* <p>Copyright: Copyright (c) 2017</p>  

* <p>Company: 中科立信</p>  

* @author 王冬冬

* @date 2018年8月8日  下午3:17:24

* @version 1.0  

*/  
package com.zklx.service;

import java.util.List;

import com.zklx.domain.Logo;

/**  

* <p>Title: LogoService.java</p>  

* <p>Description: </p>  

* <p>Copyright: Copyright (c) 2017</p>  

* <p>Company: 中科立信</p>  

* @author 王冬冬

* @date 2018年8月8日  下午3:17:24

* @version 1.0  

*/
public interface LogoService {
		//查询全部
		Logo SelectAll();
		
		//add
		boolean addOne(Logo logo);
		
		//查询单个
		Logo selectOne(String id);
		
		boolean deleteOne(String id);
		
		boolean update(Logo logo);
}
