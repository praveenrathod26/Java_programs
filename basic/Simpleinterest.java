package basic;

import java.util.*;

public class Simpleinterest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the principal amount");
		int p=sc.nextInt();
		System.out.println("enter the rate of interest");
		int r=sc.nextInt();
		System.out.println("enter the time period(in years)");
		int t=sc.nextInt();
		int interest=(p*r*t/100);
		int totalAmount=p+interest;
		System.out.println("simple interest is:" +interest);
		System.out.println("The total amount is:" +totalAmount);
		
		

	}

}
