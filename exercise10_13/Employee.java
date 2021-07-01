package exercise10_13;
public class Employee { 
	public String firstname; 
	public String lastname; 
	private int salary;
	private String position;
	
	public Employee () {
		this("Anonymous", "Anonymous", 9000);
	}
	
	public Employee (String firstnameInput, String lastnameInput) { 
		this(firstnameInput, lastnameInput, 9000);	}

	
	public Employee(String firstnameInput, String lastnameInput, int salaryInput) { 
		firstname = firstnameInput;
		lastname = lastnameInput; 
		salary = salaryInput;
	}
	
	public Employee(String firstnameInput, String lastnameInput, int salaryInput, String positionInput) { 
		firstname = firstnameInput;
		lastname = lastnameInput; 
		salary = salaryInput;
		position = positionInput;
	}
	
	public void hello() {
		System.out.println("Hello " + firstname ); 
	}
	
	public int getSalary() {
		return salary; 
	}
	
	public void checkPostion() {
		System.out.println("Position : " + this.position);
	}
	
	public static void main(String[] args) {
		Employee dang = new Employee("Dang","Red", 10000); 
		Employee marvel = new Employee("Captain","Marvel", 20000); 
		
		// Exercise 10.3
		Employee[] employees = new Employee[2];
		employees[0] = dang;
		employees[1] = marvel;
		
		for(Employee e : employees) {
			System.out.println("Employee name:" + e.firstname + " " 
						+ e.lastname + " Salary: " + e.getSalary());
		}
		
		//Exercise 13.2
		Employee joe = new Employee("Joe","woradet", 20000, "programer"); 
		System.out.println("Employee name:" + joe.firstname + " " 
				+ joe.lastname + " Salary: " + joe.getSalary());
		joe.checkPostion();
	}
}
