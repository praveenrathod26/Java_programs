package Switchcaseprblms;

import java.util.Scanner;

public class SwitchEvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int choice;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your choice: ");
		choice = sc.nextInt();
		System.out.println("Enter your choice : 1 or 2");
		
		switch (choice) {
		case 1:
			System.out.println("Enter num");
			int num = sc.nextInt();
			if (num%2==0)
			{
				System.out.println("given num is even"+num);
			}
			else {
				System.out.println("given mnum is odd:"+num);
			}
			break;
		case 2:
			System.out.println("Enter num");
			num = sc.nextInt();
			if (num>0)
			{
				System.out.println("given num is positive: "+num);				
			}
			else if(num==0)
			{
				System.out.println("given num is zero:"+num);
			}
			break;
			
		default:
			System.out.println("invalid choice");
			break;
		}
		
	}

}
