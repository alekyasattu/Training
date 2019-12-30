package ExceptionExamples;

import CollectionExamples.Employee;

public class ExceptionExample {

		private Employee employee;
	public static void main(String[] args) {
		ExceptionExample e = new ExceptionExample();
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
	public void execute() {
		
			//Throwable e = new NullPointerException();
			RuntimeException e = new IncorrectException("id cannot be negtive");
			throw e;
		//System.out.println("after exception handling"); //unreacheble code!!!!!!
		
}
}
