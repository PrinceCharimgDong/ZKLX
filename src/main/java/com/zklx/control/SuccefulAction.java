/**  

* <p>Title: SuccefulAction.java</p>  

* <p>Description: </p>  

* <p>Copyright: Copyright (c) 2017</p>  

* <p>Company: 中科立信</p>  

* @author 王冬冬

* @date 2018年8月13日  下午4:58:08

* @version 1.0  

*/  
package com.zklx.control;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zklx.domain.Solution;
import com.zklx.domain.Succeful;
import com.zklx.service.SuccefulService;

import util.ByteToStr;
import util.CurrDate;
import util.Page;
import util.strToByteArray;

/**  

* <p>Title: SuccefulAction.java</p>  

* <p>Description: </p>  

* <p>Copyright: Copyright (c) 2017</p>  

* <p>Company: 中科立信</p>  

* @author 王冬冬

* @date 2018年8月13日  下午4:58:08

* @version 1.0  

*/
@Controller
@RequestMapping("/succ")
public class SuccefulAction {

	@Autowired
	private SuccefulService succefulService;
	
	//后台 start
	@RequestMapping(value="/back/save",method=RequestMethod.POST)
    @ResponseBody
    public void  backsave(Succeful  entity,HttpServletRequest request,HttpServletResponse httpServletResponse){
        String title = request.getParameter("title");
        String website = request.getParameter("website");
        String content = request.getParameter("content");
        String id= Long.toString(new   Date().getTime());
        entity.setCreateTime(new Date());
        byte [] introduciton;
        introduciton = strToByteArray.strToByteArray(content);
        entity.setSid(id);
        entity.setTitle(title);
        entity.setScontent(introduciton);
        entity.setCreateTime(new CurrDate().getDate());
        succefulService.addOne(entity);
        try {
			httpServletResponse.sendRedirect("list");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
    }
 	
 	@RequestMapping(value="/back/add",method=RequestMethod.GET)
 	public String backcaseGet(Model model) {
 		model.addAttribute("state", "save");
 		return "Index_SuccessCase_Detail";
 	}
 	
 	@RequestMapping(value="/back/delete",method=RequestMethod.GET)
 	void backDeleteOne(@RequestParam String id,HttpServletRequest httpServletRequest,HttpServletResponse httpServletResponse) {
 		boolean a = succefulService.deleteOne(id);
 		System.out.println("删除结果:"+a);
 		try {
			httpServletResponse.sendRedirect("list");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 	}
 	
	@RequestMapping(value="/back/list",method=RequestMethod.GET)
	public ModelAndView backlistAll(Page page) {
		ModelAndView mav = new ModelAndView();
        PageHelper.offsetPage(page.getStart(),10);
		List<Succeful> list = new ArrayList<Succeful>();
		list = succefulService.SelectAll();
		int total = (int) new PageInfo<>(list).getTotal();
		page.caculateLast(total);
		mav.addObject("list", list);
		mav.setViewName("Index_SuccessCaseEdit");
		return mav;  
	}
 	
 	@RequestMapping(value="/back/update",method=RequestMethod.GET)
 	String backupdate(Model model,@RequestParam String id) {
 		Succeful succeful = new Succeful();
 		succeful = succefulService.selectOne(id);
 		ByteToStr byteToStr = new ByteToStr();
 		String intro= byteToStr.byteToStr(succeful.getScontent());
 		intro = intro.replaceAll("\"", "'");
 		model.addAttribute("succeful", succeful);
 		model.addAttribute("state","update");
 		model.addAttribute("intro", intro);
		return "Index_SuccessCase_Detail";
 	}
 	@RequestMapping(value="/back/update",method=RequestMethod.POST)
 	void backupdateP(Model model,HttpServletRequest request,@RequestParam String id,HttpServletResponse httpServletResponse) {
 		Succeful entity = new Succeful();
        String title = request.getParameter("title");
        String website = request.getParameter("website");
        String content = request.getParameter("content");
		strToByteArray strToByteArray = new strToByteArray();
		byte[]aa;
		aa = strToByteArray.strToByteArray(content);
		entity.setSid(id);
        entity.setTitle(title);
        entity.setScontent(aa);
        entity.setChangeTime(new CurrDate().getDate());
 		boolean a =succefulService.update(entity);
 		System.out.println(a);
 		try {
			httpServletResponse.sendRedirect("list");
		} catch (IOException e) {
			// TODO Auto-generated ca	tch block
			e.printStackTrace();
		}
		}
 	
} 
