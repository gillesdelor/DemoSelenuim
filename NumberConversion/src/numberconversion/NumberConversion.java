package numberconversion;

public class NumberConversion {

	public static void main(String[] args) {
		// define variable
		int ticket = 787;
		//convert the ticket from integer into string
		String eticket = String.valueOf(ticket);
		// display the eticket
		System.out.println("Ticket " +eticket);
		
		String ssn = "123456789";
		//convert the ssn from string to integer
		int essn = Integer.parseInt(ssn);
		//display essn
		System.out.println("SSN " +essn);
		
		String Sales = "345";
		//convert sales to double
		double eSales = Double.parseDouble(Sales);
		System.out.println("Sales $" +eSales);
		
	}

}
