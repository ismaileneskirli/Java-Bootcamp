
public class Gamer {
	private int id;
	private String tc;
	private String name;
	private String lastName;
	private String birthday;
	private double budget;
	private double winRate;
	


	public Gamer() {
		
	}
	
	public Gamer(int id, String tc, String name, String lastName, String birthday, double budget, double winRate) {
		super();
		this.id = id;
		this.tc = tc;
		this.name = name;
		this.lastName = lastName;
		this.birthday = birthday;
		this.budget = budget;
		this.winRate = winRate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTc() {
		return tc;
	}

	public void setTc(String tc) {
		this.tc = tc;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public double getBudget() {
		return budget;
	}

	public void setBudget(double budget) {
		this.budget = budget;
	}
	
	public double getWinRate() {
		return winRate;
	}

	public void setWinRate(double winRate) {
		this.winRate = winRate;
	}
	

}
