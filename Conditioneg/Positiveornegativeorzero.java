package Conditioneg;

import java.util.Scanner;

public class Positiveornegativeorzero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	    System.out.print("Enter a number: ");
	    
	    int num = sc.nextInt();
	    
	    if (num > 0) {
	      System.out.println(num + " is positive.");
	    } 
	    else if (num < 0) {
	      System.out.println(num + " is negative.");
	    }
	    else {
	      System.out.println(num + " is zero.");

	    }
	}
}
	    


