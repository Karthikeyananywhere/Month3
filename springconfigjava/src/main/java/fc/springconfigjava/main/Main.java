package fc.springconfigjava.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import fc.springconfigjava.bean.Team;
import fc.springconfigjava.config.JavaBasedConfig;

public class Main {
	
	public static void main(String[] args) {
		AbstractApplicationContext context=new AnnotationConfigApplicationContext(JavaBasedConfig.class);
		
		 Team bean = (Team) context.getBean("getTeam");
		 
		 context.registerShutdownHook();
		 
		 System.out.println(bean);
	}

}
