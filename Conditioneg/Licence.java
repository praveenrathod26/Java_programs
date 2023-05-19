package Conditioneg;

import java.util.Scanner;

public class Licence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int age;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter age");
		age = sc.nextInt();
		
		if(age>=18)
		{
			System.out.println("License is permitted");
		}
		else {
			System.out.println("License is not permitted");
			
		
		}
		

	}

}
