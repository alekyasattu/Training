package CollectionExamples;

public class Employee {
	
	private int id;
	private String name;
	private double balance;
	
	
	public Employee(int id, String name, double balance) {
		this.id = id;
		this.name = name;
		this.balance = balance;
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public void addSalary(double salary) {
		balance = balance+salary;
		}



	public Employee(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	 public Employee[] getManagedEmployees() {
		 return null;
	 }



	@Override
	public String toString() {
		String display = id+" "+name;
		return display;
		//return "Employee [id=" + id + ", name=" + name + ", balance=" + balance + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		//Employee e1 = new Employee(10);
		//Employee e2 = e1;
		//boolean result = e1.equals(e2);
		if(obj==this)
			return true;
		
		//Employee e1 = new Employee(10);
		//Employee e2 = null;
		//boolean result = e1.equals(e2);
		
		//Employee e1 = new Employee(10);
		//String e2="10";
		//boolean result = e1.equals(e2);
		if(obj==null|| !(obj instanceof Employee))
			return false;
		
		//Employee e1 = new Employee(10);
		//Employee e2 = new Employee(10);
		//boolean result = e1.equals(e2);
		Employee e = (Employee)obj;
		return e.id == this.id;
		
			
	}
	
	@Override
	public int hashCode() {
		return this.id;
	}
}
