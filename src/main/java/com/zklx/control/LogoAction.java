/**  

* <p>Title: LogoAction.java</p>  

* <p>Description: </p>  

* <p>Copyright: Copyright (c) 2017</p>  

* <p>Company: 中科立信</p>  

* @author 王冬冬

* @date 2018年8月8日  下午3:21:26

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
import com.zklx.domain.Honor;
import com.zklx.domain.Logo;
import com.zklx.service.LogoService;

import util.ByteToStr;
import util.CurrDate;
import util.Page;
import util.ShowPhoto;
import util.strToByteArray;

/**  

* <p>Title: LogoAction.java</p>  

* <p>Description: Logo</p>  

* <p>Copyright: Copyright (c) 2017</p>  

* <p>Company: 中科立信</p>  
 
* @author 王冬冬

* @date 2018年8月8日  下午3:21:26

* @version 1.0  

*/
@Controller
@RequestMapping("/logo")
public class LogoAction {

	@Autowired
	private LogoService logoService;
	
	//前台显示
	@RequestMapping(value="/list",method=RequestMethod.GET)
	public String listAll(Model model) {
		Logo logo = new Logo();
		logo = logoService.SelectAll();
		model.addAttribute("logo", logo);
		return "logolist"; 
	}
	//前台ending
	
	
	
	
	
	
	
	
	
	//后台 start
	@RequestMapping(value="/back/show",method=RequestMethod.GET)
	String showlogo(Model model) {
		Logo logo = new Logo();
 		logo = logoService.SelectAll();
 		ByteToStr byteToStr = new ByteToStr();
 		String intro= byteToStr.byteToStr(logo.getPhoto());
 		intro = intro.replaceAll("\"", "'");
 		ShowPhoto showPhoto = new ShowPhoto() ;
 		intro = showPhoto.getPhoto(intro);	
 		System.out.println(intro);
 		model.addAttribute("intro", intro);
		return "ShowLogo";
	}
	
	
		//因为logo只有一条数据 所以只设置修改 
 	@RequestMapping(value="/back/update",method=RequestMethod.GET)
 	String backupdate(Model model) {
 		Logo logo = new Logo();
 		logo = logoService.SelectAll();
 		ByteToStr byteToStr = new ByteToStr();
 		String intro= byteToStr.byteToStr(logo.getPhoto());
 		intro = intro.replaceAll("\"", "'");
 		System.out.println(intro);
 		model.addAttribute("logo", logo);
 		model.addAttribute("state","update");
 		model.addAttribute("intro", intro);
		return "Logoedit";
 	}
 	@RequestMapping(value="/back/update",method=RequestMethod.POST)
 	void backupdateP(Model model,HttpServletRequest request,@RequestParam String id,HttpServletResponse httpServletResponse) {
 		Logo logo = new Logo();
		String content = request.getParameter("content");
		strToByteArray strToByteArray = new strToByteArray();
		byte[]aa;
		aa = strToByteArray.strToByteArray(content);
		logo.setPhoto(aa);
		logo.setLid(id);
		logo.setChangeTime(new CurrDate().getDate());
 		boolean a =logoService.update(logo);
 		System.out.println(a);
 		try {
			httpServletResponse.sendRedirect("update");
		} catch (IOException e) {
			// TODO Auto-generated ca	tch block
			e.printStackTrace();
		}
 	}
}
