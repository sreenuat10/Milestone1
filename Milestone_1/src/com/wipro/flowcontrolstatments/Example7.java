package com.wipro.flowcontrolstatments;

public class Example7 {

	public static void main(String[] args) {
		
		char q='a';
		int t;
		if(q>='a'&&q<='z')
		{
			t=(int)q;
			q=(char)(t-32);
		System.out.println("a->"+q);
		}
		else
		{
			t=(int)q;
			q=(char)(t+32);
		System.out.println("A->"+q);
		}

	}

}
