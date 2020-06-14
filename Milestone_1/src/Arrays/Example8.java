package Arrays;

public class Example8 {

	public static void main(String[] args) {
	
		int[] ar=new int[] {};
		int flag=0,sum=0;
		for(int i:ar)
		{
			if(i==6)
				flag=1;
			if(flag==1)
			{
				if(i==7)
				flag=0;
			
			continue;
			
			}
			else {
				if(i==7)
					sum+=i+6;
				else
					sum+=i;
			}
		
			
		}
		System.out.println(sum);
	}
}