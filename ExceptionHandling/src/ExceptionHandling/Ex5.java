package ExceptionHandling;
import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		try {
			double q= division(a, b);
			System.out.println(q);
		} 
		catch (Exception e) {
	e.printStackTrace();
		}
		
		sc.close();
	}
	
	public static double division(int a, int b) {
		return a / b;
	}

}