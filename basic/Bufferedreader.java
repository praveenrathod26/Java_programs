package basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bufferedreader {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		int a,b,c;
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter two numbers :");
		a = Integer.parseInt(reader.readLine()); //readLine():used to read user input string
		b = Integer.parseInt(reader.readLine());
		
		c=a+b;
		
		System.out.println("Addition of "+a+" and "+b+" is :"+c);
		
		
		
		
		

	}

}
