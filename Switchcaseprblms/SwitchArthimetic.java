package Switchcaseprblms;

import java.util.Scanner;

public class SwitchArthimetic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char choice;
		int a,b;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers");
		a = sc.nextInt();
		b = sc.nextInt();
		
		System.out.println("Enter your choice between + for Addition , - for Subtraction , * for Multiplication , / for Division ");
		choice = sc.next().charAt(0);
		
		switch (choice) {
		case '+':
			System.out.println("Addition = " +(a+b));	
			break;
		case '-':
			System.out.println(" Subtraction = " +(a-b));	
			break;
		case '*':
			System.out.println("Multiplication = " +(a*b));	
			break;
		case '/':
			System.out.println(" Divsion =" +(a/b));	
			break;

		default:
			System.out.println("You have to enter only given choices");
			break;
		}

	}

}
