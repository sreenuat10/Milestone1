package ClassandObjects;

	class Patient
	{
	  String patientName;
	  double height,width;

	Patient(double h,double w)
	{
	    height=h;
	    width=w;
	}
	 double computeBMI()
	{
	    return width/(height*height);
	}
	}
	public class Patient1
	{
	  public static void main(String[] args) {
	      Patient p=new Patient(2,3);
	    System.out.println(p.computeBMI());
	  }
	}

