package Conditioneg;

import java.util.Scanner;

public class MaximumNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Three Numbers");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		
		if(num1>num2 && num1>num3)
			System.out.println(num1+" is max");
		else if(num2>num1 && num2>num3)
			System.out.println(num2+" is max");
		else 
			System.out.println(num3+ "is max");
		
		
	}

}
