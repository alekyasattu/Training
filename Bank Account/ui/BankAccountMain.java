package Bank.ui;

import Bank.entity.BankAccount;

public class BankAccountMain {

	public static void main(String[] args) {

		BankAccount[] store = new BankAccount[4];
		store[0] = new BankAccount(101, "Joe", 1000.0);
		store[1] = new BankAccount(102, "Sam", 2000.0);
		store[2] = new BankAccount(103, "Riya", 3000.0);

		store[0].addBalance(500.0);
		store[1].tranferAmount(store[2], 1000.0);
		store[2].tranferAmount(store[0], 2000.0);

		BankAccountMain b = new BankAccountMain();
		b.print(store);
	}

	public void print(BankAccount[] store) {
		for (BankAccount b : store) {
			if (b != null)
				System.out.println("Id: " + b.getId() + " ,Name: " + b.getName() + " ,balance: " + b.getBalance());
			System.out.println();
		}
	}

}
