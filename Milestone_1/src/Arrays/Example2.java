package Arrays;

public class Example2 {

	public static void main(String[] args) {
		
		int[] array=new int[] {1,2,3,4,9};
		
		int min=array[0],max=array[0];
		
		for(int i=0;i<array.length;i++)
		{
			if(min>array[i])
			{
				min=array[i];
			}
			else if(max<array[i])
			{
				max=array[i];
			}
		}
		System.out.println(min+" is the minimum value");
		System.out.println(max+" is the maximum value");
	}
}
