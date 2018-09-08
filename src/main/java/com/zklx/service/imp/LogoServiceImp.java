/**  

* <p>Title: LogoServiceImp.java</p>  

* <p>Description: </p>  

* <p>Copyright: Copyright (c) 2017</p>  

* <p>Company: 中科立信</p>  

* @author 王冬冬

* @date 2018年8月8日  下午3:18:08

* @version 1.0  

*/  
package com.zklx.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zklx.dao.LogoMapper;
import com.zklx.domain.Logo;
import com.zklx.service.LogoService;

/**  

* <p>Title: LogoServiceImp.java</p>  

* <p>Description: </p>  

* <p>Copyright: Copyright (c) 2017</p>  

* <p>Company: 中科立信</p>  

* @author 王冬冬

* @date 2018年8月8日  下午3:18:08

* @version 1.0  

*/
@Service("LogoService")
public class LogoServiceImp implements LogoService{

	@Autowired
	private LogoMapper logoMapper;
	@Override
	public Logo SelectAll() {
		// TODO Auto-generated method stub
		return logoMapper.selectAll();
	}

	@Override
	public boolean addOne(Logo logo) {
		// TODO Auto-generated method stub
		return logoMapper.insert(logo)==1;
	}

	@Override
	public Logo selectOne(String id) {
		// TODO Auto-generated method stub
		return logoMapper.selectByPrimaryKey(id);
	}

	@Override
	public boolean deleteOne(String id) {
		// TODO Auto-generated method stub
		return logoMapper.deleteByPrimaryKey(id)==1;
	}

	@Override
	public boolean update(Logo logo) {
		// TODO Auto-generated method stub
		return logoMapper.updateByPrimaryKeyWithBLOBs(logo)==1;
	}

	
}
