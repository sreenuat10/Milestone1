package com.wipro.flowcontrolstatments;

public class Example16usingWhile {

	public static void main(String[] args) {
		int n=Integer.parseInt(args[0]);
		if(args.length==0)
		{
			System.out.println("Please enter an integer number");
		}

	int i=1,j=1;
	
		while(i<=n)
		{

           for(j=1;j<=i;j++)
			{
				System.out.print("* ");
			
			}
		System.out.println();
		i++;
		}
		

	}

}
