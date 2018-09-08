/**  

* <p>Title: HeadbannerAction.java</p>  

* <p>Description: </p>  

* <p>Copyright: Copyright (c) 2017</p>  

* <p>Company: 中科立信</p>  

* @author 王冬冬

* @date 2018年8月8日  上午8:59:01

* @version 1.0  

*/  
package com.zklx.control;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONArray;
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
import com.zklx.domain.Headbanner;
import com.zklx.domain.Honor;
import com.zklx.service.HeadbannerService;

import util.ByteToStr;
import util.CurrDate;
import util.Message;
import util.Page;
import util.ShowPhoto;
import util.strToByteArray;

/**  

* <p>Title: HeadbannerAction.java</p>  

* <p>Description:首页banner图 </p>  

* <p>Copyright: Copyright (c) 2017</p>  

* <p>Company: 中科立信</p>  

* @author 王冬冬

* @date 2018年8月8日  上午8:59:01

* @version 1.0  

*/
@Controller
@RequestMapping("/hb")
public class HeadbannerAction {

	@Autowired
	private HeadbannerService headbannerService;
	//前台显示
	@RequestMapping(value="/list",method=RequestMethod.GET)
	public String listAll(Model model) {
		
		List<Headbanner> list = new ArrayList<Headbanner>();
		list = headbannerService.SelectAll();
		
		model.addAttribute("list", list);
		return "hblist"; 
	}


	
 	
 	
 	

 	
	@RequestMapping(value="/back/list",method=RequestMethod.GET)
	public ModelAndView backlistAll(Page page) {
		ModelAndView mav = new ModelAndView();
		List<Headbanner> list = new ArrayList<Headbanner>();
		list = headbannerService.SelectAll();
		mav.addObject("list", list);
		mav.setViewName("Index_BannerEdit");
		return mav;  
	}
 	
	@RequestMapping(value="/back/add",method=RequestMethod.GET)
 	public String backcaseGet(Model model) {
 		model.addAttribute("state", "save");
 		return "BannerEdit_Detail";
 	}
 	
	@RequestMapping(value="/back/save",method=RequestMethod.POST)
    @ResponseBody  
    public void  backsave(Headbanner entity,HttpServletRequest request,HttpServletResponse httpServletResponse){
        String title = request.getParameter("title");
        String website = request.getParameter("website");
        String content = request.getParameter("content");
       // String isshow = request.getParameter("isshow");
        String id= Long.toString(new   Date().getTime());
	    byte [] introduciton;
        introduciton = strToByteArray.strToByteArray(content);
        entity.setHid(id);
        entity.setTitle(title);
        entity.setWebsite(website);
        entity.setIsshow("Y");
        entity.setPhoto(introduciton);
        entity.setCreateTime(new CurrDate().getDate());
        headbannerService.addOne(entity);
        try {
			httpServletResponse.sendRedirect("list");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
    }
	
 	@RequestMapping(value="/back/update",method=RequestMethod.GET)
 	String backupdate(Model model,@RequestParam String id) {
 		Headbanner headbanner = new Headbanner();
 		headbanner = headbannerService.selectOne(id);
 		ByteToStr byteToStr = new ByteToStr();
 		String intro= byteToStr.byteToStr(headbanner.getPhoto());
 		intro = intro.replaceAll("\"", "'");
 		model.addAttribute("headbanner", headbanner);
 		model.addAttribute("state","update");
 		model.addAttribute("intro", intro);
		return "BannerEdit_Detail";
 	}
 	@RequestMapping(value="/back/update",method=RequestMethod.POST)
 	void backupdateP(Model model,HttpServletRequest request,@RequestParam String id,HttpServletResponse httpServletResponse) {
 		Headbanner entity = new Headbanner();
        String title = request.getParameter("title");
        String website = request.getParameter("website");
        String content = request.getParameter("content");
		strToByteArray strToByteArray = new strToByteArray();
		byte[]aa;
		aa = strToByteArray.strToByteArray(content);
		entity.setHid(id);
        entity.setTitle(title);
        entity.setWebsite(website);
        entity.setIsshow("Y");
        entity.setPhoto(aa);
        entity.setChangeTime(new CurrDate().getDate());
 		boolean a =headbannerService.update(entity);
 		System.out.println(a);
 		try {
			httpServletResponse.sendRedirect("list");
		} catch (IOException e) {
			// TODO Auto-generated ca	tch block
			e.printStackTrace();
		}
 	}
 	
 	
 	@RequestMapping(value="/back/delete",method=RequestMethod.GET)
 	void backDeleteOne(@RequestParam String id,HttpServletRequest httpServletRequest,HttpServletResponse httpServletResponse) {
 		boolean a = headbannerService.deleteOne(id);
 		System.out.println("删除结果:"+a);
 		try {
			httpServletResponse.sendRedirect("list");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 	}
 	
 	@RequestMapping(value="/back/isshow",method=RequestMethod.POST)
 	@ResponseBody 
 	Message Show(@RequestBody Headbanner headbanner) {
 		System.out.println(headbanner.getHid()+"---------------------"+headbanner.getIsshow());
 		if ( headbannerService.updateIsShowById(headbanner)) {
			return new Message("更换状态成功");
		}
 		return new Message("更换状态失败");
 	}
}
