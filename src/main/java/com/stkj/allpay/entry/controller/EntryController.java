package com.stkj.allpay.entry.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * 
 * @author 大辉辉
 * @time 2017年9月5日 上午11:35:51
 * @company 商田科技
 */
@Controller
@RequestMapping("/entry/*")
public class EntryController {
	
	/**
	 * 首页
	 * @author 大辉辉
	 * @time 2017年9月5日 上午11:37:24
	 * @company 商田科技
	 */
	@GetMapping("index.html")
	public ModelAndView index(){
		
		ModelAndView mav= new ModelAndView("index/index");
		mav.addObject("name", "大灰灰");
		return mav;
	}
}












