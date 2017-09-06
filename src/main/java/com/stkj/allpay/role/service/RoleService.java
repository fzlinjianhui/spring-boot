package com.stkj.allpay.role.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stkj.allpay.role.entity.Role;
import com.stkj.allpay.role.repository.RoleRepository;

@Service
public class RoleService {

	@Autowired
	private RoleRepository roleRopository;
	
	/**
	 * 保存一个角色
	 * @author 大辉辉
	 * @time 2017年9月6日 下午2:13:38
	 * @company 商田科技
	 * @param role
	 */
	public Role saveRole(Role role){
		Role r = roleRopository.save(role);
		return r;
	}
}
