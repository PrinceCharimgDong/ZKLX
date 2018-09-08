/**  

* <p>Title: SolutionAction.java</p>  

* <p>Description: </p>  

* <p>Copyright: Copyright (c) 2017</p>  

* <p>Company: 中科立信</p>  

* @author 王冬冬

* @date 2018年8月8日  下午4:34:36

* @version 1.0  

*/  
package com.zklx.control;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zklx.domain.Headbanner;
import com.zklx.domain.Solution;
import com.zklx.service.SolutionService;

import util.ByteToStr;
import util.CurrDate;
import util.Page;
import util.strToByteArray;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

/**  

* <p>Title: SolutionAction.java</p>  

* <p>Description: </p>  

* <p>Copyright: Copyright (c) 2017</p>  

* <p>Company: 中科立信</p>  

* @author 王冬冬

* @date 2018年8月8日  下午4:34:36

* @version 1.0  

*/
@Controller
@RequestMapping("/sol")
public class SolutionAction {

	@Autowired
	private SolutionService solutionService;
	
	//前台显示
	@RequestMapping(value="/list",method=RequestMethod.GET)
	public String listAll(Model model) {
		List<Solution> list = new ArrayList<>();
		list = solutionService.SelectAll();
		model.addAttribute("list", list);
		return "sollist"; 
	}
	
 	@RequestMapping(value="/update",method=RequestMethod.GET)
 	String update(Model model,@RequestParam String id) {
 		Solution solution = new Solution();
 		solution = solutionService.selectOne(id);
 		ByteToStr byteToStr = new ByteToStr();
 		String intro= byteToStr.byteToStr(solution.getScontext());
 		intro = intro.replaceAll("\"", "'");
 		model.addAttribute("solution", solution);
 		model.addAttribute("intro",intro);
 		model.addAttribute("state","update");
		return "soladd";
 	}
 	@RequestMapping(value="/update",method=RequestMethod.POST)
 	void updateP(Model model,HttpServletRequest request,@RequestParam String id,HttpServletResponse httpServletResponse) {
 		Solution solution = new Solution();
		String content = request.getParameter("content"); 
		String title = request.getParameter("title");
	    String website = request.getParameter("website");
		strToByteArray strToByteArray = new strToByteArray();
		byte[]photo;
		photo = strToByteArray.strToByteArray(content);
		solution.setLid(id);
		solution.setScontext(photo);
		solution.setChangeTime(new CurrDate().getDate());
        solution.setTitle(title);
        solution.setWebsite(website);
        solution.setChangeTime(new CurrDate().getDate());
 		boolean a =solutionService.update(solution);
 		try {
			httpServletResponse.sendRedirect("list");
		} catch (IOException e) {
			// TODO Auto-generated ca	tch block
			e.printStackTrace();
		}
 	}
 	
 	
	//前台ending
	
	
	
	
	
	
	
	
	
	//后台 start
	@RequestMapping(value="/back/save",method=RequestMethod.POST)
    @ResponseBody  
    public void  backsave(Solution entity,HttpServletRequest request,HttpServletResponse httpServletResponse){
		String title = request.getParameter("title");
        String website = request.getParameter("website");
        String content = request.getParameter("content");
        String id= Long.toString(new   Date().getTime());
        byte [] introduciton;
        introduciton = strToByteArray.strToByteArray(content);
        entity.setLid(id);
        entity.setTitle(title);
        entity.setWebsite(website);
        entity.setScontext(introduciton);
        entity.setCreateTime(new CurrDate().getDate());
        solutionService.addOne(entity);
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
 		return "Index_SolutionDetail";
 	}
 	
 	@RequestMapping(value="/back/delete",method=RequestMethod.GET)
 	void backDeleteOne(@RequestParam String id,HttpServletRequest httpServletRequest,HttpServletResponse httpServletResponse) {
 		boolean a = solutionService.deleteOne(id);
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
		List<Solution> list = new ArrayList<Solution>();
		list = solutionService.SelectAll();
		int total = (int) new PageInfo<>(list).getTotal();
		page.caculateLast(total);
		mav.addObject("list", list);
		mav.setViewName("Index_SolutionEdit");
		return mav;  
	}
 	
 	@RequestMapping(value="/back/update",method=RequestMethod.GET)
 	String backupdate(Model model,@RequestParam String id) {
 		Solution solution= new Solution();
 		solution = solutionService.selectOne(id);
 		ByteToStr byteToStr = new ByteToStr();
 		String intro= byteToStr.byteToStr(solution.getScontext());
 		intro = intro.replaceAll("\"", "'");
 		model.addAttribute("solution", solution);
 		model.addAttribute("state","update");
 		model.addAttribute("intro", intro);
		return "Index_SolutionDetail";
 	}
 	@RequestMapping(value="/back/update",method=RequestMethod.POST)
 	void backupdateP(Model model,HttpServletRequest request,@RequestParam String id,HttpServletResponse httpServletResponse) {
 		Solution entity = new Solution();
        String title = request.getParameter("title");
        String website = request.getParameter("website");
        String content = request.getParameter("content");
		strToByteArray strToByteArray = new strToByteArray();
		byte[]aa;
		aa = strToByteArray.strToByteArray(content);
		entity.setLid(id);
        entity.setTitle(title);
        entity.setWebsite(website);
        entity.setScontext(aa);
        entity.setChangeTime(new CurrDate().getDate());
 		boolean a =solutionService.update(entity);
 		try {
			httpServletResponse.sendRedirect("list");
		} catch (IOException e) {
			// TODO Auto-generated ca	tch block
			e.printStackTrace();
		}
 	}
}
