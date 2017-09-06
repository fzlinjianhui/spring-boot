package com.stkj.allpay.menu.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Menu {

	@Id
	@GeneratedValue
	private Long id;
	
	private String name;
	
	private String url;
	
	private String preId;
	
	private String prop;
}
