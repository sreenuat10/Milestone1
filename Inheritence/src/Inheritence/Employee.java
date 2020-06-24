package Inheritence;

public class Employee extends Person {

	
	private double annualsalary;
	private int year;
	private String insurancenumber;
	public Employee(String n,double s,int y,String i)
	{
		super(n);
		annualsalary=s;
		year=y;
		insurancenumber=i;
	}
	public void setannualsalary(double s)
	{
		annualsalary=s;
	}
	public double getannualsalary()
	{
		return annualsalary;
	}
	public void setyear(int y)
	{
		year=y;
	}
	public int getyear()
	{
		return year;
	}
	public void setinsurancenumber(String i)
	{
		insurancenumber=i;
	}
	public String getinsurancenumber()
	{
		return insurancenumber;
	}

	public String toString()
	{
		return super.toString()+" "+annualsalary+" "+year+" "+insurancenumber;
	}
	
	
}
