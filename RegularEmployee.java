package oops.Inheritance;

public class RegularEmployee extends Employee {

	private int salary;
	private int bonus;

	public RegularEmployee(int id, String name, char gender, int salary, int bonus) {
		super(id, name, gender);
		this.salary = salary;
		this.bonus = bonus;
	}

	public RegularEmployee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getBonus() {
		return bonus;
	}

	public void setBonus(int bonus) {
		this.bonus = bonus;
	}

	@Override
	public String toString() {
		return "RegularEmployee [" + super.toString() + ",  salary=" + salary + ", bonus=" + bonus + "]";
	}

}
