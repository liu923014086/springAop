package com.liudaxia.cn;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

@Component
public class Son extends Father {

	public void run(){
		System.out.println("I can run");
	}
}
