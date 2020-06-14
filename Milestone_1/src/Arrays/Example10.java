package Arrays;

public class Example10 {
	

	    public static void main(String args[])
	    {
	    	 int i,j,max=0;
	  	   
	 	    int ar[][] = new int[9][9];
	 	    if(args.length<9)
	 	    {
	 	    System.out.println("Please enter 9 values");
	 	    }
	 	    if(args.length==9)
	 	        
	 	    {
	 	        int k=0;
	 	    for(i=0;i<3;i++)
	 	    {
	 	        for(j=0;j<3;j++)
	 	        {
	 	            
	 	        ar[i][j]=Integer.parseInt(args[k]);
	 	        k++;
	 	        }
	 	        
	 	    }
	 	    System.out.println("The given array is:");
	 	    for(i=0;i<3;i++)
	 	    {
	 	        for(j=0;j<3;j++)
	 	        {
	 	        System.out.print(ar[i][j]+" ");
	 	        }
	 	        System.out.println();
	 	        
	 	    }

	 	   for(i=0;i<3;i++)
	 	    {
	 	        for(j=0;j<3;j++)
	 	        {
	 	        	if(ar[i][j]>max)
	 	        		max=ar[i][j];
	 	        }
	 	    
	 	    }
	 	   System.out.println("The biggest number in the given array is "+max);
	 	    }
	 	    }
	    }