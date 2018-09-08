/**  

* <p>Title: ComShortServiceAction.java</p>  

* <p>Description: </p>  

* <p>Copyright: Copyright (c) 2017</p>  

* <p>Company: 中科立信</p>  

* @author 王冬冬

* @date 2018年8月1日  上午9:44:36

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

import com.zklx.domain.ComShort;
import com.zklx.domain.Elegant;
import com.zklx.domain.Headbanner;
import com.zklx.domain.ProApp;
import com.zklx.service.ComShortService;
import com.zklx.service.ElegantService;
import com.zklx.service.HeadbannerService;
import com.zklx.service.LogoService;

import util.ByteToStr;
import util.ShowPhoto;
import util.ShowText;
import util.strToByteArray;

/**  

* <p>Title: ComShortServiceAction.java</p>  

* <p>Description: 公司简介</p>  

* <p>Copyright: Copyright (c) 2017</p>  

* <p>Company: 中科立信</p>  

* @author 王冬冬

* @date 2018年8月1日  上午9:44:36

* @version 1.0  

*/
@Controller
@RequestMapping("/short")
public class ComShortAction {

	@Autowired
	private ComShortService comShortService;

	@Autowired
	private ElegantService elegantService;

	@Autowired
	private HeadbannerService headbannerService;
	
	
	@Autowired
	private LogoService logoService;
	//前台显示
	@RequestMapping(value="/list",method=RequestMethod.GET)
	public String listAll(Model model) {
		ComShort comShort = new ComShort();
		comShort = comShortService.SelectAll();
		ShowPhoto showPhoto = new ShowPhoto();
		ByteToStr byteToStr = new ByteToStr();
		ShowText showText = new ShowText();
		List<Headbanner> list1 = new ArrayList<Headbanner>();
		list1 = headbannerService.SelectAll();
		String  photopath,text;
		photopath = showPhoto.getPhoto(byteToStr.objToStr(comShort.getIntroduciton()));
		text = showText.getText(byteToStr.objToStr(comShort.getIntroduciton()));
		List<Elegant> list = new ArrayList<>();
		list = elegantService.SelectAll();
		String photo =""; 
		try {
			photo = new ShowPhoto().getPhoto(new ByteToStr().byteToStr(logoService.SelectAll().getPhoto()));
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		model.addAttribute("photo", photo);
		model.addAttribute("list1", list1);
		model.addAttribute("list", list);
		model.addAttribute("text", text);
		model.addAttribute("photopath", photopath);
		return "comshortlist"; 
	}
	
	
	//前台ending
	
	
	
	
	
	
	
	
	
	//后台 start
	@RequestMapping(value="/back/list",method=RequestMethod.GET)
	public String backlist(Model model) {
		ComShort comShort = new ComShort();
		comShort = comShortService.SelectAll();
		ShowPhoto showPhoto = new ShowPhoto();
		ByteToStr byteToStr = new ByteToStr();
		ShowText showText = new ShowText(); 
		String  photopath,text;
		photopath = showPhoto.getPhoto(byteToStr.byteToStr(comShort.getIntroduciton()));
		text = showText.getText(byteToStr.byteToStr(comShort.getIntroduciton()));
		List<Elegant> list = new ArrayList<>();
		list = elegantService.SelectAll();
		String photo ="";
		try {
			photo = new ShowPhoto().getPhoto(new ByteToStr().byteToStr(logoService.SelectAll().getPhoto()));
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		model.addAttribute("photo", photo);
		model.addAttribute("list", list);
		model.addAttribute("text", text);
		model.addAttribute("photopath", photopath);
		return "Culture_IntroductionEdit"; 
	}
	
 
 	
 	@RequestMapping(value="/back/update",method=RequestMethod.GET)
 	public String caseGet(Model model) {
 		ComShort comShort = new ComShort();
 		comShort=comShortService.SelectAll();
 		ByteToStr byteToStr = new ByteToStr();
 		String intro= byteToStr.byteToStr(comShort.getIntroduciton()); 
 		model.addAttribute("intro",intro);
 		model.addAttribute("comShort", comShort);
 		return "Culture_IntroductionEdit_Detail";
 	} 
 	

	

	@RequestMapping(value="/back/update",method=RequestMethod.POST)
    @ResponseBody  
    public void  backadd(ComShort entity,HttpServletRequest request,HttpServletResponse httpServletResponse,@RequestParam String id){
     
        String content = request.getParameter("content");
        strToByteArray strToByteArray = new strToByteArray();
		byte[]aa;
		aa = strToByteArray.strToByteArray(content);
		entity.setIntroduciton(aa);
		entity.setCid(id);
 		boolean a =comShortService.update(entity);
 		System.out.println(a);
 		try {
			httpServletResponse.sendRedirect("list");
		} catch (IOException e) {
			// TODO Auto-generated ca	tch block
			e.printStackTrace();
		}
    }
}
