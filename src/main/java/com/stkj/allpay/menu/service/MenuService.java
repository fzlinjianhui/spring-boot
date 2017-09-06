package com.stkj.allpay.menu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stkj.allpay.menu.entity.Menu;
import com.stkj.allpay.menu.repository.MenuRespository;

@Service
public class MenuService {

	@Autowired
	private MenuRespository meunRespository;
	
	public List<Menu> getAllMenu(){
		
		return meunRespository.findAll();
		
	}
}
