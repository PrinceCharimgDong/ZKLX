/**  

* <p>Title: ProItAction.java</p>  

* <p>Description: </p>  

* <p>Copyright: Copyright (c) 2017</p>  

* <p>Company: 中科立信</p>  

* @author 王冬冬

* @date 2018年7月23日  上午11:35:24

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
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sun.org.apache.bcel.internal.generic.NEW;
import com.zklx.domain.ProIt;
import com.zklx.domain.ProSystemHeadWithBLOBs;
import com.zklx.service.LogoService;
import com.zklx.service.ProItService;

import util.ByteToStr;
import util.Message;
import util.Page;
import util.ShowPhoto;
import util.strToByteArray;

/**  

* <p>Title: ProItAction.java</p>  

* <p>Description: </p>  

* <p>Copyright: Copyright (c) 2017</p>  

* <p>Company: 中科立信</p>  

* @author 王冬冬

* @date 2018年7月23日  上午11:35:24

* @version 1.0  

*/
@Controller
@RequestMapping("/proit")
public class ProItAction {

	
	@Autowired
	private ProItService proItService;

	@Autowired
	private LogoService logoService;
	//前台显示
	@RequestMapping(value="/list",method=RequestMethod.GET)
	public ModelAndView listAll(Page page) {
		ModelAndView mav = new ModelAndView();
        PageHelper.offsetPage(page.getStart(),10);
		List<ProIt> list = new ArrayList<ProIt>();
		list = proItService.SelectAll();
		String photo ="";
		try {
			photo = new ShowPhoto().getPhoto(new ByteToStr().byteToStr(logoService.SelectAll().getPhoto()));
		} catch (Exception e) {
			// TODO: handle exception
		}
		int total = (int) new PageInfo<>(list).getTotal();
		page.caculateLast(total);
		mav.addObject("photo", photo);
		mav.addObject("list", list);
		mav.setViewName("proitlist");
		return mav; 
	}
	
	@RequestMapping(value="/detail",method=RequestMethod.GET)
 	public String caseDetailGet(Model model,@RequestParam("id")String id) {
		ProIt proIt = new ProIt();
		proIt = proItService.selectOne(id);
		String photo ="";
		try {
			photo = new ShowPhoto().getPhoto(new ByteToStr().byteToStr(logoService.SelectAll().getPhoto()));
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		model.addAttribute("photo", photo);
		model.addAttribute("title", proIt.getTitle());
		model.addAttribute("introduciton", new ByteToStr().byteToStr(proIt.getIntroduciton()));
 		return "itdetail";
 	} 
	
	//前台ending
	
	
	
	
	
	
	
	
	
	//后台 start
 	@RequestMapping(value="/back/save",method=RequestMethod.POST)
    @ResponseBody  
    public Message  imgUploadByUeditor(@RequestBody ProIt entity,HttpServletRequest request,HttpServletResponse httpServletResponse){
       
        String id= Long.toString(new   Date().getTime());
        entity.setAid(id);
        if( proItService.addOne(entity)) {
 			return new Message("添加成功");
 		}else{
 			return new Message("添加失败，请稍后再试！");
 		}
        
    }
 	
 	@RequestMapping(value="/back/add",method=RequestMethod.GET)
 	public String caseGet(Model model) {
 		model.addAttribute("state", "save");
 		return "Project_OperationsEdit_Detail";
 	}
 	

	
	
	
	
 	@RequestMapping(value="/back/delete",method=RequestMethod.GET)
 	void deleteOne(@RequestParam String id,HttpServletRequest httpServletRequest,HttpServletResponse httpServletResponse) {
 		proItService.deleteOne(id);
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
		List<ProIt> list = new ArrayList<ProIt>();
		list = proItService.SelectAll();
		String photo ="";
		try {
			photo = new ShowPhoto().getPhoto(new ByteToStr().byteToStr(logoService.SelectAll().getPhoto()));
		} catch (Exception e) {
			// TODO: handle exception
		}
		int total = (int) new PageInfo<>(list).getTotal();
		page.caculateLast(total);
		mav.addObject("photo", photo);
		mav.addObject("type", "?");
		mav.addObject("list", list);
		mav.setViewName("Project_OperationsEdit");
		return mav;  
	}
 	
 	@RequestMapping(value="/back/update",method=RequestMethod.GET)
 	String backupdate(Model model,@RequestParam String id) {
 		System.out.println("id"+id);
 		ProIt proIt = new ProIt();
 		proIt = proItService.selectOne(id);
 		ByteToStr byteToStr = new ByteToStr();
 		String intro= byteToStr.objToStr(proIt.getIntroduciton());
 		intro = intro.replaceAll("\"", "'");
 		model.addAttribute("proIt", proIt);
 		model.addAttribute("intro",intro);
 		model.addAttribute("state","update");
		return "Project_OperationsEdit_Detail";
 	}
 	@RequestMapping(value="/back/update",method=RequestMethod.POST)
 	@ResponseBody 
 	Message backupdateP(@RequestBody ProIt proIt) {
 		if(proItService.update(proIt)) {
  			return new Message("添加成功");
  		}else{
  			return new Message("添加失败，请稍后再试！");
  		}
 	}
 	
 	
 	@RequestMapping(value="/back/select",method=RequestMethod.GET)
 	ModelAndView backselect(@RequestParam String title,Page page,HttpServletResponse httpServletResponse) {
 		String newtitle = "%"+title+"%";
		ModelAndView mav = new ModelAndView();
        PageHelper.offsetPage(page.getStart(),10);
        List<ProIt> list = new ArrayList<ProIt>();
		list = proItService.selectByTitle(newtitle);
		int total = (int) new PageInfo<>(list).getTotal();
		page.caculateLast(total);
		mav.setViewName("Project_OperationsEdit");
		mav.addObject("list", list);
		mav.addObject("type", "&");
		return mav;  
 	}
}
