package oops.Inheritance;

public class InheritanceClient {
	
	public static void main(String[] args) {
		
		Employee e = new Employee();
		e.setId(101);
		e.setGender('m');
		e.setName("surya");
		System.out.println(e.getId() + " " + e.getGender() + " " + e.getName());
		
	
		RegularEmployee r = new RegularEmployee();
		r.setBonus(20);
		r.setSalary(1000);
		r.setId(1);
		r.setName("harika");
		r.setGender('f');
		System.out.println(r.getBonus() + " " + r.getSalary());
		System.out.println(r); //since there is no toString method we dont get output in single line.
		System.out.println(r.getBonus() + " " + r.getSalary() + " " +r.getId() + " " +r.getName() + " "+r.getGender());
		
		
		ContractEmployee c = new ContractEmployee();
		c.setHourlyPrice(30);
		c.setDuration(15);
		System.out.println(c.getHourlyPrice() + " " + c.getDuration());
		
		
	}

}
