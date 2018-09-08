/**  

* <p>Title: ProSysService.java</p>  

* <p>Description: </p>  

* <p>Copyright: Copyright (c) 2017</p>  

* <p>Company: 中科立信</p>  

* @author 王冬冬

* @date 2018年7月12日  下午2:55:43

* @version 1.0  

*/  
package com.zklx.service;

import java.util.List;

import com.zklx.domain.ProSystemHeadWithBLOBs;

/**  

* <p>Title: ProSysService.java</p>  

* <p>Description: </p>  

* <p>Copyright: Copyright (c) 2017</p>  

* <p>Company: 中科立信</p>  

* @author 王冬冬

* @date 2018年7月12日  下午2:55:43

* @version 1.0  

*/
public interface ProSysService {

	//查询全部
	List<ProSystemHeadWithBLOBs> SelectAll();
	
	//查询单个
	ProSystemHeadWithBLOBs selectOne(String id);
	
	List<ProSystemHeadWithBLOBs> selectByTitle(String title);
	//add
	boolean addOne(ProSystemHeadWithBLOBs proSystemHeadWithBLOBs);
	
	boolean deleteOne(String id);
	
	boolean update(ProSystemHeadWithBLOBs proSystemHeadWithBLOBs);
}
