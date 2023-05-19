package ForLoop;

import java.util.Scanner;

public class Fibonacciseries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = 22;
		int a = 0, b = 1;
		System.out.print(a + " " + b);
		for (int i = 3; i <= n; i++) {
		    int c = a + b;
		    System.out.print(" " + c);
		    a = b;
		    b = c;
		}
		
	}
		
	}


