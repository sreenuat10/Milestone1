package ClassandObjects;

class Box{
	    double width;
	     double height;
	    double depth;
	   
	    Box(double w,double h,double d){
	       width=w;
	       height=h;
	       depth=d;
	    }
	    double volume()
	    {
	        return width*height*depth;
	    }
	    
	}
	public class VolBox
	{
	  public static void main(String[] args) {
	  Box ob1=new Box(1,2.5,3);  
	  Box ob2=new Box(5,6,7.8);
	  double vol1=ob1.volume();
	  double vol2=ob2.volume();
	System.out.println("volume of Box1 is "+vol1);
	System.out.println("volume of Box2 is "+vol2);
	  }
	}

