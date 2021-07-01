package exercise10_13;

public class CEO extends Employee {

	public CEO(String firstnameInput, String lastnameInput, int salaryInput) {
		super(firstnameInput, lastnameInput, salaryInput);
	}
	
	@Override
	public int getSalary() {
		return super.getSalary() * 2;
	}
	
	public void hello() {
		System.out.println("Hi, nice to meet you. "+this.firstname+"!"); 
	}
   
	public void fire(Employee employee) {
         System.out.println(employee.firstname + " has been fired!");
    }

	public static void main(String[] args) {
		// Exercise 12
		Employee dang = new Employee("Dang","Red", 10000); 
		CEO ceo = new CEO("Somchai","Sudlor", 30000); 
		Programmer dam = new Programmer("Dam", "Black", 10000);
		
		System.out.println(dang.getSalary());
		System.out.println(ceo.getSalary());
		System.out.println(dam.getSalary());
		
		Employee somebody = new Employee();
		System.out.println("Employe : " + somebody.firstname + " " 
				+somebody.lastname + " salary " + somebody.getSalary());
		
		Employee somebody2 = new Programmer("some", "body");
		System.out.println("Employe : " + somebody2.firstname + " " 
				+somebody2.lastname + " salary " + somebody2.getSalary());
	}

}
