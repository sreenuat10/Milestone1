package com.wipro.flowcontrolstatments;

public class Example17 {

	public static void main(String[] args) {

			int r,rev=0;
			int n=Integer.parseInt(args[0]);
			
			while(n!=0)
			{
			 r=n%10;
			 rev=(rev*10)+r;
			 n=n/10;
			}
			System.out.println(rev);

	}

}
