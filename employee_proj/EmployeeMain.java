package Deloitte;

import java.util.HashMap;
import java.util.*;

public class EmployeeMain {

	public static void main(String[] args) {
	
		EmployeeMain m = new EmployeeMain();
		m.execute();
		
	}
	Map<Integer,Employee> store = new HashMap<>();
	
	public void execute() {
		Employee e2 = new Employee(102, "sam", 500.0);
		Employee e3 = new Employee(103, "john", 500.0);
		Employee e1 = new Employee(102, "alekya", 1500.0);
		Manager e = new Manager(112,"Sammy");	
		
		store.put(1,e1);
		store.put(2,e2);
		store.put(3, e3);
		store.put(4,e);
			
		e.addmanagedEmployees(e1);
		e.addmanagedEmployees(e2);
		e1.addSalary(1000);
		
		print();
		
		Employee fetched = findById(2);
		
	}
	
	public Employee findById(int id) {
	
		Employee e = store.get(id);
		return e;
	}
	
	void print() {
		Set<Integer> keys=store.keySet();
		
		//System.out.println("Employees are:");
		for(int id:keys) {
			Employee e = store.get(id);
			
			System.out.println(e.getId()+" "+e.getName() + " " + e.getBalance());
			
			boolean isManager = e instanceof Manager;
			if(isManager) {
				Manager m = (Manager)e;
				System.out.println("Managed Employees:: by " +m.getName());

				Employee[] managedEmployees = m.getManagedEmployees();
				for(Employee managed:managedEmployees) {
					if(managed!=null) {
						System.out.println(managed.getName()+" "+managed.getBalance());
					}
				}
			}
		}
	}
		
	
	

}
