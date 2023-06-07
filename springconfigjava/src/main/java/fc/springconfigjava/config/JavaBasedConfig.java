package fc.springconfigjava.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import fc.springconfigjava.bean.Driver;
import fc.springconfigjava.bean.Team;

@Configuration
public class JavaBasedConfig {
	
	
	@Bean
 public Team getTeam () {
	 return new Team ("Mercedes","Black");
 }
	@Bean("DRI")
	public Driver getDriver () {
		return new Driver ("Lewis Hamilton","Brazil",30);
	}

}
