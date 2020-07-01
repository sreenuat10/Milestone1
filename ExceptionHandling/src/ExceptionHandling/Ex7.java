package ExceptionHandling;

public class Ex7 {
	
		public void registerUser(String username, String userCountry) throws InvalidCountryException {
			if (!userCountry.equals("India"))
				throw new InvalidCountryException();
			else
				System.out.println("User registration done successfully");
			
			
		}

		public static void main(String[] args) {
			Ex7 registration = new Ex7();
			
			try {
				
				registration.registerUser("Mini", "India");
			} 
			catch (Exception e) {
			e.printStackTrace();
			}
		}

	}	

