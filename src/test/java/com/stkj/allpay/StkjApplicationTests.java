package com.stkj.allpay;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.stkj.allpay.menu.entity.Menu;
import com.stkj.allpay.menu.repository.MenuRespository;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class StkjApplicationTests {

	@Autowired
	private StringRedisTemplate srt;
	@Autowired
	private MenuRespository menuRespository;
	
	@Test
	public void contextLoads() {
	}
	
	@Test
	public void redisTest(){
		
		//保存字符串
		srt.opsForValue().set("test", "林剑辉");
		String test = srt.opsForValue().get("test");
		System.out.println(test);
		Assert.assertEquals("林剑辉", srt.opsForValue().get("test"));
	}

	@Test
	public void redisCacheTest(){
		
		Menu m_1 = menuRespository.findByName("菜单设置");
		System.out.println("第一次查询："+m_1.getId());
		
		Menu m_2 = menuRespository.findByName("菜单设置");
		System.out.println("第二次查询："+m_2.getId());
	}
	
}













