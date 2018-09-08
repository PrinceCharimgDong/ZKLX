package com.zklx.control;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.List;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.ibatis.annotations.Param;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authc.credential.DefaultPasswordService;
import org.apache.shiro.authz.UnauthorizedException;
import org.apache.shiro.authz.annotation.RequiresRoles;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zklx.domain.MappingUr;
import com.zklx.domain.Uuser;
import com.zklx.service.IUserService;

import util.*;

@Controller
public class UserController {

	@Autowired
	private IUserService userService;
	@Resource
	private Uuser user;
	@Resource
	private DefaultPasswordService passwordService;

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	@ResponseBody
	public Message login(@RequestBody UserValidate userValidate) {
		
		UsernamePasswordToken token = new UsernamePasswordToken(userValidate.getUsername(), userValidate.getPassword());

		token.setRememberMe(userValidate.getRememberme());// 记住密码
		try {
			Subject currentUser = SecurityUtils.getSubject();   
			currentUser.login(token);
			
			SecurityUtils.getSubject().login(token);
			System.out.println("成功登陆");
			return new Message("login success");
		} catch (UnknownAccountException uae) {
			System.out.println("UnknownAccountException111");
			return new Message("error username"); 
		} catch (IncorrectCredentialsException ice) {
			System.out.println("IncorrectCredentialsException0000");
			return new Message("error password");
		}
	}

	@RequiresRoles("admin")
	@RequestMapping(value = "/allUsers", method = RequestMethod.GET)
	@ResponseBody
	public List<Uuser> getusers() {
		return userService.getallusers();
	}

	@RequestMapping(value = "/addUser", method = RequestMethod.POST)
	@ResponseBody
	public Uuser adduser(@RequestBody Uuser u) {
		System.out.println("沙雕");
		String pwd = u.getPassword();
		//String newpwd = passwordService.encryptPassword(pwd);
		//u.setPassword(newpwd);
		Uuser user = userService.createUser(u);
		Long uid = user.getId();
		List<MappingUr> urlist = u.getMapping_UR();
		if (urlist != null) {
			for (MappingUr ur : urlist) {
				if (ur != null) {
					Long roleid = ur.getRole().getId();
					userService.correlationRoles(uid.intValue(), roleid.intValue());
				}
			}
		}

		return user;
	}

/*	@RequestMapping(value = "/updateUser/{uid}", method = RequestMethod.PUT)
	@ResponseBody
	public Uuser updateuser(@PathVariable int uid, @RequestBody Uuser u) {
		Uuser user = userService.updateuser(u);
		if (u.getMapping_UR() != null && u.getMapping_UR().size() != 0) {
			userService.deleteuserroles(uid);
			List<MappingUr> urlist = u.getMapping_UR();
			for (MappingUr ur : urlist) {
				if (ur != null) {
					Long roleid = ur.getRole().getId();
					userService.correlationRoles(uid, roleid.intValue());
				}
			}
		}

		return user;
	}*/

	@RequestMapping(value = "/getUser/{uid}", method = RequestMethod.GET)
	@ResponseBody
	public Uuser getuser(@PathVariable int uid) {
		Uuser user = userService.getUser(uid);
		return user;
	}

	@RequiresRoles("admin")
	@RequestMapping(value = "/deleteUser/{uid}", method = RequestMethod.DELETE)
	@ResponseBody
	public Message deleteuser(@PathVariable int uid) throws UnauthorizedException {
		try {
			userService.deleteuserroles(uid);
			userService.deleteuser(uid);
			return new Message("delete success");
		} catch (Exception e) {
			e.printStackTrace();
			return new Message("delete failed");
		}
	}

	@RequestMapping(value = "/unauthorized", method = RequestMethod.GET)
	@ResponseBody
	public Message unauthorized() {
		return new Message("Unauthorized!");
	}

	@RequestMapping(value = "/changePass", method = RequestMethod.GET)
	public String gaimima(Model model) {
		
		user = userService.findFirst();
		model.addAttribute("user", user);
		return "changepassword";
	}
	@RequestMapping(value = "/changePassword", method = RequestMethod.POST)
	@ResponseBody
	public Message postmima(@RequestParam Uuser uu/*String id*//*,String username,String password,String  oldpa*/,HttpServletRequest request,HttpServletResponse httpServletResponse) {
		/*String id = request.getParameter("id");
		String name = request.getParameter("name");
		String pass = request.getParameter("pass");*/
		Uuser uuser = new Uuser();
		System.out.println(uu);
		//System.out.println(id);
		/*System.out.println("username"+username);
		System.out.println("password"+password);
		System.out.println("oldpa"+oldpa);*/
		Uuser u = new Uuser();
		//String oldpwd = passwordService.encryptPassword(oldpa);
		String newpwd = passwordService.encryptPassword(u.getPassword());
		uuser = userService.findFirst();
		/*u.setId(Long.parseLong(id));
		u.setUsername(name);*/
		System.out.println("u.toString():"+u.toString());
		/*if (!oldpwd.equals(newpwd)) {
			
			return new Message("password error");
		}*/
		u.setPassword(newpwd);
		userService.changePaa(u);
		try {
			httpServletResponse.sendRedirect("back/index");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return new Message("success");

	}
	
	@RequestMapping("/request_body/test2")
	@ResponseBody
    public  Message test2(@RequestBody Uuser u)throws Exception{
		user  = userService.findFirst();;//对比user
		String newpwd = passwordService.encryptPassword(u.getPassword());//网页的老密码
		u.setPassword(newpwd);
		System.out.println(newpwd);
		System.out.println("u = "+u);
		if (userService.changePaa(u)) {
			return new Message("修改成功");
		}
        return new Message("修改失败");
    }
	
	
	@RequestMapping("/aaa")
	public String aaa() {
		
		return "testaaa";
	}
}
