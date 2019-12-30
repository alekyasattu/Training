package CollectionExamples;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapExample {
	
	public static void main(String[] args) {
		Map<Integer,Employee> map = new TreeMap<>(new EmployeeKeyComparator());
		
		Employee e1 = new Employee(1,"joe");
		Employee e2 = new Employee(2, "alekya");
		
		map.put(1, e1);
		map.put(2, e2);
		
		Employee fetched1 = map.get(1);
		Employee fetched2 = map.get(2);
		
		MapExample m = new MapExample();
		m.printByKeys(map);
		System.out.println("--------------");
		m.printByValues(map);
		System.out.println("--------------");
		m.printByEntries(map);
		//System.out.println(fetched1);
	}
	
	public void printByValues(Map<Integer,Employee> map) {
		Collection<Employee> values=map.values();
		for(Employee e:values) {
			System.out.println(e.getName());
		}
	}
	
	public void printByEntries(Map<Integer,Employee> map) {
		Set<Map.Entry<Integer, Employee>> entries = map.entrySet();
		for(Map.Entry<Integer, Employee> entry: entries) {
			int key = entry.getKey();
			Employee value = entry.getValue();
			System.out.println(key);
			System.out.println(value.getName());
		}
	}
	
	public void printByKeys(Map<Integer, Employee> map) {
		Set<Integer> keys = map.keySet();
		for(int key:keys) {
			Employee value = map.get(key);
			System.out.println(value.getName());
		}
		
	}
}
