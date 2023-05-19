package Conditioneg;

import java.util.Scanner;

public class Eligibleforlincenseornot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int age;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter age");
		age = sc.nextInt();
		
		if(age>=18)
		{
			System.out.println("Eligible for License");
		}
		else {
			System.out.println("Not Eligible for License ");
		}
	}
			
		

	}


