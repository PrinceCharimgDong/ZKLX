/**  

* <p>Title: HonorServiceImp.java</p>  

* <p>Description: </p>  

* <p>Copyright: Copyright (c) 2017</p>  

* <p>Company: 中科立信</p>  

* @author 王冬冬

* @date 2018年7月23日  下午2:04:20

* @version 1.0  

*/  
package com.zklx.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zklx.dao.HonorMapper;
import com.zklx.domain.Honor;
import com.zklx.service.HonorService;

/**  

* <p>Title: HonorServiceImp.java</p>  

* <p>Description: </p>  

* <p>Copyright: Copyright (c) 2017</p>  

* <p>Company: 中科立信</p>  

* @author 王冬冬

* @date 2018年7月23日  下午2:04:20

* @version 1.0  

*/
@Service("honorService")
public class HonorServiceImp implements HonorService{

	@Autowired
	private HonorMapper honorMapper;
	@Override
	public List<Honor> SelectAll() {
		// TODO Auto-generated method stub
		return honorMapper.selectAll();
	}

	@Override
	public Honor selectOne(String id) {
		// TODO Auto-generated method stub
		return honorMapper.selectByPrimaryKey(id);
	}

	@Override
	public boolean addOne(Honor honor) {
		// TODO Auto-generated method stub
		return honorMapper.insertSelective(honor)==1;
		
		
	}

	@Override
	public boolean deleteOne(String id) {
		// TODO Auto-generated method stub
		return honorMapper.deleteByPrimaryKey(id)==1;
	}

	@Override
	public boolean update(Honor honor) {
		// TODO Auto-generated method stub
		return honorMapper.updateByPrimaryKeyWithBLOBs(honor)==1;
	}

}
