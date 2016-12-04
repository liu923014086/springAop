package com.liudaxia.cn;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/liu")
public class HelloController {

	@Autowired
	private Son son ;
	
	
	@RequestMapping(value="/hello.do")
	public String hello(){
	//	son.run();
		return "hello";
	}
}
