/**  

* <p>Title: ElegantServiceImp.java</p>  

* <p>Description: </p>  

* <p>Copyright: Copyright (c) 2017</p>  

* <p>Company: 中科立信</p>  

* @author 王冬冬

* @date 2018年8月7日  上午11:21:13

* @version 1.0  

*/  
package com.zklx.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zklx.dao.ElegantMapper;
import com.zklx.domain.Elegant;
import com.zklx.domain.ProIt;
import com.zklx.service.ElegantService;

/**  

* <p>Title: ElegantServiceImp.java</p>  

* <p>Description: </p>  

* <p>Copyright: Copyright (c) 2017</p>  

* <p>Company: 中科立信</p>  

* @author 王冬冬

* @date 2018年8月7日  上午11:21:13

* @version 1.0  

*/
@Service("elegantService")
public class ElegantServiceImp implements ElegantService{

	@Autowired
	private ElegantMapper elegantMapper;
	@Override
	public List<Elegant> SelectAll() {
		// TODO Auto-generated method stub
		return elegantMapper.selectAll();
	}

	@Override
	public Elegant selectOne(String id) {
		// TODO Auto-generated method stub
		return elegantMapper.selectByPrimaryKey(id);
	}

	@Override
	public boolean addOne(Elegant elegant) {
		// TODO Auto-generated method stub
		return elegantMapper.insert(elegant)==1;
	}

	@Override
	public boolean deleteOne(String id) {
		// TODO Auto-generated method stub
		return elegantMapper.deleteByPrimaryKey(id)==1;
	}

	@Override
	public boolean update(Elegant elegant) {
		// TODO Auto-generated method stub
		return elegantMapper.updateByPrimaryKeyWithBLOBs(elegant)==1;
	}

	@Override
	public boolean updateIsShowById(Elegant elegant) {
		// TODO Auto-generated method stub
		return elegantMapper.updateIsShowById(elegant)==1;
	}

}
