package Arrays;

public class Example5 {

	public static void main(String[] args) {
		
		int[] arr=new int[] {2,5,3,7,8,11,55,1,0};
		 int max = arr[0];
         int secondmax = arr[0];
         int min = arr[0];
         int secondmin = arr[0];

		for (int i = 0; i < arr.length; i++)
        {
                if (arr[i] > max)
                {
                        secondmax = max;
                        max = arr[i];
                }
                else if (arr[i] > secondmax)
                {
                        secondmax = arr[i];
                }
        }
        for (int i = 0; i < arr.length; i++)
        {
                if (arr[i] < min)
                {
                        secondmin = min;
                        min = arr[i];
                }
                else if (arr[i] < secondmin)
                {
                        secondmin = arr[i];
                }
        }
        System.out.println("\nFirst maximum number is: " + max);
        System.out.println("\nFirst minimum number is: " + min);
        System.out.println("\nSecond maximum number is: " + secondmax);
        System.out.println("\nSecond minimum number is: " + secondmin);
}
}
	


