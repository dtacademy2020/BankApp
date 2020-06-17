package bankApp;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Utility {

	public static List<String[]> readFromAFile(String pathToAFile)  {
		
		List<String[]> customers = new ArrayList<String[]>();
		String line="";
		
		
		File f = new File(pathToAFile);	
	try(Scanner input = new Scanner(f)){ // read from a file
		
		
		
		while(input.hasNext()) {
		
				line = input.nextLine();
				
				customers.add(line.split(","));
		
		}} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		
		return customers;
	
	
	
	}
//	public static void main(String[] args) throws FileNotFoundException {
//		//System.out.println(readFromAFile("customers.txt"));
//		List<String[]> customers  = readFromAFile("customers.txt");
//		
//	for (String [] a: customers) {System.out.println(Arrays.toString(a));}
//	
//	
//		
//	}
	
	
}
