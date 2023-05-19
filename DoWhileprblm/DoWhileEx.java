package DoWhileprblm;

import java.util.*;


public class DoWhileEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c;
		char ch;
		Scanner sc = new Scanner(System.in);
		do
		{
		System.out.println("Enter 2 numbers : ");
		a = sc.nextInt();
		b = sc.nextInt();
		
		c= a+b;
		
		System.out.println("Addition :" +c);
		System.out.println("press y to continue and press any key to exit "+c);
		ch = sc.next().charAt(0);
		}
		while(ch=='y'|| ch=='Y');
	}
}

                                                               