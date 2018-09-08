package com.zklx.service.imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zklx.dao.ZkUserMapper;
import com.zklx.domain.ZkUser;
import com.zklx.service.UserService;
@Service("qqqquserService")
public class qqqUserServiceImp implements UserService{

	@Autowired
	private ZkUserMapper ZkUserMapper;
	public ZkUser loginU(String name,String password) {
		return	ZkUserMapper.findUserByNameAndPwd(name, password);
	}

}
