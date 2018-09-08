/**  

* <p>Title: CommonServiceImp.java</p>  

* <p>Description: </p>  

* <p>Copyright: Copyright (c) 2017</p>  

* <p>Company: 中科立信</p>  

* @author 王冬冬

* @date 2018年8月20日  上午10:21:35

* @version 1.0  

*/  
package com.zklx.service.imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zklx.dao.AboutMapper;
import com.zklx.dao.ComNewsMapper;
import com.zklx.dao.ComShortMapper;
import com.zklx.dao.ElegantMapper;
import com.zklx.dao.HeadbannerMapper;
import com.zklx.dao.HonorMapper;
import com.zklx.dao.LogoMapper;
import com.zklx.dao.ProAppMapper;
import com.zklx.dao.ProItMapper;
import com.zklx.dao.ProMultiMapper;
import com.zklx.dao.ProSystemHeadMapper;
import com.zklx.dao.ProductSubMapper;
import com.zklx.dao.SolutionMapper;
import com.zklx.dao.SuccefulMapper;
import com.zklx.domain.Logo;
import com.zklx.service.CommonService;

/**  

* <p>Title: CommonServiceImp.java</p>  

* <p>Description: </p>  

* <p>Copyright: Copyright (c) 2017</p>  

* <p>Company: 中科立信</p>  

* @author 王冬冬

* @date 2018年8月20日  上午10:21:35

* @version 1.0  

*/
@Service("commonService")
public class CommonServiceImp implements CommonService {

	@Autowired
	private LogoMapper logoMapper;

	@Autowired
	private HeadbannerMapper headbannerMapper;

	@Autowired
	private SuccefulMapper succefulMapper;

	@Autowired
	private SolutionMapper solutionMapper;

	@Autowired
	private ComShortMapper comShortMapper;

	@Autowired
	private ElegantMapper elegantMapper;

	@Autowired
	private HonorMapper honorMapper;

	@Autowired
	private ComNewsMapper comNewsMapper;

	@Autowired
	private ProductSubMapper productSubMapper;
	

	@Autowired
	private ProSystemHeadMapper proSystemHeadMapper;

	@Autowired
	private ProMultiMapper proMultiMapper;

	@Autowired
	private ProAppMapper proAppMapper;

	@Autowired
	private ProItMapper proItMapper;

	@Autowired
	private AboutMapper aboutMapper;
	
	@Override
	public int countIndex() {
		// TODO Auto-generated method stub
		return logoMapper.selectCountLogo()+headbannerMapper.selecCountHB()+succefulMapper.selecCountSucc()+solutionMapper.selecCountSolu();
	}

	@Override
	public int countCompany() {
		// TODO Auto-generated method stub
		return comShortMapper.selectCountShort()+elegantMapper.selectCountEle()+honorMapper.selectCountHonor();
	}

	@Override
	public int countNews() {
		// TODO Auto-generated method stub
		return comNewsMapper.selectCountNews();
	}

	@Override
	public int countPro() {
		// TODO Auto-generated method stub
		return productSubMapper.selectCountPro();
	}

	@Override
	public int countCase() {
		// TODO Auto-generated method stub
		return proSystemHeadMapper.selectCountCase()+proMultiMapper.selectCountMul()+proAppMapper.selectCountApp()+proItMapper.selectCountIt();
	}

	@Override
	public int about() {
		// TODO Auto-generated method stub
		return aboutMapper.selectCountAbout();
	}

}
