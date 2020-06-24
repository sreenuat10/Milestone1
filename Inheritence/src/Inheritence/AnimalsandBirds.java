package Inheritence;
class Animals
{
	void eat()
	{
		System.out.println("Animals eats");
	}
	void sleep()
	{
		System.out.println("Animals sleep");
	}

}
class Birds extends Animals
{
	void eat()
	{
		System.out.println("Override eats");
	}
	void sleep()
	{
		System.out.println("Override sleep");
	}
	void fly()
	{
		System.out.println("Birds fly");
	}
}
public class AnimalsandBirds {

	public static void main(String args[])
	{
		Animals A=new Animals();
		Birds B=new Birds();
		A.eat();
		A.sleep();
		B.eat();
		B.sleep();
		B.fly();
		
	}
}
