/**  

* <p>Title: CommonAction.java</p>  

* <p>Description: </p>  

* <p>Copyright: Copyright (c) 2017</p>  

* <p>Company: 中科立信</p>  

* @author 王冬冬

* @date 2018年7月27日  上午10:23:33

* @version 1.0  

*/  
package com.zklx.control;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sun.org.apache.bcel.internal.generic.NEW;
import com.zklx.dao.HeadbannerMapper;
import com.zklx.domain.Headbanner;
import com.zklx.domain.Logo;
import com.zklx.domain.Solution;
import com.zklx.domain.Succeful;
import com.zklx.service.CommonService;
import com.zklx.service.ElegantService;
import com.zklx.service.HeadbannerService;
import com.zklx.service.LogoService;
import com.zklx.service.SolutionService;
import com.zklx.service.SuccefulService;

import util.ByteToStr;
import util.ShowPhoto;

/**  

* <p>Title: CommonAction.java</p>  

* <p>Description: 公共界面 如主页</p>  

* <p>Copyright: Copyright (c) 2017</p>  

* <p>Company: 中科立信</p>  

* @author 王冬冬

* @date 2018年7月27日  上午10:23:33

* @version 1.0  

*/
@Controller
public class CommonAction {

	@Autowired
	private HeadbannerService headbannerService;

	@Autowired
	private LogoService logoService;
	
	@Autowired
	private CommonService commonService;

	@Autowired
	private SolutionService solutionService;
	
	@Autowired
	private SuccefulService succefulService;
	//前台显示
	@RequestMapping(value="/index",method=RequestMethod.GET)
	public String index(Model model) {
		List<Headbanner> list = new ArrayList<Headbanner>();
		list = headbannerService.SelectAll();
		String photo ="";
		try {
			photo = new ShowPhoto().getPhoto(new ByteToStr().byteToStr(logoService.SelectAll().getPhoto()));
		} catch (Exception e) {
			// TODO: handle exception
		}
		List<Solution> slist = new ArrayList<>();
		slist = solutionService.SelectAll();
		List<Succeful> succefulslist = new ArrayList<>();
		succefulslist=succefulService.SelectAll();
		model.addAttribute("succefulslist", succefulslist);
		model.addAttribute("slist", slist);
		model.addAttribute("photo", photo);
		model.addAttribute("list", list);
		return "index";
	}
	@RequestMapping(value="/culture",method=RequestMethod.GET)
	public String culture() {
		return "culture";
	}
	
	
	@RequestMapping(value="/",method=RequestMethod.GET)
	public String index1(Model model) {
		List<Headbanner> list = new ArrayList<Headbanner>();
		list = headbannerService.SelectAll();
		String photo ="";
		try {
			photo = new ShowPhoto().getPhoto(new ByteToStr().byteToStr(logoService.SelectAll().getPhoto()));
		} catch (Exception e) {
			// TODO: handle exception
		}
		List<Solution> slist = new ArrayList<>();
		slist = solutionService.SelectAll();
		List<Succeful> succefulslist = new ArrayList<>();
		succefulslist=succefulService.SelectAll();
		model.addAttribute("succefulslist", succefulslist);
		model.addAttribute("slist", slist);
		model.addAttribute("photo", photo);
		model.addAttribute("list", list);
		return "index1";
	}
	
	//前台ending
	
	
	
	
	
	
	
	
	
	//后台 start
	@RequestMapping(value="/back/index",method=RequestMethod.GET)
	public String backhome(Model model) {
		int indexcount = commonService.countIndex();
		int companyCount = commonService.countCompany();
		int newsCount =commonService.countNews();
		int proCount = commonService.countPro();
		int caseCount =commonService.countCase();
		int aboutCount = commonService.about();
		model.addAttribute("indexcount",indexcount);
		model.addAttribute("companyCount",companyCount);
		model.addAttribute("newsCount",newsCount);
		model.addAttribute("proCount",proCount);
		model.addAttribute("caseCount",caseCount);
		model.addAttribute("aboutCount",aboutCount);
		
		return "First";
	}
	
	
	
	
}
