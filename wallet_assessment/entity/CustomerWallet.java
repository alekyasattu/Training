package wallet.entity;

public class CustomerWallet {
	
	private String mobileNo;
	private String name;
	private double balance;
	
	
	public CustomerWallet(String mobileNo, String name, double balance) {
		
		this.mobileNo = mobileNo;
		this.name = name;
		this.balance = balance;
	}


	public String getMobileNo() {
		return mobileNo;
	}


	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
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
	
	public void transferMoney(CustomerWallet c,double amount) {
		
		if(this.balance>0 && this.balance>amount) {
		this.balance = this.balance-amount;
		c.balance=c.balance+amount;
		
		System.out.println(amount + " is transferred from " + this.name +"to"+ c.name);
		}
		else {
			System.out.println("money cant be transferred by"+this.getName()+"due to insufficient balance");
		}
		
	}
	
	

}
