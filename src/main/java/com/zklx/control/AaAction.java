/**  

* <p>Title: AaAction.java</p>  

* <p>Description: </p>  

* <p>Copyright: Copyright (c) 2017</p>  

* <p>Company: 中科立信</p>  

* @author 王冬冬

* @date 2018年8月8日  下午6:01:16

* @version 1.0  

*/  
package com.zklx.control;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zklx.domain.Aa;
import com.zklx.service.AaService;

import util.Page;



/**  

* <p>Title: AaAction.java</p>  

* <p>Description: </p>  

* <p>Copyright: Copyright (c) 2017</p>  

* <p>Company: 中科立信</p>  

* @author 王冬冬

* @date 2018年8月8日  下午6:01:16

* @version 1.0  

*/

@Controller
@RequestMapping("")
public class AaAction {
	@Autowired
	private AaService aaService;
	
	@RequestMapping("123")
	public ModelAndView listCategory(Page page){
		ModelAndView mav = new ModelAndView();
		PageHelper.offsetPage(page.getStart(),5);
		List<Aa> cs= aaService.select();
		int total = (int) new PageInfo<>(cs).getTotal();
		page.caculateLast(total);
		
		// 放入转发参数
		mav.addObject("cs", cs);
		// 放入jsp路径
		mav.setViewName("aa");
		return mav;
	}
}
