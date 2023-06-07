package fc.springconfigjava.bean;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

public class Team  implements InitializingBean,DisposableBean{

	//@Value("Mercedes")
	private String teamName;
	
	//@Value("Black")
	private String vehicleColour;
	
	@Autowired
	private Driver driver;

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public String getVehicleColour() {
		return vehicleColour;
	}

	public void setVehicleColour(String vehicleColour) {
		this.vehicleColour = vehicleColour;
	}

	public Driver getDriver() {
		return driver;
	}

	public void setDriver(Driver driver) {
		this.driver = driver;
	}



	@Override
	public String toString() {
		return "Team [teamName=" + teamName + ", vehicleColour=" + vehicleColour + ", driver=" + driver + "]";
	}

	public Team(String teamName, String vehicleColour) {
		super();
		this.teamName = teamName;
		this.vehicleColour = vehicleColour;
		
	}

	public void destroy() throws Exception {
System.out.println("FROM TEAM DESTROY");		
	}

	public void afterPropertiesSet() throws Exception {
		System.out.println("FROM TEAM AFTER PROPERTIES");		
	}
	
	
	
	
}
