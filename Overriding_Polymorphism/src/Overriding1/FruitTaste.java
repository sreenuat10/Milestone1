package Overriding1;

class Fruit
{
	String name,taste,size;
	Fruit(String n,String t,String s)
	{
		name=n;
		taste=t;
		size=s;
	}
	void eat()
	{
		System.out.println(name+" "+taste);
	}
}
class Apple extends Fruit
{
	
	Apple(String n,String t,String s)
	{
		super(n,t,s);
	}
	void eat()
	{
		System.out.println("Name of Fruit is : "+name+" It's Taste : "+taste);
	}
}
class Orange extends Fruit
{
	
	Orange(String n,String t,String s)
	{
		super(n,t,s);
	}
	void eat()
	{
		System.out.println("Name of Fruit is : "+name+" It's Taste : "+taste);
	}
}
public class FruitTaste {

	public static void main(String[] args) {
		
		Apple A=new Apple("Apple","Sour","Circle");
		Orange B=new Orange("Orange","bitter","oval");
		A.eat();
		B.eat();

	}

}
