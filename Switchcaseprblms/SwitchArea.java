package Switchcaseprblms;

import java.util.Scanner;

public class SwitchArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double  length,breadth,radius,height;
		int choice;
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your choice press 1 for Area of circle, 2 for Area of Triangle, 3 for Area of Rectangle ");
		
		choice = sc.nextInt();
		 
		 switch (choice) {
		case 1:
			System.out.println("Enter radius of the circle");
			radius = sc.nextDouble();
			double circlearea= (22/7)*radius*radius;
			System.out.println("Area of circle is :"+circlearea);
			break;
		case 2: 
			System.out.println("Enter length and breadth of the rectangle");
			length = sc.nextDouble();
			breadth = sc.nextDouble();
			double rectanglearea = length*breadth;
			System.out.println("Area of rectangle is :"+rectanglearea);
			break;
		case 3:
			System.out.println("Enter height and length of the triangle");
			height = sc.nextDouble();
			breadth = sc.nextDouble();
			double trianglearea = (height*breadth)/2;
			System.out.println("Area of triangle is :"+trianglearea);
			break;
			
		default:
			System.out.println("Invalid Choice");

			break;
		}
		 

	}

}
