/**  

* <p>Title: NewsServiceImp.java</p>  

* <p>Description: </p>  

* <p>Copyright: Copyright (c) 2017</p>  

* <p>Company: 中科立信</p>  

* @author 王冬冬

* @date 2018年7月17日  上午8:25:13

* @version 1.0  

*/  
package com.zklx.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zklx.dao.ComNewsMapper;
import com.zklx.domain.ComNewsWithBLOBs;
import com.zklx.service.NewsService;

/**  

* <p>Title: NewsServiceImp.java</p>  

* <p>Description: </p>  

* <p>Copyright: Copyright (c) 2017</p>  

* <p>Company: 中科立信</p>  

* @author 王冬冬

* @date 2018年7月17日  上午8:25:13

* @version 1.0  

*/
@Service("newsService")
public class NewsServiceImp implements NewsService{

	@Autowired
	private ComNewsMapper comNewsMapper;
	
	@Override
	public List<ComNewsWithBLOBs> SelectAll() {
		
		return comNewsMapper.selectAll();
	}

	@Override
	public ComNewsWithBLOBs selectOne(String id) {
		return comNewsMapper.selectByPrimaryKey(id);
	}

	@Override
	public boolean addOne(ComNewsWithBLOBs comNewsWithBLOBs) {
		return comNewsMapper.insert(comNewsWithBLOBs)==1;
	}

	@Override
	public boolean update(ComNewsWithBLOBs comNewsWithBLOBs) {
		// TODO Auto-generated method stub
		return comNewsMapper.updateByPrimaryKeyWithBLOBs(comNewsWithBLOBs)==1;
	}

	@Override
	public boolean deleteById(String id) {
		// TODO Auto-generated method stub
		return comNewsMapper.deleteByPrimaryKey(id)==1;
	}

	@Override
	public List<ComNewsWithBLOBs> SelectByTitle(String title) {
		// TODO Auto-generated method stub
		return comNewsMapper.selectByTitle(title);
	}

}
