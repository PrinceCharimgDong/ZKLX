/**  

* <p>Title: NewsAction.java</p>  

* <p>Description: </p>  

* <p>Copyright: Copyright (c) 2017</p>  

* <p>Company: 中科立信</p>  

* @author 王冬冬

* @date 2018年7月23日  上午11:42:53

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
import com.zklx.domain.ComNewsWithBLOBs;
import com.zklx.domain.Headbanner;
import com.zklx.service.HeadbannerService;
import com.zklx.service.LogoService;
import com.zklx.service.NewsService;

import util.ByteToStr;
import util.Message;
import util.Page;
import util.ShowPhoto;
/**  

* <p>Title: NewsAction.java</p>  

* <p>Description: 公司新闻</p>  

* <p>Copyright: Copyright (c) 2017</p>  

* <p>Company: 中科立信</p>  

* @author 王冬冬

* @date 2018年7月23日  上午11:42:53

* @version 1.0  

*/
@Controller
@RequestMapping("/news") 
public class NewsAction {

	
	@Autowired
	private NewsService newsService;

	@Autowired
	private LogoService logoService;

	@Autowired
	private HeadbannerService headbannerService;
	
	
	//前台显示
	@RequestMapping(value="/list",method=RequestMethod.GET)
	public ModelAndView listAll(Page page) {
		ModelAndView mav = new ModelAndView();
        PageHelper.offsetPage(page.getStart(),10);
		List<ComNewsWithBLOBs> list = new ArrayList<ComNewsWithBLOBs>();
		list = newsService.SelectAll();
		int total = (int) new PageInfo<>(list).getTotal();
		String photo ="";
		try {
			photo = new ShowPhoto().getPhoto(new ByteToStr().byteToStr(logoService.SelectAll().getPhoto()));
		} catch (Exception e) {
			// TODO: handle exception
		}
		List<Headbanner> list1 = new ArrayList<Headbanner>();
		list1 = headbannerService.SelectAll();
		page.caculateLast(total);
		mav.addObject("photo", photo);
		mav.addObject("list", list);
		mav.addObject("list1", list1);
		// 放入jsp路径
		mav.setViewName("newslist");
		return mav;
	}
	@RequestMapping(value="/detail",method=RequestMethod.GET)
 	public String caseDetailGet(Model model,@RequestParam("id")String id) {
		String photo ="";
		try {
			photo = new ShowPhoto().getPhoto(new ByteToStr().byteToStr(logoService.SelectAll().getPhoto()));
		} catch (Exception e) {
			// TODO: handle exception
		}
		ComNewsWithBLOBs comNewsWithBLOBs = new ComNewsWithBLOBs();
		comNewsWithBLOBs = newsService.selectOne(id);
		model.addAttribute("photo", photo);
		model.addAttribute("comNewsWithBLOBs", comNewsWithBLOBs);
 		return "newsdetail";
 	} 
	
	//前台ending
	
	
	
	
	
	
	
	
	
	//后台 start
	@RequestMapping(value="/back/list",method=RequestMethod.GET)
	public ModelAndView backlistAll(Page page) {
		ModelAndView mav = new ModelAndView();
        PageHelper.offsetPage(page.getStart(),10);
		List<ComNewsWithBLOBs> list = new ArrayList<ComNewsWithBLOBs>();
		list = newsService.SelectAll();
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
		mav.setViewName("New_ListEdit");
		return mav;  
	}
 	@RequestMapping(value="/back/add",method=RequestMethod.GET)
 	public String caseGet(Model model) {
 		model.addAttribute("state", "save");
 		return "New_List_Detail";
 	}
 	@RequestMapping(value="/back/save",method=RequestMethod.POST)
    @ResponseBody  
    public Message  imgUploadByUeditor(@RequestBody ComNewsWithBLOBs entity){
        String id= Long.toString(new   Date().getTime());
        entity.setCid(id);
        if (newsService.addOne(entity)) {
        	return new Message("添加成功");
		};
        return new Message("添加失败");
    }
 	

	
 	
 	@RequestMapping(value="/back/update",method=RequestMethod.GET)
 	String backupdate(Model model,@RequestParam String id) {
 		ComNewsWithBLOBs comNewsWithBLOBs = new ComNewsWithBLOBs();
 		comNewsWithBLOBs = newsService.selectOne(id);
 		ByteToStr byteToStr = new ByteToStr();
 		String intro= byteToStr.byteToStr(comNewsWithBLOBs.getIntroduciton());
 		intro = intro.replaceAll("\"", "'");
 		model.addAttribute("comNewsWithBLOBs", comNewsWithBLOBs);
 		model.addAttribute("intro",intro);
 		model.addAttribute("state","update");
		return "New_List_Detail";
 	}
	@RequestMapping(value="/back/delete",method=RequestMethod.GET)
 	void deleteOne(@RequestParam String id,HttpServletRequest httpServletRequest,HttpServletResponse httpServletResponse) {
 		newsService.deleteById(id);
 		try {
			httpServletResponse.sendRedirect("list");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 	}
 	@RequestMapping(value="/back/update",method=RequestMethod.POST)
 	@ResponseBody
 	Message backupdateP(@RequestBody ComNewsWithBLOBs entity) {
		if (newsService.update(entity)) {
			return new Message("修改成功");
		}
 		
		
        return new Message("修改失败");
 	}
 	
 	
 	
 	@RequestMapping(value="/back/select",method=RequestMethod.GET)
 	ModelAndView backselect(@RequestParam String title,Page page,HttpServletResponse httpServletResponse) {
 		String newtitle = "%"+title+"%";
		ModelAndView mav = new ModelAndView();
        //PageHelper.offsetPage(page.getStart(),10);
        List<ComNewsWithBLOBs> list = new ArrayList<ComNewsWithBLOBs>();
		list = newsService.SelectByTitle(newtitle);
		//int total = (int) new PageInfo<>(list).getTotal();
		//page.caculateLast(total);
		mav.setViewName("New_ListEdit");
		mav.addObject("list", list);
		mav.addObject("type", "&");
		return mav;  
 	}
}
