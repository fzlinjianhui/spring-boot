package com.stkj.allpay.menu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.stkj.allpay.cmment.annotation.WebLog;
import com.stkj.allpay.cmment.result.ResultBean;
import com.stkj.allpay.menu.entity.Menu;
import com.stkj.allpay.menu.service.MenuService;

@RestController
@RequestMapping("/menu/*")
public class MenuController {

	@Autowired
	private MenuService menuService;

	/**
	 * 获取所有菜单
	 * @author 大辉辉
	 * @time 2017年9月6日 下午1:43:34
	 * @company 商田科技
	 * @return
	 */
	@GetMapping("getAllMenu")
	@WebLog
	public ResultBean<List<Menu>> findAllMenu() {
		List<Menu> menus = menuService.getAllMenu();

		return new ResultBean<List<Menu>>(menus);
	}
}
