package fc.springconfigxml.main;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import fc.springconfigxml.bean.FullCreative;

public class Main {
	
	public static void main(String[] args) {
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("beanconfig.xml");
		
		context.registerShutdownHook();
		
		FullCreative bean = (FullCreative) context.getBean("company");
		
		System.out.println(bean);
	}

}
