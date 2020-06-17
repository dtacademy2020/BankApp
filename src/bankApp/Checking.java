package bankApp;

public class Checking extends Account implements BaseInterestRate {
	
	long debitCardNumber;
	 int debitCardPin;
	

	public Checking(String name, String ssn, double accountBalance) {
		super(name, ssn, accountBalance);
		accountNumber = "1"+ accountNumber;
		accountInterestRate = getInterestRate();
		
		debitCardNumber = 1000000000000000L + (long) (Math.random() * 1000000000000000L);
		debitCardPin = 1000 + (int)(Math.random()* 1000);
	
	}

	@Override
	public void setInterestRate() {
		accountInterestRate = getBaseRate()*0.15;
		
	}
	public double getInterestRate() {
		return accountInterestRate;
	}

	@Override
	public void showInfo() {
		super.showInfo();
		System.out.println("Account Number: "+ accountNumber +"\n"+"Account Intereste Rate: "+ accountInterestRate+"%");
		System.out.println("Debit Card Number : "+ debitCardNumber);
		System.out.println("Pin: "+ debitCardPin+ "\n*********** ");}
		

	
	
	
}
