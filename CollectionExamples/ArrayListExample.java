package CollectionExamples;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListExample {
	
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		
		Object o = list.get(0);
		int firstElement=(int)o;
		System.out.println("first element:"+firstElement);
		ArrayListExample a = new ArrayListExample();
		a.print(list);
		list.remove(1);
		System.out.println(list.toString());
		Object obj = 1; //1 ->refers to the value 1;
		list.remove(obj);
		System.out.println(list.toString());

	}
	
	public void print(List<Integer> list) {
		for(Integer i:list) {
			System.out.println(i);
		}
	}
	

}
