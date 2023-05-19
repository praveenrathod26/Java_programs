package DoWhileprblm;

import java.util.Scanner;

public class DoWhileArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Scanner sc = new Scanner(System.in);
	        int choice;
	        double radius, base, height, length, width;
	        double area;
	        char ch = 0;

	      
			do {
	            System.out.println("Choose a shape:");
	            System.out.println("1. Circle");
	            System.out.println("2. Triangle");
	            System.out.println("3. Rectangle");
	            System.out.println("4. Exit");
	            choice = sc.nextInt();

	            switch (choice) {
	                case 1:
	                    System.out.print("Enter the radius: ");
	                    radius = sc.nextDouble();
	                    area = Math.PI * radius * radius;
	                    System.out.println("Area of the circle: " + area);
	                    System.out.println("Press X to continue and Press 4 for exit");
	                    ch = sc.next().charAt(0);
	                    break;
	                case 2:
	                    System.out.print("Enter the base: ");
	                    base = sc.nextDouble();
	                    System.out.print("Enter the height: ");
	                    height = sc.nextDouble();
	                    area = 0.5 * base * height;
	                    System.out.println("Area of the triangle: " + area);
	                    System.out.println("Press X to continue and Press 4 for exit");
	                    ch = sc.next().charAt(0);
	                    break;
	                case 3:
	                    System.out.print("Enter the length: ");
	                    length = sc.nextDouble();
	                    System.out.print("Enter the width: ");
	                    width = sc.nextDouble();
	                    area = length * width;
	                    System.out.println("Area of the rectangle: " + area);
	                    System.out.println("Press X to continue and Press 4 for exit");
	                    ch = sc.next().charAt(0);
	                    break;
	            }
	        } while(ch=='x'|| ch=='X');
	    }
	

	}


