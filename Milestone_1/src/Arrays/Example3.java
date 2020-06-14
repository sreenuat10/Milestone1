package Arrays;

public class Example3 {

	public static void main(String[] args) {
		
		int[] ar=new int[] {1,4,34,56,7};
		int n=Integer.parseInt(args[0]);
		int i,flag=0;
		for(i=0;i<ar.length;i++)
		{
			if(ar[i]==n)
			{
				flag=1;
				break;
			}
		}
		if(flag==1)
		{
			System.out.println(i);
		}
		else
		{
			System.out.println("-1");
		}
	}

}
