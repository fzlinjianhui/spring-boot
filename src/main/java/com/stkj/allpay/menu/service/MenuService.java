package com.stkj.allpay.menu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stkj.allpay.menu.entity.Menu;
import com.stkj.allpay.menu.repository.MenuRespository;

@Service
public class MenuService {

	@Autowired
	private MenuRespository menuRespository;
	
	public List<Menu> getAllMenu(){
		
		return menuRespository.findAll();
		
	}
	
	public Menu findMenuById(Integer id){
		return menuRespository.findOne(id);
	}
	
	public Menu saveMenu(Menu m){
		return menuRespository.save(m);
	}
	
	public List<Menu> getMenuByName(String name){
		return menuRespository.findByName(name);
	}
	
	public Menu updateMenu(Menu m){
		return menuRespository.save(m);
	}
}
