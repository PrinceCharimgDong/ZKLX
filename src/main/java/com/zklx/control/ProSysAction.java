/**  

* <p>Title: ProSysAction.java</p>  

* <p>Description: </p>  

* <p>Copyright: Copyright (c) 2017</p>  

* <p>Company: 中科立信</p>  

* @author 王冬冬

* @date 2018年7月12日  下午12:01:29

* @version 1.0  

*/  
package com.zklx.control;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
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
import com.sun.xml.internal.bind.unmarshaller.Messages;
import com.zklx.domain.ProIt;
import com.zklx.domain.ProSystemHead;
import com.zklx.domain.ProSystemHeadWithBLOBs;
import com.zklx.service.LogoService;
import com.zklx.service.ProSysService;

import util.ByteToStr;
import util.Message;
import util.Page;
import util.ShowPhoto;
import util.strToByteArray;

/**  

* <p>Title: ProSysAction.java</p>  

* <p>Description: </p>  

* <p>Copyright: Copyright (c) 2017</p>  

* <p>Company: 中科立信</p>  

* @author 王冬冬

* @date 2018年7月12日  下午12:01:29

* @version 1.0  

*/
@Controller
@RequestMapping("/case")
public class ProSysAction {

	@Autowired
	private ProSysService proSysService;
	

	@Autowired
	private LogoService logoService;
	//前台显示
	@RequestMapping(value="/list",method=RequestMethod.GET)
	public ModelAndView listAll(Page page) {
		ModelAndView mav = new ModelAndView();
        PageHelper.offsetPage(page.getStart(),10);
		List<ProSystemHeadWithBLOBs> list = new ArrayList<ProSystemHeadWithBLOBs>();
		list = proSysService.SelectAll();
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
		mav.setViewName("caselist");
		return mav;  
	}
	@RequestMapping(value="/casea1",method=RequestMethod.GET)
	public String listOne(Model model,@RequestParam("id")String id ) {
		ProSystemHeadWithBLOBs proSystemHeadWithBLOBs = new ProSystemHeadWithBLOBs();
		proSystemHeadWithBLOBs = proSysService.selectOne(id);
		String photo ="";
		try {
			photo = new ShowPhoto().getPhoto(new ByteToStr().byteToStr(logoService.SelectAll().getPhoto()));
		} catch (Exception e) {
			// TODO: handle exception
		}
		model.addAttribute("photo", photo);	//logo
		model.addAttribute("title", proSystemHeadWithBLOBs.getTitle());	
		model.addAttribute("introduciton", new ByteToStr().byteToStr(proSystemHeadWithBLOBs.getIntroduciton()));	
		return "casea1";
	}
	

	
	//前台ending
	
	
	
	
	
	
	
	
	
	/*//后台 start
 	@RequestMapping(value="/back/save",method=RequestMethod.POST)
    @ResponseBody  
    public void  imgUploadByUeditor(ProSystemHeadWithBLOBs entity,HttpServletRequest request,HttpServletResponse httpServletResponse){
        String content = request.getParameter("content");
        String title = request.getParameter("title");
        String id= Long.toString(new   Date().getTime());
        byte [] introduciton;
        introduciton = strToByteArray.strToByteArray(content);
        entity.setSid(id);
        entity.setTitle(title);
        entity.setIntroduciton(introduciton);
        proSysService.addOne(entity);
        try {
			httpServletResponse.sendRedirect("list");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
    }*/
 	
	@RequestMapping(value="/back/save",method=RequestMethod.POST)
    @ResponseBody  
    public Message  imgUploadByUeditor(@RequestBody ProSystemHeadWithBLOBs entity){
        String id= Long.toString(new   Date().getTime());
        entity.setSid(id);
        if( proSysService.addOne(entity)) {
 			return new Message("添加成功");
 		}else{
 			return new Message("添加失败，请稍后再试！");
 		}
        
    }
	
	
	
	
	
 	@RequestMapping(value="/back/add",method=RequestMethod.GET)
 	public String caseGet(Model model) {
 		model.addAttribute("state", "save");
 		return "Project_SystemEdit_Detail";
 	}
 	
