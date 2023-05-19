package Conditioneg;

import java.util.Scanner;

public class vowelconsonent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a character: ");
		char ch = sc.next().charAt(0);
		
		if(ch == 'a' ||ch == 'e' ||ch == 'i'||ch == 'o' || ch =='u') {
			System.out.println("it is vowel");
			
		}
		else {
			System.out.println("it is consonant");
			
		}
			

	}

}
