package ExceptionHandling;

import java.util.Scanner;

public class Ex9 {

	public static void main(String args[]) {
		int q;
	Scanner sc = new Scanner(System.in);
	try {
		
		System.out.println("Enter the 2 numbers");
		int a = sc.nextInt();
		int b = sc.nextInt();
		q=a/b;
		System.out.println("The quotient of "+a+"/"+b+" ="+q);
	}
	catch(ArithmeticException e){
		
		System.out.println("DivideByZeroException"+ " caught");
	}
	finally {
		System.out.println("Inside finally block");
	}
	sc.close();
	}
	
}
