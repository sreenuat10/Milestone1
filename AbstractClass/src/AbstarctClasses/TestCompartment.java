package AbstarctClasses;
import java.util.Random;
abstract class Compartment
{
	public abstract void notice();
}
class FirstClass extends Compartment
{
	@Override
	public void notice()
	{
		System.out.println("First Comp");
	}
}
class Ladies extends Compartment
{
	@Override
	public void notice()
	{
		System.out.println("Second Comp");
	}
}
class General extends Compartment
{
	@Override
	public void notice()
	{
		System.out.println("Third Comp");
	}
}
class Luggage extends Compartment
{
	@Override
	public void notice()
	{
		System.out.println("Fourth Comp");
	}
}
public class TestCompartment {

	public static void main(String[] args) {
		
Compartment compartment[]=new Compartment[10];		
Random rand=new Random();
for(int i=1;i<=10;i++)
{
	int r=rand.nextInt(4);
	if(r==1)
	{
		compartment[i]=new FirstClass();
	}
	else if(r==2)
	{
		compartment[i]=new Ladies();
	}
	else if(r==3)
	{
		compartment[i]=new General();
	}
	else if(r==4)
	{
		compartment[i]=new Luggage();
	}
	compartment[i].notice();
	}
	}

}
