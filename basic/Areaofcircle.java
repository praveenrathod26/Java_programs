package basic;

import java.util.*;



public class Areaofcircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	     System.out.println("enter radius of circle");
	     int r=sc.nextInt();
	     int A=(22/7)*r*r;
	     System.out.println("Area of circle is= "+A);
	     
	     System.out.println("enter width of rectangle");
	     int w=sc.nextInt();
	     System.out.println("enter length of rectangle");
	     int l=sc.nextInt(w+1);
	     System.out.println("area of rectangle is = "+(w*1));
	     
	     System.out.println("enter height of triangle");
	     int h=sc.nextInt();
	     System.out.println("enter base of triangle");
	     int b=sc.nextInt();
	     System.out.println("area of triangle is = "+(h*b)/2);
	     
	     



	}

}
