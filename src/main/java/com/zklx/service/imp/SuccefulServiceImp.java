/**  

* <p>Title: SuccefulServiceImp.java</p>  

* <p>Description: </p>  

* <p>Copyright: Copyright (c) 2017</p>  

* <p>Company: 中科立信</p>  

* @author 王冬冬

* @date 2018年8月13日  下午4:53:16

* @version 1.0  

*/  
package com.zklx.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zklx.dao.SuccefulMapper;
import com.zklx.domain.Succeful;
import com.zklx.service.SuccefulService;

/**  

* <p>Title: SuccefulServiceImp.java</p>  

* <p>Description: </p>  

* <p>Copyright: Copyright (c) 2017</p>  

* <p>Company: 中科立信</p>  

* @author 王冬冬

* @date 2018年8月13日  下午4:53:16

* @version 1.0  

*/
@Service("succefulService")
public class SuccefulServiceImp implements SuccefulService{

	@Autowired
	private SuccefulMapper succefulMapper;
	
	@Override
	public List<Succeful> SelectAll() {
		// TODO Auto-generated method stub
		return succefulMapper.selectAll();
	}

	@Override
	public Succeful selectOne(String id) {
		// TODO Auto-generated method stub
		return succefulMapper.selectByPrimaryKey(id);
	}

	@Override
	public boolean addOne(Succeful succeful) {
		// TODO Auto-generated method stub
		return succefulMapper.insert(succeful)==1;
	}

	@Override
	public boolean deleteOne(String id) {
		// TODO Auto-generated method stub
		return succefulMapper.deleteByPrimaryKey(id)==1;
	}

	@Override
	public boolean update(Succeful succeful) {
		// TODO Auto-generated method stub
		return succefulMapper.updateByPrimaryKeyWithBLOBs(succeful)==1;
	}

	
}
