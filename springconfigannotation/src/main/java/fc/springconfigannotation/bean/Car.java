package fc.springconfigannotation.bean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("carr")
public class Car {
	@Value("Lamborgini")
	private String companyName;
	
	@Value("Veneno")
	private String model;
	
	@Autowired
	private Engine engine;

	@Override
	public String toString() {
		return "Car [companyName=" + companyName + ", model=" + model + ", engine=" + engine + "]";
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("From Car Destroy");
	}

	@PostConstruct
	public  void init () {
		System.out.println("From Car Init");
	}
}