 	@RequestMapping(value="/back/delete",method=RequestMethod.GET)
 	void deleteOne(@RequestParam String id,HttpServletRequest httpServletRequest,HttpServletResponse httpServletResponse) {
 		proSysService.deleteOne(id);
 		try {
			httpServletResponse.sendRedirect("list");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 	}
 	
 	@RequestMapping(value="/update",method=RequestMethod.GET)
 	String update(Model model,@RequestParam String id) {
 		ProSystemHeadWithBLOBs proSystemHeadWithBLOBs = new ProSystemHeadWithBLOBs();
 		proSystemHeadWithBLOBs = proSysService.selectOne(id);
 		ByteToStr byteToStr = new ByteToStr();
 		String intro= byteToStr.byteToStr(proSystemHeadWithBLOBs.getIntroduciton());
 		intro = intro.replaceAll("\"", "'");

 		model.addAttribute("proSystemHeadWithBLOBs", proSystemHeadWithBLOBs);
 		model.addAttribute("intro",intro);
 		model.addAttribute("state","update");
		return "caseadd";
 	}
/* 	@RequestMapping(value="/update",method=RequestMethod.POST)
 	void updateP(Model model,HttpServletRequest request,@RequestParam String id,HttpServletResponse httpServletResponse) {
 		ProSystemHeadWithBLOBs proSystemHeadWithBLOBs= new ProSystemHeadWithBLOBs();
		String title = request.getParameter("title");
		String content = request.getParameter("content");
		strToByteArray strToByteArray = new strToByteArray();
		byte[]aa;
		aa = strToByteArray.strToByteArray(content);
		proSystemHeadWithBLOBs.setIntroduciton(aa);
		proSystemHeadWithBLOBs.setSid(id);
		proSystemHeadWithBLOBs.setTitle(title);
 		boolean a =proSysService.update(proSystemHeadWithBLOBs);
 		System.out.println(a);
 		try {
			httpServletResponse.sendRedirect("list");
		} catch (IOException e) {
			// TODO Auto-generated ca	tch block
			e.printStackTrace();
		}
 	}*/
	@RequestMapping(value="/back/update",method=RequestMethod.POST)
	@ResponseBody  
	Message updateP(@RequestBody ProSystemHeadWithBLOBs proSystemHeadWithBLOBs) {
 		if(proSysService.update(proSystemHeadWithBLOBs)) {
 			return new Message("更新成功");
 		}else{
 			return new Message("更新失败，请稍后再试！");
 		}
 	}
 	
 	
 	
 	
 	
	@RequestMapping(value="/back/list",method=RequestMethod.GET)
	public ModelAndView backlistAll(Page page) {
		ModelAndView mav = new ModelAndView();
        PageHelper.offsetPage(page.getStart(),10);
		List<ProSystemHeadWithBLOBs> list = new ArrayList<ProSystemHeadWithBLOBs>();
		list = proSysService.SelectAll();
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
		mav.setViewName("Project_SystemEdit");
		return mav;  
	}
 	
 	@RequestMapping(value="/back/update",method=RequestMethod.GET)
 	String backupdate(Model model,@RequestParam String id) {
 		ProSystemHeadWithBLOBs proSystemHeadWithBLOBs = new ProSystemHeadWithBLOBs();
 		proSystemHeadWithBLOBs = proSysService.selectOne(id);
 		ByteToStr byteToStr = new ByteToStr();
 		String intro= byteToStr.byteToStr(proSystemHeadWithBLOBs.getIntroduciton());
 		intro = intro.replaceAll("\"", "'");
 		model.addAttribute("proSystemHeadWithBLOBs", proSystemHeadWithBLOBs);
 		model.addAttribute("intro",intro);
 		model.addAttribute("state","update");
		return "Project_SystemEdit_Detail";
 	}
 	/*@RequestMapping(value="/back/update",method=RequestMethod.POST)
 	void backupdateP(Model model,HttpServletRequest request,@RequestParam String id,HttpServletResponse httpServletResponse) {
 		ProSystemHeadWithBLOBs proSystemHeadWithBLOBs= new ProSystemHeadWithBLOBs();
		String title = request.getParameter("title");
		String content = request.getParameter("content");
		strToByteArray strToByteArray = new strToByteArray();
		byte[]aa;
		aa = strToByteArray.strToByteArray(content);
		proSystemHeadWithBLOBs.setIntroduciton(aa);
		proSystemHeadWithBLOBs.setSid(id);
		proSystemHeadWithBLOBs.setTitle(title);
 		boolean a =proSysService.update(proSystemHeadWithBLOBs);
 		System.out.println(a);
 		try {
			httpServletResponse.sendRedirect("list");
		} catch (IOException e) {
			// TODO Auto-generated ca	tch block
			e.printStackTrace();
		}
 	}*/
 	
 	
 	@RequestMapping(value="/back/select",method=RequestMethod.GET)
 	ModelAndView backselect(@RequestParam String title,Page page,HttpServletResponse httpServletResponse) {
 		String newtitle = "%"+title+"%";
 		System.out.println("newtitle:"+newtitle);
		ModelAndView mav = new ModelAndView();
        List<ProSystemHeadWithBLOBs> list = new ArrayList<ProSystemHeadWithBLOBs>();
		list = proSysService.selectByTitle(newtitle);
		mav.setViewName("Project_SystemEdit");
		mav.addObject("list", list);
		mav.addObject("type", "&");
		return mav;  
 	}
 	
}
