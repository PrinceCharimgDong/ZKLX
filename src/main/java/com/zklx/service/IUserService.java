/**  

* <p>Title: IUserService.java</p>  

* <p>Description: </p>  

* <p>Copyright: Copyright (c) 2017</p>  

* <p>Company: 中科立信</p>  

* @author 王冬冬

* @date 2018年8月10日  上午10:37:06

* @version 1.0  

*/  
package com.zklx.service;

import java.util.List;
import java.util.Set;

import com.zklx.domain.Uuser;

/**  

* <p>Title: IUserService.java</p>  

* <p>Description: </p>  

* <p>Copyright: Copyright (c) 2017</p>  

* <p>Company: 中科立信</p>  

* @author 王冬冬

* @date 2018年8月10日  上午10:37:06

* @version 1.0  

*/
public interface IUserService {

	/**
	 * 创建用户
	 * 
	 * @param user
	 */
	public Uuser createUser(Uuser user);

	/**
	 * 修改密码
	 * 
	 * @param userId
	 * @param newPassword
	 */
	public void changePassword(int userId, String newPassword);

	/**
	 * 添加用户-角色关系
	 * 
	 * @param userId
	 * @param roleIds
	 */
	public void correlationRoles(int userId, int... roleIds);

	/**
	 * 移除用户-角色关系
	 * 
	 * @param userId
	 * @param roleIds
	 */
	public void uncorrelationRoles(int userId, int... roleIds);

	/**
	 * 根据用户名查找用户
	 * 
	 * @param username
	 * @return
	 */
	public Uuser findByUsername(String username);

	public Set<String> findRoles(String username);

	/**
	 * 根据用户名查找其权限
	 * 
	 * @param username
	 * @return
	 */
	public Set<String> findPermissions(String username);

	public List<Uuser> getallusers();


	public void deleteuser(int userid);

	public Uuser getUser(int userid);

	public void deleteuserroles(int userid);
	
	public boolean changePaa(Uuser uuser);
	
	public Uuser findFirst();
}
