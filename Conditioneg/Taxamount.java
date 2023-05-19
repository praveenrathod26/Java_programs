package Conditioneg;

import java.util.Scanner;

public class Taxamount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		float salary, tax;
		System.out.print("Enter your salary: ");
		 salary = sc.nextFloat();
		
		
		if(salary<50000)
			
			tax = salary * 0.10f;
		
		else 
			
			tax = salary * 0.15f;
		
		System.out.println("tax =" +tax);
		
	
	}

}
