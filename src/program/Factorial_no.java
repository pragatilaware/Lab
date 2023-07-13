package program;

import java.util.Scanner;

public class Factorial_no {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Declear variable
		int fact=1;
		
		System.out.println("Enter the no");
		
		// Taking User Input
		int num =sc.nextInt();
		
		// Comparing Variabble with Greater then 1
		for(int i=1;i<=num;i++) {
			fact=fact*i;
			
		}
		System.out.println("Factorial number is"+fact);
		sc.close();
	
		
	}

}
