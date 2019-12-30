package ExceptionExamples;

import CollectionExamples.Employee;

public class ThrowsExample {

		private Employee employee;
	public static void main(String[] args) {
		ThrowsExample e = new ThrowsExample();
		try {
		e.execute();
		}catch(IncorrectException exception) {
			System.out.println("id was incorrect");
		}
		catch(Exception exp) {
			System.out.println("somehing went wrong");
		}
		
		finally {
			System.out.println("i always get executed");
		}
		System.out.println("after execute in main");
	}
	public void execute() throws Exception{
		
			Exception e = new Exception("id cannot be negtive");
			throw e;
		
}
}
