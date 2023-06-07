package fc.springconfigannotation.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Engine {
	
	@Value("V12")
	private String formation;
	
	@Value("Fuel")
	private String fuelType;
	
	@Value("6498.8")
	private Double cc;

	@Override
	public String toString() {
		return "Engine [formation=" + formation + ", fuelType=" + fuelType + ", cc=" + cc + "]";
	}

	
}
