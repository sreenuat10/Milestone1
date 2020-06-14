package com.wipro.flowcontrolstatments;

public class Example1_A {

	public static void main(String[] args) {
	
		int number=Integer.parseInt(args[0]);
		if(number>0)
		
		{
			System.out.println(number+" is a Positive Number");
			
		}
		else if(number<0)
		{
			System.out.println(number+" is a Negative Number");
			
		}
		else 
		{
			System.out.println(number+" is Zero");
			
		}


	}

}
