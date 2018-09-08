/**  

* <p>Title: ProMulti.java</p>  

* <p>Description: </p>  

* <p>Copyright: Copyright (c) 2017</p>  

* <p>Company: 中科立信</p>  

* @author 王冬冬

* @date 2018年7月23日  上午11:02:40

* @version 1.0  

*/  
package com.zklx.service;

import java.util.List;

import com.zklx.domain.ProMulti;
import com.zklx.domain.ProSystemHeadWithBLOBs;

/**  

* <p>Title: ProMulti.java</p>  

* <p>Description: </p>  

* <p>Copyright: Copyright (c) 2017</p>  

* <p>Company: 中科立信</p>  

* @author 王冬冬

* @date 2018年7月23日  上午11:02:40

* @version 1.0  

*/
public interface ProMultiService {

	//查询全部
	List<ProMulti> SelectAll();
	
	//查询单个
	ProMulti selectOne(String id);
	
	//add
	boolean addOne(ProMulti ProMulti);
	

	boolean deleteOne(String id);
	
	boolean update(ProMulti ProMulti);
	
	List<ProMulti> selectByName(String name);
}
