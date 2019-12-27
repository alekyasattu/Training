package Deloitte;

public class EmployeeMain {

	public static void main(String[] args) {
		
		Employee e2 = new Employee(102, "sam", 500.0);
		Employee e3 = new Employee(103, "john", 500.0);
		
		Employee store[] = new Employee[4];
		
		store[0]=new Employee(101, "Joe", 1000.0);
		store[1]=e2;
		store[2]=e3;
		store[0].addSalary(1000.0);
		store[1].addSalary(500.0);
		store[2].addSalary(1200.0);
		
		Manager e = new Manager(112,"Sammy");		
			e.addmanagedEmployees(store[0]);
		e.addmanagedEmployees(store[1]);
		store[3]=e;
		
		Employee[] me = new Employee[10];
		me=e.getManagedEmployees();
		System.out.println("managed employees are :");
		for(int i=0;i<me.length;i++) {
			System.out.println("Id:"+me[i].getId()+" Name:"+me[i].getName()+" Balance:"+me[i].getBalance());
			
		}
		System.out.println("all employees are :");

		EmployeeMain m = new EmployeeMain();
		m.print(store);
		
	}
	
    void print(Employee[] emp) {
		for(int i=0;i<4;i++) {
			System.out.println("Id:"+emp[i].getId()+" Name:"+emp[i].getName()+" Balance:"+emp[i].getBalance());
		}
	}

}
