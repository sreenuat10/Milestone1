package com.wipro.flowcontrolstatments;

public class Example18 {

	public static void main(String[] args) {
		
		int r,rev=0;
		int n=Integer.parseInt(args[0]);
		int a=n;
		while(a!=0)
		{
		 r=a%10;
		 rev=(rev*10)+r;
		 a=a/10;
		}
		if(rev==n)
		{
		System.out.println(n+" is a palindrome");
		}
		else
		{
			System.out.println(n+" is not a palindrome");
		}


	}

}
