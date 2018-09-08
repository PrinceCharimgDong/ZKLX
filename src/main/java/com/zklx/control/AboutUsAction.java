/**  

* <p>Title: AboutUs.java</p>  

* <p>Description: </p>  

* <p>Copyright: Copyright (c) 2017</p>  

* <p>Company: 中科立信</p>  

* @author 王冬冬

* @date 2018年8月1日  下午3:51:48

* @version 1.0  

*/  
package com.zklx.control;

import java.io.IOException;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zklx.domain.About;
import com.zklx.domain.ProSystemHeadWithBLOBs;
import com.zklx.service.AboutService;
import com.zklx.service.LogoService;

import util.ByteToStr;
import util.ShowPhoto;
import util.strToByteArray;

/**  

* <p>Title: AboutUs.java</p>  

* <p>Description:联系我们 </p>  

* <p>Copyright: Copyright (c) 2017</p>  

* <p>Company: 中科立信</p>  

* @author 王冬冬

* @date 2018年8月1日  下午3:51:48

* @version 1.0  

*/
@Controller
@RequestMapping("/about")
public class AboutUsAction {
	
	@Autowired
	private AboutService aboutService;
	@Autowired
	private LogoService logoService;
	
	//前台显示
	@RequestMapping(value="/list",method=RequestMethod.GET)
	public String aboutAll(Model model) {
		About about = new About();
		about = aboutService.SelectAll();
		String photo ="";
		try {
			photo = new ShowPhoto().getPhoto(new ByteToStr().byteToStr(logoService.SelectAll().getPhoto()));
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		model.addAttribute("photo", photo);
		model.addAttribute("about", about);
		return "aboutlist"; 
	}
	
	//前台ending
	
	
	
	
	
	
	
	
	
	//后台 start
 	@RequestMapping(value="/back/update",method=RequestMethod.GET)
 	String backupdate(Model model) {
 		About about = new About();
 		about = aboutService.SelectAll();
 		model.addAttribute("about", about);
		return "ContactEdit";
 	}
 	@RequestMapping(value="/back/save",method=RequestMethod.POST)
 	void backupdateP(Model model,HttpServletRequest request,@RequestParam String id,HttpServletResponse httpServletResponse) {
 		About about = new About();
        String address = request.getParameter("address");;
        String comtel = request.getParameter("comtel");
        String person1 = request.getParameter("person1");
        String phone= request.getParameter("phone");
        String person2= request.getParameter("person2");
        String emial= request.getParameter("emial");
        String servicetel= request.getParameter("servicetel");
        String comname= request.getParameter("comname");
        about.setAid(id);
        about.setAddress(address);
        about.setComtel(comtel);
        about.setPerson1(person1);
        about.setPhone(phone);
        about.setPerson2(person2);
        about.setEmial(emial);
        about.setServicetel(servicetel);
        about.setComname(comname);
 		boolean a =aboutService.update(about);
 		System.out.println(a);
 		model.addAttribute("resu", a);
 		try {
			httpServletResponse.sendRedirect("update");
		} catch (IOException e) {
			// TODO Auto-generated ca	tch block
			e.printStackTrace();
		}
 	}
}
