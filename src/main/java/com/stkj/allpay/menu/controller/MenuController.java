package com.stkj.allpay.menu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.stkj.allpay.menu.entity.Menu;
import com.stkj.allpay.menu.repository.MenuRespository;

@RestController
@RequestMapping("/menu/*")
public class MenuController {

	@Autowired
	private MenuRespository meunRespository;
	
	@GetMapping("getAllMenu")
	public List<Menu> findAllMenu(){
		List<Menu> menus = meunRespository.findAll();
		return menus;
	}
}
















