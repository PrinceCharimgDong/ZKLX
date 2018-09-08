/**  

* <p>Title: UserServiceImpl.java</p>  

* <p>Description: </p>  

* <p>Copyright: Copyright (c) 2017</p>  

* <p>Company: 中科立信</p>  

* @author 王冬冬

* @date 2018年8月10日  上午10:38:41

* @version 1.0  

*/  
package com.zklx.service.imp;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zklx.dao.RroleMapper;
import com.zklx.dao.UuserMapper;
import com.zklx.domain.MappingRp;
import com.zklx.domain.MappingUr;
import com.zklx.domain.Rrole;
import com.zklx.domain.Uuser;
import com.zklx.service.IUserService;

/**  

* <p>Title: UserServiceImpl.java</p>  

* <p>Description: </p>  

* <p>Copyright: Copyright (c) 2017</p>  

* <p>Company: 中科立信</p>  

* @author 王冬冬

* @date 2018年8月10日  上午10:38:41

* @version 1.0  

*/
@Service("iuserService")
public class IUserServiceImpl implements IUserService{

	@Autowired
	private UuserMapper usermapper;
	@Autowired
	private RroleMapper rolemapper;

	public Uuser createUser(Uuser user) {
		usermapper.adduser(user);
		return user;
	}

	public void changePassword(int userId, String newPassword) {
		Uuser u = usermapper.getUserByid(userId);
		u.setPassword(newPassword);
		usermapper.updateuser(u);
	}

	public void correlationRoles(int userId, int... roleIds) {
		for (int roleid : roleIds) {
			usermapper.adduserrole(userId, roleid);
		}
	}

	public void uncorrelationRoles(int userId, int... roleIds) {
		for (int roleid : roleIds) {
			usermapper.deleteuserrole(userId, roleid);
		}
	}

	public Uuser findByUsername(String username) {
		;
		return usermapper.getUserByusername(username);
	}

	public Set<String> findRoles(String username) {
		Set<String> roles = new HashSet<String>();
		Uuser u = usermapper.getUserByusername(username);
		List<MappingUr> user_roles = u.getMapping_UR();
		for (MappingUr ur : user_roles) {
			Rrole r = ur.getRole();
			roles.add(r.getName());
		}
		return roles;
	}

	public Set<String> findPermissions(String username) {
		Set<String> permissions = new HashSet<String>();
		Uuser u = usermapper.getUserByusername(username);
		if (u != null) {
			List<MappingUr> user_roles = u.getMapping_UR();
			if (user_roles.size() != 0)
				for (MappingUr ur : user_roles) {
					Rrole role = rolemapper.getRolebyid((ur.getRole().getId()).intValue());
					if (role != null) {
						List<MappingRp> rps = role.getMapping_RP();
						if (rps.size() != 0)
							for (MappingRp rp : rps) {
								String permission = rp.getPermission().getPname();
								permissions.add(permission);
							}
					}  
				}
		}
		return permissions;
	}

	public List<Uuser> getallusers() {
		return usermapper.getusers();
	}

	public Uuser updateuser(Uuser u) {
		usermapper.updateuser(u);
		return u;
	}

	public void deleteuser(int userid) {
		usermapper.deleteuser(userid);
	}

	public Uuser getUser(int uid) {
		Uuser u = usermapper.getUserByid(uid);
		return u;
	}

	public void deleteuserroles(int uid) {
		usermapper.deleteuseroles(uid);
	}

	@Override
	public boolean changePaa(Uuser uuser) {
		return usermapper.updateByPrimaryKeySelective(uuser)==1;
		
	}

	@Override
	public Uuser findFirst() {
		Uuser uuser = usermapper.findFirst();
		return uuser;
	}

}
