 package containers;

import java.util.Collections;
import java.util.Enumeration;
import java.util.Vector;

public class VectorTest {

	public static void main(String[] args) {
		// declare a vector
		Vector <String> vec = new Vector < String>();
		// add items to a vector
		vec.add("The United States");
		vec.add("Nigeria");
		vec.add("Germany");
		vec.add("Brazil");
		vec.add("Peru");
		vec.add("Liberia");
		vec.add("Benin");
		vec.add("Ukraine");
		vec.add("Iran");
		vec.add("South Korea");
		vec.add("United Kingdom");
		
		//check to make sure the vector is not empty
		System.out.println("Vector is empty:" +vec.isEmpty());

		//print out the total items in vector
		System.out.println("Total items:" +vec.size());
		
		//use the enumeration to transverse the vector
		Enumeration <String> en = vec.elements();
		
		//use a while loop to display the values in the vector
		System.out.println();
		System.out.println("Unsorted Vector");
		while (en.hasMoreElements()){
		
		//print out the elements
		System.out.println("Country:" +en.nextElement());
		}
		System.out.println();
		System.out.println("Sorted Vector");
		System.out.println("Total item:" +vec.size());
		
		//sort the elements in a vector
		Collections.sort(vec);
		
		//use enumeration 
		Enumeration <String> enu = vec.elements();
		//print the elements
		while (enu.hasMoreElements()){
		System.out.println("Country:" +enu.nextElement());
		}
		//use the contains method
		System.out.println();
		Enumeration <String> e = vec.elements();
		while (e.hasMoreElements()){
			
		//if the contains a given country
		String country = "Togo";
		if (vec.contains(country)){
		
		System.out.println("Found:" +country);break;
		}else{
		
	    System.out.println("Found: " +country +" is not the vector");break;
		}
		}
	}
}
