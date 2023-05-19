package Conditioneg;

import java.util.Scanner;

public class Discount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
	    System.out.print("Enter your purchase amount: ");
	    float purchaseAmount = sc.nextFloat();
	    
	    float discount;
	    
	    if (purchaseAmount >= 10000) {
	      discount = purchaseAmount * 0.10f;
	      
	    } else {
	      discount = purchaseAmount * 0.02f;
	      
	    }
	    System.out.println("Your discount amount is: " + discount);

	}

}
