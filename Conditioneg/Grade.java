package Conditioneg;

import java.util.Scanner;

public class Grade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float Mathematics, Physics, Chemistry ,Total, Percent;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter marks of Mathematics, Physics and Chemistry : ");
		Mathematics = sc.nextFloat();
		Physics = sc.nextFloat();
		Chemistry = sc.nextFloat();
		
	    Total = Mathematics+Physics+Chemistry;
		Percent = Total/3;
		
		System.out.print("Total :"+Total);
		System.out.println("Percentage : "+Percent);
		
		if(Mathematics<40 || Physics<40 || Chemistry<40) {
			System.out.println("Fail");
			
		
		}
		else {
			if(Percent>=75)
				System.out.println("A+");
			else if(Percent>=60)
				System.out.println("A");
			else if(Percent>=40)
				System.out.println("B");
			else
				System.out.println("Fail");
			
		}

	}

}
