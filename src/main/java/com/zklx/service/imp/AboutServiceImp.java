/**  

* <p>Title: AboutService.java</p>  

* <p>Description: </p>  

* <p>Copyright: Copyright (c) 2017</p>  

* <p>Company: 中科立信</p>  

* @author 王冬冬

* @date 2018年8月1日  下午4:08:04

* @version 1.0  

*/  
package com.zklx.service.imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zklx.dao.AboutMapper;
import com.zklx.domain.About;
import com.zklx.service.AboutService;

/**  

* <p>Title: AboutService.java</p>  

* <p>Description: </p>  

* <p>Copyright: Copyright (c) 2017</p>  

* <p>Company: 中科立信</p>  

* @author 王冬冬

* @date 2018年8月1日  下午4:08:04

* @version 1.0  

*/
@Service("aboutService")
public class AboutServiceImp implements AboutService{

	@Autowired
	private AboutMapper aboutMapper;
	
	@Override
	public About SelectAll() {
		
		return aboutMapper.selectAll();
	}

	@Override
	public boolean addOne(About about) {
		// TODO Auto-generated method stub
		aboutMapper.deleteAll();
		return aboutMapper.insert(about)==1;
	}

	@Override
	public About selectOne(String id) {
		// TODO Auto-generated method stub
		return aboutMapper.selectByPrimaryKey(id);
	}

	@Override
	public boolean deleteOne(String id) {
		// TODO Auto-generated method stub
		return aboutMapper.deleteByPrimaryKey(id)==1;
	}

	@Override
	public boolean update(About about) {
		// TODO Auto-generated method stub
		return aboutMapper.updateByPrimaryKeyWithBLOBs(about)==1;
	}


	
}
