/**  

* <p>Title: HonorAction.java</p>  

* <p>Description: </p>  

* <p>Copyright: Copyright (c) 2017</p>  

* <p>Company: 中科立信</p>  

* @author 王冬冬

* @date 2018年7月23日  下午2:06:59

* @version 1.0  

*/  
package com.zklx.control;

import java.io.File;
import java.io.FileInputStream;
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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zklx.domain.Elegant;
import com.zklx.domain.Headbanner;
import com.zklx.domain.Honor;
import com.zklx.service.HeadbannerService;
import com.zklx.service.HonorService;
import com.zklx.service.LogoService;

import util.ByteToStr;
import util.CurrDate;
import util.Page;
import util.ShowPhoto;
import util.strToByteArray;


/**  

* <p>Title: HonorAction.java</p>  

* <p>Description: 荣誉资质</p>  

* <p>Copyright: Copyright (c) 2017</p>  

* <p>Company: 中科立信</p>  

* @author 王冬冬

* @date 2018年7月23日  下午2:06:59

* @version 1.0  

*/
@Controller
@RequestMapping("/honor")
public class HonorAction {


	
	@Autowired
	private HonorService honorService;
	
	@Autowired
	private HeadbannerService headbannerService;

	@Autowired
	private LogoService logoService;
	
	//前台显示
	@RequestMapping(value="/list",method=RequestMethod.GET)
	public String listAll(Model model) {
		List<Honor> list = new ArrayList<Honor>();
		list = honorService.SelectAll();
		String photo ="";
		try {
			photo = new ShowPhoto().getPhoto(new ByteToStr().byteToStr(logoService.SelectAll().getPhoto()));
		} catch (Exception e) {
			// TODO: handle exception
		}
		List<Headbanner> list1 = new ArrayList<Headbanner>();
		list1 = headbannerService.SelectAll();
		
		model.addAttribute("photo", photo);
		model.addAttribute("list1", list1);
		model.addAttribute("list", list);
		return "honorlist"; 
	}


 	
	//前台ending
	
	
	
	
	
	
	
	
	
	//后台 start
	@RequestMapping(value="/back/list",method=RequestMethod.GET)
	public ModelAndView backlistAll(Page page) {
		ModelAndView mav = new ModelAndView();
        PageHelper.offsetPage(page.getStart(),10);
		List<Honor> list = new ArrayList<Honor>();
		list = honorService.SelectAll();
		int total = (int) new PageInfo<>(list).getTotal();
		page.caculateLast(total);
		mav.addObject("list", list);
		mav.setViewName("Culture_HonorEdit");
		return mav;  
	}
	@RequestMapping(value="/back/add",method=RequestMethod.GET)
	public String backadd(Model model) {
 		model.addAttribute("state","save");
		return "Culture_Honor_Detail";
	}
	@RequestMapping(value="/back/save",method=RequestMethod.POST)
    @ResponseBody  
    public void  imgUploadByUeditor(Honor entity,HttpServletRequest request,HttpServletResponse httpServletResponse){
	    String content = request.getParameter("content");
        String title = request.getParameter("title");
        String id= Long.toString(new   Date().getTime());
        byte [] introduciton;
        introduciton = strToByteArray.strToByteArray(content);
        entity.setSid(id);
        entity.setTitle(title);
        entity.setPhoto(introduciton);
        entity.setCreateTime(new CurrDate().getDate());
        honorService.addOne(entity);
        try {
			httpServletResponse.sendRedirect("list");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
    }
 	
 	@RequestMapping(value="/back/update",method=RequestMethod.GET)
 	String backupdate(Model model,@RequestParam String id) {
 		Honor honor = new Honor();
 		honor = honorService.selectOne(id);
 		ByteToStr byteToStr = new ByteToStr();
 		String intro= byteToStr.byteToStr(honor.getPhoto());
 		intro = intro.replaceAll("\"", "'");
 		model.addAttribute("honor", honor);
 		model.addAttribute("state","update");
 		model.addAttribute("intro", intro);
		return "Culture_Honor_Detail";
 	}
 	@RequestMapping(value="/back/update",method=RequestMethod.POST)
 	void backupdateP(Model model,HttpServletRequest request,@RequestParam String id,HttpServletResponse httpServletResponse) {
 		Honor honor = new Honor();
		String title = request.getParameter("title");
		String content = request.getParameter("content");
		strToByteArray strToByteArray = new strToByteArray();
		byte[]aa;
		aa = strToByteArray.strToByteArray(content);
		honor.setPhoto(aa);
		honor.setSid(id);
		honor.setTitle(title);
		honor.setCreateTime(new CurrDate().getDate());//实际为更新时间
 		boolean a =honorService.update(honor);
 		System.out.println(a);
 		try {
			httpServletResponse.sendRedirect("list");
		} catch (IOException e) {
			// TODO Auto-generated ca	tch block
			e.printStackTrace();
		}
 	}

 	
 	@RequestMapping(value="/back/delete",method=RequestMethod.GET)
 	void deleteOne(@RequestParam String id,HttpServletRequest httpServletRequest,HttpServletResponse httpServletResponse) {
 		boolean a = honorService.deleteOne(id);
 		System.out.println("删除结果:"+a);
 		try {
			httpServletResponse.sendRedirect("list");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 	}
 	
}
