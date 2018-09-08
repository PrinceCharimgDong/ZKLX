/**  

* <p>Title: HeadbannerServiceImp.java</p>  

* <p>Description: </p>  

* <p>Copyright: Copyright (c) 2017</p>  

* <p>Company: 中科立信</p>  

* @author 王冬冬

* @date 2018年8月8日  上午8:51:24

* @version 1.0  

*/  
package com.zklx.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zklx.dao.HeadbannerMapper;
import com.zklx.domain.Headbanner;
import com.zklx.service.HeadbannerService;

/**  

* <p>Title: HeadbannerServiceImp.java</p>  

* <p>Description: </p>  

* <p>Copyright: Copyright (c) 2017</p>  

* <p>Company: 中科立信</p>  

* @author 王冬冬

* @date 2018年8月8日  上午8:51:24

* @version 1.0  

*/
@Service("headbannerService")
public class HeadbannerServiceImp implements HeadbannerService{

	@Autowired
	private HeadbannerMapper headbannerMapper;
	
	@Override
	public List<Headbanner> SelectAll() {
		return headbannerMapper.selectAll();
	}

	@Override
	public Headbanner selectOne(String id) {
		// TODO Auto-generated method stub
		return headbannerMapper.selectByPrimaryKey(id);
	}

	@Override
	public boolean addOne(Headbanner headbanner) {
		// TODO Auto-generated method stub
		return headbannerMapper.insert(headbanner)==1;
	}

	@Override
	public boolean deleteOne(String id) {
		// TODO Auto-generated method stub
		return headbannerMapper.deleteByPrimaryKey(id)==1;
	}

	@Override
	public boolean update(Headbanner headbanner) {
		// TODO Auto-generated method stub
		return headbannerMapper.updateByPrimaryKeyWithBLOBs(headbanner)==1;
	}

	@Override
	public boolean updateIsShowById(Headbanner record) {
		// TODO Auto-generated method stub
		return headbannerMapper.updateIsShowByID(record)==1;
	}

}
