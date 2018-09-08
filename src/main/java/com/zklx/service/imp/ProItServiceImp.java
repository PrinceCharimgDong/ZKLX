/**  

* <p>Title: ProItServiceImp.java</p>  

* <p>Description: </p>  

* <p>Copyright: Copyright (c) 2017</p>  

* <p>Company: 中科立信</p>  

* @author 王冬冬

* @date 2018年7月23日  上午11:30:52

* @version 1.0  

*/  
package com.zklx.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zklx.dao.ProItMapper;
import com.zklx.domain.ProIt;
import com.zklx.service.ProItService;

/**  

* <p>Title: ProItServiceImp.java</p>  

* <p>Description: </p>  

* <p>Copyright: Copyright (c) 2017</p>  

* <p>Company: 中科立信</p>  

* @author 王冬冬

* @date 2018年7月23日  上午11:30:52

* @version 1.0  

*/

@Service("proItService")
public class ProItServiceImp implements ProItService{

	@Autowired
	private ProItMapper proItMapper;
	@Override
	public List<ProIt> SelectAll() {
		// TODO Auto-generated method stub
		return proItMapper.selectAll();
	}

	@Override
	public ProIt selectOne(String id) {
		// TODO Auto-generated method stub
		return proItMapper.selectByPrimaryKey(id);
	}

	@Override
	public boolean addOne(ProIt proIt) {
		// TODO Auto-generated method stub
		return proItMapper.insert(proIt)==1;
	}

	@Override
	public boolean deleteOne(String id) {
		// TODO Auto-generated method stub
		return proItMapper.deleteByPrimaryKey(id)==1;
	}

	@Override
	public boolean update(ProIt proIt) {
		// TODO Auto-generated method stub
		return proItMapper.updateByPrimaryKeyWithBLOBs(proIt)==1;
	}

	@Override
	public List<ProIt> selectByTitle(String title) {
		// TODO Auto-generated method stub
		System.out.println("selectByTitle");
		return proItMapper.selectBytitle(title);
	}

}
