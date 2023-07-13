package program;

//Q2)WAP using switch case which will display the option of all operators

import java.util.Scanner;

public class Calculator {
	
	public static void main(String[] args) {
		int result;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("choose operator( - + * % / =)");
		
		char operator =sc.next().charAt(0);
		System.out.println("Enter the  num1 and num2");
		
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		
		       // switch operator
				switch(operator) {
				case '+':
					//method for Addtion
					result = num1+num2;
					System.out.println(num1+"+"+num2+"="+result);
					break;
				
					
				case '-':
					//Method for Subtraction
					result = num1-num2;
					System.out.println(num1+"-"+num2+"="+result);
					
					break;
				
				case '=':
					//Method for comparision
					result = num1=num2;
					System.out.println(num1+"="+num2+"="+result);
					break;
				
				case '%':
					
					result = num1%num2;
					System.out.println(num1+"%"+num2+"="+result);
					break;
				
				case '/':
					//Method for Division
					result = num1/num2;
					System.out.println(num1+"/"+num2+"="+result);
					break;
					
				case '*':
					//Method for  Multiplication
					result = num1*num2;
					System.out.println(num1+"*"+num2+"="+result);
					break;
					
					default:
					System.out.println("Invalid choice!");
				}
				sc.close();
		
	}

}
