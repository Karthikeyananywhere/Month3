package fc.springconfigjava.bean;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;

public class Driver  implements InitializingBean,DisposableBean{
	
	//@Value("Lewis Hamilton")
	private String driverName;
	
	//@Value("Brazil")
	private String country;
	
	//@Value("30")
	private Integer age;
	
	public String getDriverName() {
		return driverName;
	}
	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Driver [driverName=" + driverName + ", country=" + country + ", age=" + age + "]";
	}
	public Driver(String driverName, String country, Integer age) {
		super();
		this.driverName = driverName;
		this.country = country;
		this.age = age;
	}
	public void destroy() throws Exception {
		System.out.println("FROM DRIVER DESTROY METHOD");		
	}
	public void afterPropertiesSet() throws Exception {
		System.out.println("FROM DRIVER  AFTERPROPERTIES SET");		
	}
	
	

}
