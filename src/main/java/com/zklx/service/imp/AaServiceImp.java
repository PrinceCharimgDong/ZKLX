/**  

* <p>Title: AaServiceImp.java</p>  

* <p>Description: </p>  

* <p>Copyright: Copyright (c) 2017</p>  

* <p>Company: 中科立信</p>  

* @author 王冬冬

* @date 2018年8月8日  下午5:59:30

* @version 1.0  

*/  
package com.zklx.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zklx.dao.AaMapper;
import com.zklx.domain.Aa;
import com.zklx.service.AaService;

/**  

* <p>Title: AaServiceImp.java</p>  

* <p>Description: </p>  

* <p>Copyright: Copyright (c) 2017</p>  

* <p>Company: 中科立信</p>  

* @author 王冬冬

* @date 2018年8月8日  下午5:59:30

* @version 1.0  

*/
@Service("aaService")
public class AaServiceImp implements AaService{

	@Autowired
	private AaMapper aaMapper;
	@Override
	public List<Aa> select() {
		// TODO Auto-generated method stub
		return aaMapper.selectAll();
	}

}
