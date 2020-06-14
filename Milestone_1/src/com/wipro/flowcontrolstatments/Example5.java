package com.wipro.flowcontrolstatments;

public class Example5 {

	public static void main(String[] args) {
		
		char q='d';
		if(q>='a'&&q<='z'||q>='A'&&q<='Z')
		{
			System.out.println("Alphabet");
		}
		else if(q>='0'&&q<='9')
		{
			System.out.println("Digit");
		}
		else
		{
			System.out.println("Special Character");
		}

	}

}
