package program;

//1) WAP to accept Radius from user and calculate Area of circle and circumference circle

import java.util.Scanner;

public class area_circle {
	public static void main(String[] args) {
		
	 double area;
	 double C;
	 
	 //Assign (pi) value which is 3.14
	 double pi = 3.14;
	    Scanner sc = new Scanner(System.in); 
	    
	    //Accept the user value
		System.out.println("Enter the value of radius");
		int radius=sc.nextInt();
		
		//calculate the area of circle
		area = pi*radius;
		System.out.println("area is"+  area);
		
		//Calculate the circumference of the circle
		C =2*pi*radius;
		System.out.println(""+C);
		sc.close();
		
		}

}
