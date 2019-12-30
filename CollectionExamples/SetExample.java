package CollectionExamples;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {
	
	public static void main(String[] args) {
		
		Employee e1 = new Employee(1,"joe");
		Employee e2 = new Employee(2, "alekya");
		Employee e3 = new Employee(3, "sam");
		Employee e4 = new Employee(1, "alekya");
		
		EmployeeComparator comparator = new EmployeeComparator();
		Set<Employee> set = new TreeSet<Employee>(comparator);
		set.add(e1);
		set.add(e2);
		set.add(e3);
		set.add(e4);
		
		int size = set.size();
		System.out.println("size ="+size);
		System.out.println("set contains e2 :"+set.contains(e2));
		
		SetExample ex = new SetExample();
		ex.print(set);
		
		boolean removed = set.remove(e2);
		System.out.println("removed="+removed);
		ex.print(set);
		
		
	
	}
	
	public void print(Set<Employee> set) {
		for(Employee e:set) {
			System.out.println(e.getName());
		}
	}

}


/*boolean equals = e1.equals(e2);
boolean same = e1==e2;
System.out.println("e1 and e2 same::" +same);
System.out.println("e1 equals e2::" +equals);

System.out.println("e1 hashcode::"+e1.hashCode());
System.out.println("e2 hashcode::"+e2.hashCode());
*/
