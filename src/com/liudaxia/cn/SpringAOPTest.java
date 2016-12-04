package com.liudaxia.cn;
import java.lang.reflect.Method;

import org.junit.Test;  
import org.springframework.context.ApplicationContext;  
import org.springframework.context.support.ClassPathXmlApplicationContext;  

  
public class SpringAOPTest {  
     
    
    @Test
    public void testAbstract(){
    	
    	 ApplicationContext ctx = new ClassPathXmlApplicationContext("beanAop.xml");
    	 Son son = (Son) ctx.getBean("son");
    	 son.run();
    }
  
}  