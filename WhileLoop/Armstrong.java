package WhileLoop;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Scanner sc = new Scanner(System.in);
			System.out.println("Enter a number :");
			int num = sc.nextInt();
			int orgnum = num;
			int rem;
			int res = 0;
			
			
			while (orgnum!=0)
			{
				rem = orgnum%10;
				res += Math.pow(rem,3);
				orgnum /= 10;
			}
			if (res == num)
			{
				System.out.println(num + " is an Armstrong.");
			} 
			else
			{
				System.out.println(num + " is not an Armstrong.");
			}
			
		}
	}


