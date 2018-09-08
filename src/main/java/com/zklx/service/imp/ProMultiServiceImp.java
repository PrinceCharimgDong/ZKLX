/**  

* <p>Title: ProMultiServiceImp.java</p>  

* <p>Description: </p>  

* <p>Copyright: Copyright (c) 2017</p>  

* <p>Company: 中科立信</p>  

* @author 王冬冬

* @date 2018年7月23日  上午11:04:30

* @version 1.0  

*/  
package com.zklx.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zklx.dao.ProMultiMapper;
import com.zklx.domain.ProMulti;
import com.zklx.service.ProMultiService;

import oracle.net.aso.p;
import util.ByteToStr;

/**  

* <p>Title: ProMultiServiceImp.java</p>  

* <p>Description: </p>  

* <p>Copyright: Copyright (c) 2017</p>  

* <p>Company: 中科立信</p>  

* @author 王冬冬

* @date 2018年7月23日  上午11:04:30

* @version 1.0  

*/
@Service("proMultiService")
public class ProMultiServiceImp implements ProMultiService{

	@Autowired
	private ProMultiMapper proMultiMapper;
	@Override
	public List<ProMulti> SelectAll() {
		// TODO Auto-generated method stub
		return proMultiMapper.selectAll();
	}

	@Override
	public ProMulti selectOne(String id) {
		// TODO Auto-generated method stub
		return proMultiMapper.selectByPrimaryKey(id);
	}

	@Override
	public boolean addOne(ProMulti ProMulti) {
		// TODO Auto-generated method stub
		return proMultiMapper.insert(ProMulti)==1;
	}

	@Override
	public boolean deleteOne(String id) {
		// TODO Auto-generated method stub
		return proMultiMapper.deleteByPrimaryKey(id)==1;
	}

	@Override
	public boolean update(ProMulti ProMulti) {
		// TODO Auto-generated method stub
		ByteToStr byteToStr = new ByteToStr();
		System.out.println("dao:"+byteToStr.byteToStr(ProMulti.getIntroduciton()));
		return proMultiMapper.updateByPrimaryKeyWithBLOBs(ProMulti)==1; 
	}

	@Override
	public List<ProMulti> selectByName(String name) {
		// TODO Auto-generated method stub
		return proMultiMapper.selectBytitle(name);
	}

}
