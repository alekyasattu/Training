package Deloitte;

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
	

}
