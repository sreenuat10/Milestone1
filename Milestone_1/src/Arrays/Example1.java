package Arrays;

public class Example1 {

	public static void main(String[] args) {
		
		int []array=new int[] {1,2,3,4,6};
		int sum=0;
		float avg=0;
		for(int i:array)
		{
			sum=sum+i;
		}
System.out.println(sum);
System.out.println((float)sum/array.length);
	}

}
