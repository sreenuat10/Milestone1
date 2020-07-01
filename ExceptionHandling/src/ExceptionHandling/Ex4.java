package ExceptionHandling;
import java.util.Scanner;
public class Ex4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of elements in the arrays");
		int n = sc.nextInt();
		int sum=0;
		double avg=0;
		int[] arr = new int[n];
		
		System.out.println("Enter the elements in the array: ");
		try {
			for (int i = 0; i < n; i++) {
				arr[i] = sc.nextInt();
				sum += arr[i];
			
			avg = sum / n;
		}
		}
		catch (NumberFormatException e) {
			System.out.println("NumberFormatException");
		} 
		catch (ArithmeticException e) {
			System.out.println("ArithmeticException");
		}
		catch (Exception e) {
			System.out.println("InputMismatchException");
		}
		
		System.out.println("sum: " + sum);
		System.out.println("avg: " + avg);
		
	}
}

