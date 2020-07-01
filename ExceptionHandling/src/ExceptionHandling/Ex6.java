package ExceptionHandling;
	import java.util.Scanner;
	
public class Ex6 {
	
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			
			for (int i = 0; i < 2; i++) {
				String name = "";
				int A = 0;
				int B = 0;
				int C = 0;
				
				try {				
					name = sc.nextLine();
					
					if (sc.hasNextInt())
						A = sc.nextInt();
					else
						throw new NumberFormatException();
					
					if (sc.hasNextInt())
						B = sc.nextInt();
					else
						throw new NumberFormatException();
					
					if (sc.hasNextInt())
						C = sc.nextInt();
					else
						throw new NumberFormatException();
					
					if (A < 0) 
						throw new NegativeValuesException();
					if (A > 100) 
						throw new ValuesOutOfRangeException();
					
					if (B < 0) 
						throw new NegativeValuesException();
					if (B > 100) 
						throw new ValuesOutOfRangeException();
					
					if (C < 0) 
						throw new NegativeValuesException();
					if (C > 100) 
						throw new ValuesOutOfRangeException();
					
					
				} 
				catch (ArithmeticException e) {
					System.out.println(e.getMessage());
				} 
				catch (NegativeValuesException e) {
					System.out.println(e.getMessage());
				}
				catch (ValuesOutOfRangeException e) {
					System.out.println(e.getMessage());
				}
				
				System.out.println("Name: " + name);
				System.out.println("Marks of subject A: " + A);
				System.out.println("Marks of subject B: " + B);
				System.out.println("Marks of subject C: " + C);
			}
			
			sc.close();

		}
		
}


