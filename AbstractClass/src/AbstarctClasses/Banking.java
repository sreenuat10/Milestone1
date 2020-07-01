package AbstarctClasses;

abstract class GeneralBank
{
	abstract double getSavingsIR();
	
	abstract double getFixedDIR();
	
}
class ICICIBank extends GeneralBank
{
	public double getSavingsIR()
	{
		return 4.0;
	}
	public double getFixedDIR()
	{
		return 8.5;
	}
}
class KotMBank extends GeneralBank
{
	public double getSavingsIR()
	{
		return 6.0;
	}
	public double getFixedDIR()
	{
		return 9.0;
	}
}
public class Banking {

	public static void main(String[] args) {
		
ICICIBank i=new ICICIBank();
KotMBank k=new KotMBank();
System.out.println(i.getSavingsIR());
System.out.println(i.getFixedDIR());
System.out.println(k.getSavingsIR());
System.out.println(k.getFixedDIR());
GeneralBank g1=new ICICIBank();
GeneralBank g=new KotMBank();
System.out.println(g1.getSavingsIR());
System.out.println(g1.getFixedDIR());
System.out.println(g.getSavingsIR());
System.out.println(g.getFixedDIR());

	}

}
