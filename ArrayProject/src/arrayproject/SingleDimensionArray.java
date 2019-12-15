package arrayproject;

public class SingleDimensionArray {

	public static void main(String[] args) {
		// declare class-level variable
		String[]cities = {"Herndon","Reston","Rosslyn","Chantilly","Fairfax","Manassas","Dulles"};
		String[]cityList = new String[cities.length];
		
		// call the getCities array method
		cityList = getCities (cities);
		
		// display the values in the cityList
		for (int i=0; i < cityList.length; i++){
	    System.out.println("City name: " +cityList[i]);	 
	}
}
	
     // create a method for array
    public static String [] getCities(String[]cities){
    // use a loop to step through the array
   // and return the cities 
    String[] cityarray = new String[cities.length];
    for ( int i=0; i < cities.length; i++){
    	cityarray[i] = cities[i];
    }
   //return the city array
    return cityarray;
     
    }
    }
