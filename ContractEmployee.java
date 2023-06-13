package oops.Inheritance;

public class ContractEmployee extends Employee {

	private int hourlyPrice;
	private int duration;
	
	
	public ContractEmployee(int id, String name, char gender, int hourlyPrice, int duration) {
		super(id, name, gender);
		this.hourlyPrice = hourlyPrice;
		this.duration = duration;
	}
	
	public ContractEmployee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public ContractEmployee(int id, String name, char gender) {
		super(id, name, gender);
		// TODO Auto-generated constructor stub
	}
	public int getHourlyPrice() {
		return hourlyPrice;
	}
	public void setHourlyPrice(int hourlyPrice) {
		this.hourlyPrice = hourlyPrice;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}

	@Override
	public String toString() {
		return "ContractEmployee ["+super.toString()+", hourlyPrice=" + hourlyPrice + ", duration=" + duration + "]";
	}
	
	
}
