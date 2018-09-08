/**  

* <p>Title: ProAppServiceImp.java</p>  

* <p>Description: </p>  

* <p>Copyright: Copyright (c) 2017</p>  

* <p>Company: 中科立信</p>  

* @author 王冬冬

* @date 2018年7月23日  上午11:30:40

* @version 1.0  

*/  
package com.zklx.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zklx.dao.ProAppMapper;
import com.zklx.domain.ProApp;
import com.zklx.service.ProAppService;

/**  

* <p>Title: ProAppServiceImp.java</p>  

* <p>Description: </p>  

* <p>Copyright: Copyright (c) 2017</p>  

* <p>Company: 中科立信</p>  

* @author 王冬冬

* @date 2018年7月23日  上午11:30:40

* @version 1.0  

*/
@Service("proAppService")
public class ProAppServiceImp implements ProAppService{

	@Autowired
	private ProAppMapper proAppMapper;
	@Override
	public List<ProApp> SelectAll() {
		// TODO Auto-generated method stub
		return proAppMapper.selectAll();
	}

	@Override
	public ProApp selectOne(String id) {
		// TODO Auto-generated method stub
		return proAppMapper.selectByPrimaryKey(id);
	}

	@Override
	public boolean addOne(ProApp proApp) {
		// TODO Auto-generated method stub
		return proAppMapper.insert(proApp)==1;
	}

	@Override
	public boolean deleteOne(String id) {
		// TODO Auto-generated method stub
		return proAppMapper.deleteByPrimaryKey(id)==1;
	}

	@Override
	public boolean update(ProApp proApp) {
		// TODO Auto-generated method stub
		
		return proAppMapper.updateByPrimaryKeyWithBLOBs(proApp)==1;
	}

	@Override
	public List<ProApp> selectByName(String name) {
		// TODO Auto-generated method stub
		return proAppMapper.selectBytitle(name);
	}

}
