package com.stkj.allpay.role.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/role/*")
public class RoleController {

	/**
	 * 添加一个角色
	 * 
	 * @author 大辉辉
	 * @time 2017年9月6日 下午2:22:49
	 * @company 商田科技
	 */
	@PostMapping("addRole")
	public void addRole(
			@RequestParam(required = true) String roleName,
			@RequestParam(required = true) Integer operatorId) {

		
	}
}
