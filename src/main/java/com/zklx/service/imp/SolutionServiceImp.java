/**  

* <p>Title: SolutionServiceImp.java</p>  

* <p>Description: </p>  

* <p>Copyright: Copyright (c) 2017</p>  

* <p>Company: 中科立信</p>  

* @author 王冬冬

* @date 2018年8月8日  下午4:31:07

* @version 1.0  

*/  
package com.zklx.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zklx.dao.SolutionMapper;
import com.zklx.domain.Solution;
import com.zklx.service.SolutionService;

/**  

* <p>Title: SolutionServiceImp.java</p>  

* <p>Description: </p>  

* <p>Copyright: Copyright (c) 2017</p>  

* <p>Company: 中科立信</p>  

* @author 王冬冬

* @date 2018年8月8日  下午4:31:07

* @version 1.0  

*/
@Service("solutionService")
public class SolutionServiceImp implements SolutionService{

	@Autowired
	private SolutionMapper solutionMapper;
	
	@Override
	public List<Solution> SelectAll() {
		// TODO Auto-generated method stub
		return solutionMapper.selectAll();
	}

	@Override
	public Solution selectOne(String id) {
		// TODO Auto-generated method stub
		return solutionMapper.selectByPrimaryKey(id);
	}

	@Override
	public boolean addOne(Solution solution) {
		// TODO Auto-generated method stub
		return solutionMapper.insert(solution)==1;
	}

	@Override
	public boolean deleteOne(String id) {
		// TODO Auto-generated method stub
		return solutionMapper.deleteByPrimaryKey(id)==1;
	}

	@Override
	public boolean update(Solution solution) {
		// TODO Auto-generated method stub
		return solutionMapper.updateByPrimaryKeyWithBLOBs(solution)==1;
	}

}
