package Arrays;

public class Example7 {

	public static void main(String[] args) {
		
		int[] ar=new int[] {12,34,12,45,67,89};
		int k,i,j,n=ar.length;
		System.out.println("Before Removing Duplicate numbers ");
		for(i=0;i<n;i++)
		{
			System.out.print(ar[i]+" ");
		}
		for(i=0;i<n;i++)
		{
			
			for(j=i+1;j<n;)
			{
				if(ar[j]==ar[i])
				{
					for(k=j;k<n-1;k++)
					{
						ar[k]=ar[k+1];
					}
					n--;
				}
				else
				{
					j++;
				}
			}
		}
		System.out.println();
	System.out.println("After Removing Duplicate numbers ");
		for(i=0;i<n;i++)
		{
			System.out.print(ar[i]+" ");
		}

	}

}
