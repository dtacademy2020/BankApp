package bankApp;

public class Savings extends Account implements BaseInterestRate{

	int safetyDepositBoxID;
	int safetyDepositBoxPin;
	
	public Savings(String name, String ssn, double accountBalance) {
		super(name, ssn, accountBalance);// i did not write that
		accountNumber = "2"+ accountNumber;
		accountInterestRate = getInterestRate();
		
		safetyDepositBoxID = 100 + (int)(Math.random()*100);
		safetyDepositBoxPin = 1000 + (int) (Math.random()*1000);
	}

	public void setInterestRate() {
		accountInterestRate = getBaseRate() - 0.25;
		
	}
	
	public  double getInterestRate() {
		return accountInterestRate;
	}

//public static void main(String[] args) {
//		Savings a = new Savings("iu","123",555);
//		//a.withdraw(10006);
//		
	//}
	
public void showInfo() {
	super.showInfo();
	System.out.println("Account Number: "+accountNumber +"\n"+ "Account Interest Rate: "+ accountInterestRate+"%");
	System.out.println("Safty Deposit Box : "+ safetyDepositBoxID);
	System.out.println("Pin: "+ safetyDepositBoxPin+ "\n*********** ");}
	


}
