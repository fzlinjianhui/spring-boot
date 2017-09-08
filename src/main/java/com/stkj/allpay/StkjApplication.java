package com.stkj.allpay;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class StkjApplication {

	public static void main(String[] args) {
		SpringApplication.run(StkjApplication.class, args);
	}
}
