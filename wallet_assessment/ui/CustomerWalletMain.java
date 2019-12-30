package wallet.ui;
import java.util.*;


import wallet.entity.CustomerWallet;

public class CustomerWalletMain {

	public static void main(String[] args) {
		
		CustomerWalletMain m = new CustomerWalletMain();
		m.execute();

	}
	
	private Map<String,CustomerWallet> store = new HashMap<>();
	
	public void execute() {
		
		CustomerWallet c1 = new CustomerWallet("8500778474", "alekya", 3000.0);
		CustomerWallet c2 =new CustomerWallet("9494949885", "joe", 1000.0);
		CustomerWallet c3 = new CustomerWallet("9494342713", "sam", 2000.0);
		CustomerWallet c4 = new CustomerWallet("1234567890", "john", 500.0);
		
		store.put(c1.getMobileNo(), c1);
		store.put(c2.getMobileNo(),c2);
		store.put(c3.getMobileNo(),c3);
		store.put(c4.getMobileNo(),c4);
		
		c1.transferMoney(c2, 500.0);
		//store.get(c1).transferMoney(c4, 500.0);
		
		print();
		
		CustomerWallet fetched = findByMobileNo(c1.getMobileNo());
		System.out.println();
		System.out.println("Fetched details :" +fetched.getName() +" "+fetched.getBalance());
		
		
	}
	
	public CustomerWallet findByMobileNo(String mobileNo) {
		
		CustomerWallet c = store.get(mobileNo);
		
		return c;
		
		
	}
	
	public void print() {
		
		Set<String> keys = store.keySet();
		
		System.out.println("Details are :");
		System.out.println();
		for(String mobileNo : keys) {
			
			CustomerWallet c = store.get(mobileNo);
			System.out.println("Name:"+c.getName()+",   Mobile no:"+c.getMobileNo()+",   balance: "+c.getBalance());
		}
		
		
	}
	
	
	

}
