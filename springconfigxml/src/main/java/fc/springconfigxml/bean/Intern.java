package fc.springconfigxml.bean;

public class Intern {
	
	private String internName;
	
	private String designation;
	
	private String team;

	public String getInternName() {
		return internName;
	}

	public void setInternName(String internName) {
		this.internName = internName;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	@Override
	public String toString() {
		return "Intern [internName=" + internName + ", designation=" + designation + ", team=" + team + "]";
	}

	public Intern(String internName, String designation, String team) {
		super();
		this.internName = internName;
		this.designation = designation;
		this.team = team;
	}
	
	

}
