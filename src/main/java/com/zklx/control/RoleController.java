package com.zklx.control;

import java.util.List;

import org.apache.shiro.authz.annotation.RequiresRoles;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zklx.domain.MappingRp;
import com.zklx.domain.Rrole;
import com.zklx.service.IRoleService;

import util.Message;

@Controller
public class RoleController {

	@Autowired
	private IRoleService roleService;

	@RequiresRoles("admin")
	@RequestMapping(value = "/allRoles", method = RequestMethod.GET)
	@ResponseBody
	public List<Rrole> getallRoles() {
		List<Rrole> list = roleService.getroles();
		return list;
	}

	@RequiresRoles("admin")
	@RequestMapping(value = "/addRole", method = RequestMethod.POST)
	@ResponseBody
	public Rrole addRole(@RequestBody Rrole r) {
		Rrole role = roleService.createRole(r);
		Long roleid = role.getId();
		List<MappingRp> list = r.getMapping_RP();
		if (list != null && list.size() != 0) {
			for (MappingRp rp : list) {
				Long pid = rp.getPermission().getId();
				roleService.correlationPermissions(roleid.intValue(), pid.intValue());
			}
		}

		return role;
	}

	@RequiresRoles("admin")
	@RequestMapping(value = "/deleteRole/{roleid}", method = RequestMethod.DELETE)
	@ResponseBody
	public Message deleteRole(@PathVariable int roleid) {
		roleService.deleteroles(roleid);
		roleService.deleteRole(roleid);
		return new Message("success");
	}

	@RequestMapping(value = "/getRole", method = RequestMethod.GET)
	@ResponseBody
	public Rrole getRole(@RequestBody int roleid) {
		Rrole r = roleService.getrolebyid(roleid);
		return r;
	}

	@RequiresRoles("admin")
	@RequestMapping(value = "/updateRole/{roleid}", method = RequestMethod.PUT)
	@ResponseBody
	public Rrole updateRole(@PathVariable int roleid, @RequestBody Rrole r) {
		roleService.updateRole(r);
		if (r.getMapping_RP().size() != 0 && r.getMapping_RP() != null) {
			roleService.deleteroles(roleid);
			List<MappingRp> list = r.getMapping_RP();
			for (MappingRp rp : list) {
				Long pid = rp.getPermission().getId();
				roleService.correlationPermissions(roleid, pid.intValue());
			}
		}

		return r;
	}

}
