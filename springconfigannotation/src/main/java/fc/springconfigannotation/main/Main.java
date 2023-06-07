package fc.springconfigannotation.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import annotationconfig.Sample;
import fc.springconfigannotation.annotationconfig.AnnotationConfig;
import fc.springconfigannotation.bean.Car;

public class Main {

	public static void main(String[] args) {
		AbstractApplicationContext context=new AnnotationConfigApplicationContext(AnnotationConfig.class);
		
		context.registerShutdownHook();
		
		Car bean = (Car) context.getBean("carr");
		
	   Sample bean2 = (Sample)context.getBean("sample");
		
		System.out.println(bean);
	}
}
