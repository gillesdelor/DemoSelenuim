package numberconversion;

public class MyNumberConversion {

	public static void main(String[] args) {
		// define variable
		int ticket = 500;
		// convert the ticket from integer into String
		String xticket = String.valueOf(ticket);
		System.out.println("Ticket:" +xticket );
		
		
		// define variable
		String ssn = "123456789";
		//Convert variable from String to integer
		int xssn = Integer.parseInt(ssn);
		System.out.println("SSN:" +xssn);
		
		String Sales = "1500";
		// convert sales into double
		double eSales = Double.parseDouble(Sales);
		System.out.println("Sales = $" +eSales);
		
		

	}

}
