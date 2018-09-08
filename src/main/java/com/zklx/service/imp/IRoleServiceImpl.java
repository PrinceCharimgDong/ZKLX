package com.zklx.service.imp;

import java.util.List;
import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.zklx.dao.RroleMapper;
import com.zklx.domain.Rrole;
import com.zklx.service.IRoleService;

@Service
/*@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.DEFAULT, timeout = 5)*/
public class IRoleServiceImpl implements IRoleService {

	@Autowired
	private RroleMapper rolemapper;

	public Rrole createRole(Rrole role) {
		rolemapper.addRole(role);
		return role;
	}

	public void deleteRole(int roleId) {
		rolemapper.deleterole(roleId);
	}

	public void correlationPermissions(int roleId, int... permissionIds) {
		for (int pid : permissionIds) {
			rolemapper.addRolePermission(roleId, pid);
		}

	}

	public void uncorrelationPermissions(int roleId, int... permissionIds) {
		for (int pid : permissionIds) {
			rolemapper.deleterole_permission(roleId, pid);
		}
	}

	public List<Rrole> getroles() {
		return rolemapper.getRoles();
	}

	public void deleteroles(int roleid) {
		rolemapper.deleteroles(roleid);
	}

	public Rrole getrolebyid(int roleid) {
		return rolemapper.getRolebyid(roleid);
	}

	public Rrole updateRole(Rrole r) {
		rolemapper.updateRole(r);
		return r;
	}

}
