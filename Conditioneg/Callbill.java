package Conditioneg;

import java.util.Scanner;

public class Callbill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
	    System.out.print("Enter the number of calls: ");
	    
	    float calls = sc.nextInt();
	    float bill;
	    
	    if (calls < 200) {
	      bill = calls * 1;
	    } 
	    else {
	      bill = calls * 3;
	    }
	    System.out.println("Your bill amount is: " + bill);

	}

}
