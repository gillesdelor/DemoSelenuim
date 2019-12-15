package arrayproject;

public class MySingleDimensionArray {

	public static void main(String[] args) {
		
		// declare variable
		String[] cars = {"Toyota","Nissan","Honda","Ford","Audi","BMW","Chevy","Lincoln","Dodge"};
		String[] carsList = new String[cars.length];
		
		// call the getCar array method
		   carsList = getCars(cars);
		   
		// display the values in the carsList
	    for (int i=0; i < carsList.length; i++){
	    System.out.println("Name of the car is: " +cars[i]);
	    }

	}
		// create a method for array	
		public static String[] getCars(String[] cars ){
			
		// use a loop to step through the array and return the cars array
	    String[] carsArray = new String[cars.length];
	    for (int i=0; i < cars.length; i++){
	    	carsArray[i] = cars[i];
	    }
	    	//return the cars array
	    	return carsArray;
	    	    
		}
		
	}


