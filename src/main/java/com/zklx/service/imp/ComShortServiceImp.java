/**  

* <p>Title: ComShortServiceImp.java</p>  

* <p>Description: </p>  

* <p>Copyright: Copyright (c) 2017</p>  

* <p>Company: 中科立信</p>  

* @author 王冬冬

* @date 2018年8月1日  上午9:38:28

* @version 1.0  

*/  
package com.zklx.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zklx.dao.ComShortMapper;
import com.zklx.domain.ComShort;
import com.zklx.domain.Honor;
import com.zklx.service.ComShortService;

/**  

* <p>Title: ComShortServiceImp.java</p>  

* <p>Description: </p>  

* <p>Copyright: Copyright (c) 2017</p>  

* <p>Company: 中科立信</p>  

* @author 王冬冬

* @date 2018年8月1日  上午9:38:28

* @version 1.0  

*/
@Service("comShortService")
public class ComShortServiceImp implements ComShortService{

	@Autowired
	private ComShortMapper comShortMapper;
	
	@Override
	public ComShort SelectAll() {
		// TODO Auto-generated method stub
		return comShortMapper.selectAll();
	}

	@Override
	public ComShort selectOne(String id) {
		// TODO Auto-generated method stub
		return comShortMapper.selectByPrimaryKey(id);
	}

	@Override
	public boolean addOne(ComShort comShort) {
		System.out.println(comShortMapper.deleteAll());
		return comShortMapper.insert(comShort)==1;
	}

	@Override
	public boolean update(ComShort comShort) {
		// TODO Auto-generated method stub
		return comShortMapper.updateByPrimaryKeyWithBLOBs(comShort)==1;
	}


}
