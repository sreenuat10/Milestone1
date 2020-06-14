package com.wipro.flowcontrolstatments;

public class Example15 {

	public static void main(String[] args) {
		int r,sum=0;
		int n=Integer.parseInt(args[0]);
		
		while(n!=0)
		{
		 r=n%10;
		 sum=sum+r;
		 n=n/10;
		}
		System.out.println(sum);
	}

}
