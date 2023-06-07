package fc.springconfigxml.bean;

public class FullCreative {
	
	private String location;
	
	private String city;
	
	private Intern intern;

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Intern getIntern() {
		return intern;
	}

	public void setIntern(Intern intern) {
		this.intern = intern;
	}

	@Override
	public String toString() {
		return "FullCreative [location=" + location + ", city=" + city + ", intern=" + intern + "]";
	}

	public FullCreative(String location, String city,Intern intern) {
		super();
		this.location = location;
		this.city = city;
		this.intern = intern;
	}
	
	public void display() {
		
		System.out.println("From FC Display Method");
		
	}
	
	public void close () {
		System.out.println("From FC Close");
	}

}
