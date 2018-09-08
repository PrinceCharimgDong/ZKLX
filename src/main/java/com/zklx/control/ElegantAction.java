/**  

* <p>Title: ElegantAction.java</p>  

* <p>Description: </p>  

* <p>Copyright: Copyright (c) 2017</p>  

* <p>Company: 中科立信</p>  

* @author 王冬冬

* @date 2018年8月7日  上午11:24:49

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
import com.zklx.domain.ComShort;
import com.zklx.domain.Elegant;
import com.zklx.domain.Headbanner;
import com.zklx.domain.ProSystemHeadWithBLOBs;
import com.zklx.service.ElegantService;
import com.zklx.service.LogoService;

import util.ByteToStr;
import util.CurrDate;
import util.Message;
import util.Page;
import util.ShowPhoto;
import util.ShowText;
import util.strToByteArray;

/**  

* <p>Title: ElegantAction.java</p>  

* <p>Description:团队风采 </p>  

* <p>Copyright: Copyright (c) 2017</p>  

* <p>Company: 中科立信</p>  

* @author 王冬冬

* @date 2018年8月7日  上午11:24:49

* @version 1.0  

*/
@Controller
@RequestMapping("/ele")
public class ElegantAction {

	@Autowired
	private ElegantService elegantService;
	//前台显示
	@RequestMapping(value="/list",method=RequestMethod.GET)
	public String listAll(Model model) {
		ShowPhoto showPhoto = new ShowPhoto();
		ByteToStr byteToStr = new ByteToStr();
		ShowText showText = new ShowText();
		List<Elegant> list = new ArrayList<>();
		list = elegantService.SelectAll();
		model.addAttribute("list", list);
		return "elelist"; 
	}
	
	//前台ending
	
	
	
	
	
	
	
	
	
	//后台 start
	@RequestMapping(value="/back/list",method=RequestMethod.GET)
	public ModelAndView backlistAll(Page page) {
		ModelAndView mav = new ModelAndView();
        PageHelper.offsetPage(page.getStart(),10);
		List<Elegant> list = new ArrayList<Elegant>();
		list = elegantService.SelectAll();
		int total = (int) new PageInfo<>(list).getTotal();
		page.caculateLast(total);
		mav.addObject("list", list);
		mav.setViewName("Culture_TeamEdit");
		return mav;  
	}
 	
 	@RequestMapping(value="/back/add",method=RequestMethod.GET)
 	public String caseGet(Model model) {
 		model.addAttribute("state", "save");
 		return "Culture_Team_Detail";
 	}
 	
 	@RequestMapping(value="/back/save",method=RequestMethod.POST)
    @ResponseBody  
    public void  imgUploadByUeditor(Elegant entity,HttpServletRequest request,HttpServletResponse httpServletResponse){
	    String content = request.getParameter("content");
        String title = request.getParameter("title");
        String id= Long.toString(new   Date().getTime());
        byte [] introduciton;
        introduciton = strToByteArray.strToByteArray(content);
        entity.setEid(id);
        entity.setTitle(title);
        entity.setPhoto(introduciton);
        entity.setCreateTime(new CurrDate().getDate());
        entity.setIsshow("Y");
        elegantService.addOne(entity);
        try {
			httpServletResponse.sendRedirect("list");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
    }
 	
	
 	
 	@RequestMapping(value="/back/update",method=RequestMethod.GET)
 	String backupdate(Model model,@RequestParam String id) {
 		Elegant elegant = new Elegant();
 		elegant = elegantService.selectOne(id);
 		ByteToStr byteToStr = new ByteToStr();
 		String intro= byteToStr.byteToStr(elegant.getPhoto());
 		intro = intro.replaceAll("\"", "'");
 		model.addAttribute("elegant", elegant);
 		model.addAttribute("state","update");
 		model.addAttribute("intro", intro);
		return "Culture_Team_Detail";
 	}
 	@RequestMapping(value="/back/update",method=RequestMethod.POST)
 	void backupdateP(Model model,HttpServletRequest request,@RequestParam String id,HttpServletResponse httpServletResponse) {
 		Elegant elegant = new Elegant();
		String title = request.getParameter("title");
		String content = request.getParameter("content");
		strToByteArray strToByteArray = new strToByteArray();
		byte[]aa;
		aa = strToByteArray.strToByteArray(content);
		elegant.setPhoto(aa);
		elegant.setEid(id);
		elegant.setTitle(title);
		elegant.setChangeTime(new CurrDate().getDate());//改变时间
		elegant.setIsshow("Y");
 		boolean a =elegantService.update(elegant);
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
 		boolean a = elegantService.deleteOne(id);
 		try {
			httpServletResponse.sendRedirect("list");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 	}
 	
 	
 	@RequestMapping(value="/back/isshow",method=RequestMethod.POST)
 	@ResponseBody 
 	Message Show(@RequestBody Elegant elegant) {
 		if ( elegantService.updateIsShowById(elegant)) {
			return new Message("更换状态成功");
		}
 		return new Message("更换状态失败");
 	}
}
