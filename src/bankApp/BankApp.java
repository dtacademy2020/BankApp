package bankApp;

import java.io.FileNotFoundException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BankApp {

	public static void main(String[] args)throws Exception {
		

		
			List<String[]> customers  = Utility.readFromAFile("customers.txt");  // take from here
			ArrayList<Account> list = new ArrayList<>(); // main list of all accounts - add here
			
			
				for (String [] a: customers) {
					System.out.println(Arrays.toString(a));
					String name = a[0];
					String ssn = a[1];
					String accType = a[2];
					double dollarAmount = Double.parseDouble(a[3]);
					
					if (accType.equals("Savings")) {
						
							
							Account num1 = new Savings(name,ssn,dollarAmount);
							num1.setInterestRate();
							list.add(num1);
							num1.deposit(555);
							num1.withdraw(555);
							num1.showInfo();
							
							
							
					}
					
					 else if (accType.equals("Checking")){
						 	Account num2 = new Checking(name,ssn,dollarAmount);
						 	num2.setInterestRate();
							list.add(num2);
								
							num2.deposit(9);
							num2.showInfo();
						
						
					}
					 else {
						 throw new Exception("Invalid type ");
						 
					 }
					
					
					
							
							
						
					}
					
				
				
				
				}
				
				
		
		
			
		
		
	}


