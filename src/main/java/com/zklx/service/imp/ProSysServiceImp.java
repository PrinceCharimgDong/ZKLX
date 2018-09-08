/**  

* <p>Title: ProSysServiceImp.java</p>  

* <p>Description: </p>  

* <p>Copyright: Copyright (c) 2017</p>  

* <p>Company: 中科立信</p>  

* @author 王冬冬

* @date 2018年7月12日  下午3:01:08

* @version 1.0  

*/  
package com.zklx.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zklx.dao.ProSystemHeadMapper;
import com.zklx.domain.ProSystemHeadWithBLOBs;
import com.zklx.service.ProSysService;

/**  

* <p>Title: ProSysServiceImp.java</p>  

* <p>Description: </p>  

* <p>Copyright: Copyright (c) 2017</p>  

* <p>Company: 中科立信</p>  

* @author 王冬冬

* @date 2018年7月12日  下午3:01:08

* @version 1.0  

*/
@Service("proSysService")
public class ProSysServiceImp implements ProSysService{

	@Autowired
	private ProSystemHeadMapper proSystemHeadMapper;

	public List<ProSystemHeadWithBLOBs> SelectAll() {
		return proSystemHeadMapper.selectAll();
	}

	@Override
	public ProSystemHeadWithBLOBs selectOne(String id) {
		
		return proSystemHeadMapper.selectByPrimaryKey(id);
	}

	@Override
	public boolean addOne(ProSystemHeadWithBLOBs proSystemHeadWithBLOBs) {
		return proSystemHeadMapper.insert(proSystemHeadWithBLOBs)==1;
	}

	@Override
	public boolean deleteOne(String id) {
		// TODO Auto-generated method stub
		return proSystemHeadMapper.deleteByPrimaryKey(id)==1;
	}

	@Override
	public boolean update(ProSystemHeadWithBLOBs proSystemHeadWithBLOBs) {
		// TODO Auto-generated method stub
		return proSystemHeadMapper.updateByPrimaryKeyWithBLOBs(proSystemHeadWithBLOBs)==1;
	}

	@Override
	public List<ProSystemHeadWithBLOBs> selectByTitle(String title) {

		return proSystemHeadMapper.selectByTitle(title);
	}
	
	
	
}
