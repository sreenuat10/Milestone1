package Arrays;
import java.util.Arrays;
public class Example6 {

	public static void main(String[] args) {
		
		int[] ar={3,2,4,1,6,8,7,5};
		Arrays.sort(ar);
		System.out.print("Sorted order is : ");
		for(int i=0;i<ar.length;i++)
		{
			System.out.print(ar[i]+" ");
		}
		
	}

}
