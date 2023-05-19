package DoWhileprblm;

import java.util.Scanner;

public class DoWhileEvenorOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char ch = 0;
		int num;
		Scanner sc = new Scanner(System.in);
		
		do 
		{
			System.out.println("Enter Number");
			num = sc.nextInt();
		
				if(num % 2==0 )
					{
						System.out.println("It is Even Number");
						System.out.println("press x to continue and press any key to exit");
						ch = sc.next().charAt(0);
					}
				else 
					{
						System.out.println("It is Odd Number");
						System.out.println("press x to continue and press any key to exit");
							ch = sc.next().charAt(0);
					}
				}
				while(ch=='x'|| ch=='X');
		}

	}




