package com.wipro.flowcontrolstatments;

public class Example13Prime {

	public static void main(String[] args) {
	int flag;
		
		for(int i=10;i<=99;i++)
		{flag=0;
		for(int j=2;j<i;j++)
		{
			if(i%j==0)
			{
				flag=1;
				break;
			}
				
		}
		
		if(flag==0)
		System.out.println(i);
}
	}

}
