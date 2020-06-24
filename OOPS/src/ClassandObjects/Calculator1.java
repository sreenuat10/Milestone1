package ClassandObjects;
	import java.lang.Math; 

	class Calculator
	{
	    static double pow1;
	    static double pow2;
	    static double powerInt(int num1,int num2)
	    {
	        pow1=Math.pow(num1,num2);
	        return pow1;
	    }
	    static double powerDouble(double num1,double num2)
	    {
	         pow2=Math.pow(num1,num2);
	        return pow2;
	    }
	}
	public class Calculator1
	{
	  public static void main(String[] args) {
	       System.out.println(Calculator.powerDouble(25.0,3));
	    System.out.println(Calculator.powerInt(2,3));
	  
	  }
	}

