package oops.Inheritance;

public class SuperDemo {

	public static void main(String[] args) {
		
		Employee e1 = new Employee(101, "surya", 'm');
		
		RegularEmployee r1 = new RegularEmployee(102, "sreeja" , 'f', 10000, 1000);
	
		ContractEmployee c1 = new ContractEmployee(103, "tiger", 'm', 45, 3);
		
		System.out.println(e1);
		System.out.println(r1);
		System.out.println(c1);
		}

}
