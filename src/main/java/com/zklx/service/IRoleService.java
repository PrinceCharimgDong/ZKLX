package com.zklx.service;

import java.util.List;

import com.zklx.domain.Rrole;

public interface IRoleService {

	public Rrole createRole(Rrole role);

	public void deleteRole(int roleId);

	/**
	 * 添加角色-权限之间关系
	 * 
	 * @param roleId
	 * @param permissionIds
	 */
	public void correlationPermissions(int roleId, int... permissionIds);

	/**
	 * 移除角色-权限之间关系
	 * 
	 * @param roleId
	 * @param permissionIds
	 */
	public void uncorrelationPermissions(int roleId, int... permissionIds);

	public List<Rrole> getroles();

	public void deleteroles(int roleid);// 删除该角色的所有权限关联

	public Rrole getrolebyid(int roleid);

	public Rrole updateRole(Rrole r);

}
