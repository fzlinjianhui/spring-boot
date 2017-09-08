package com.stkj.allpay.menu.repository;

import java.util.List;

import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.stkj.allpay.menu.entity.Menu;
import java.lang.Integer;

@CacheConfig(cacheNames="menus")
public interface MenuRespository extends JpaRepository<Menu, Integer>{

	@Cacheable
	List<Menu> findByName(String name);
	
	@Cacheable
	List<Menu> findById(Integer id);
	
	@CachePut
	Menu save(Menu m);
	
}
