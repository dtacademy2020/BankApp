package bankApp;

public abstract class Account implements BaseInterestRate{

	protected  String name;
	protected String ssn;
	protected double accountBalance;
	protected String accountNumber;
	protected double accountInterestRate;
	
	
	
	
	public Account(String name, String ssn, double accountBalance) {
		this.name = name;
		this.ssn= ssn;
		this.accountBalance = accountBalance;
		ssn= ssn.substring(ssn.length()-3);
		accountNumber = ssn + String.valueOf((int)(Math.random()*1000000)); // 6 ran digits
		
		
		
	}
	
	public  void deposit(double dollars) {
		accountBalance = accountBalance + dollars;
		}
	public  void withdraw(double dollars){
		if (accountBalance<dollars){
			throw new RuntimeException("Not Enough money on the account");}
		else accountBalance = accountBalance - dollars;
		
		
		//System.out.println(accountBalance);
	
	}
	
	
	public   void showInfo() {
		System.out.print("Name: "+name + "\n"+ "SSN: "+ ssn +"\n"+ "Account Balance: "+ accountBalance+" \n");
		
	}

	
}
