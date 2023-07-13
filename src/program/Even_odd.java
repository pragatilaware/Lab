package program;


/*Q3)WAP to perform the following operation 
1:WAP to accept a no from the user and check it is even or odd
2:Accept 3 no from the user and find out the greatest
3:Accept age and check eligible for voting or not
*/

import java.util.Scanner;

public class Even_odd {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	
	//1:WAP to accept a no from the user and check it is even or odd
	
	System.out.println("Enter th value");
	int a = sc.nextInt();
	
	if(a%2==0) {
		System.out.println("it is even no");
		
		
	}else {
		
		System.out.println("it is odd");
	}
	
	//2:Accept 3 no from the user and find out the greatest
	System.out.println("Enter the three value");
	int No1= sc.nextInt();
	int No2 =sc.nextInt();
	int No3 = sc.nextInt();
	
	if(No1>=No2 && No1>=No3) {
		System.out.println("No1 is greatest"+ No1);
		
	}else if(No2>=No3 && No2>=No3){
		System.out.println("No2 is greatest"+No2);
		
		
		
	}else if(No3>=No1 && No3>=No2) {
		System.out.println("No3 is greatest"+ No3);
	}
	
	//Q3:Accept age and check eligible for voting or not

	System.out.println("Enter the age");
	int Age = sc.nextInt();
	
	 //check if the person is eligible for voting or not
	if(Age>=18) {
		System.out.println("your eligible to voting.");
		
	}
	else {
		System.out.println("your not eligible to voting.");
	}
	
	
}
	
}

 