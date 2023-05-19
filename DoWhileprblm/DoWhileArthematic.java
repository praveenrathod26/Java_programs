package DoWhileprblm;

import java.util.Scanner;

public class DoWhileArthematic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
        int choice;
        double num1, num2;
        double result;
        char ch=0;
        
		do {
            System.out.println("Choose an operation:");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");
            choice = sc.nextInt();

            if (choice >= 1 && choice <= 4) {
                System.out.print("Enter the first number: ");
                num1 = sc.nextDouble();
                System.out.print("Enter the second number: ");
                num2 = sc.nextDouble();
            } else {
                break;
            }

            switch (choice) {
                case 1:
                    result = num1 + num2;
                    System.out.println(num1 + " + " + num2 + " = " + result);
                    System.out.println("press x to continue and press 5 to exit ");
                    ch = sc.next().charAt(0);
                    break;
                case 2:
                    result = num1 - num2;
                    System.out.println(num1 + " - " + num2 + " = " + result);
                    System.out.println("press x to continue and press 5 to exit ");
                    ch = sc.next().charAt(0);
                    break;
                case 3:
                    result = num1 * num2;
                    System.out.println(num1 + " * " + num2 + " = " + result);
                    System.out.println("press x to continue and press 5 to exit ");
                    ch = sc.next().charAt(0);
                    break;
                case 4:
                    if (num2 != 0) {
                        result = num1 / num2;
                        System.out.println(num1 + " / " + num2 + " = " + result);
                        System.out.println("press x to continue and press 5 to exit ");
                        ch = sc.next().charAt(0);
                    } else {
                        System.out.println("Error: Cannot divide by zero.");
                    }
                    break;
            }
        } while(ch=='x'|| ch=='X');
    }
	

}
