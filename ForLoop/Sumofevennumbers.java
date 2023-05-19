package ForLoop;

import java.util.Scanner;

public class Sumofevennumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		for (int i = 2; i <= 50; i += 2) {
		    sum += i;
		}
		System.out.println("Sum of even numbers from 1 to 50: " + sum);
		}
	}
		

	


