  package containers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListTest {

	public static void main(String[] args) {
		// declare an array list
		ArrayList <String>list = new ArrayList <String>();
	    // add values to array
		list.add("Herndon");
		list.add("Reston");
		list.add("Rosslyn");
		list.add("Chantilly");
		list.add("Marietta");
		list.add("Hiram");
		list.add("Fairfax");
		list.add("Manassas");
		list.add("Dulles");
		list.add("Dumfries");
	    
	    // check if the list is not empty
		System.out.println( "List is empty:" +list.isEmpty());
		
		//print the number of values in the array list
		System.out.println("Total of items: " +list.size());
		
		// using Java 8 feature lambda expression
		System.out.println();
		System.out.println("List of the countries: ");
	    list.forEach(item -> System.out.println(item));
		
		//use the iterator to transverse the list
		Iterator <String> itr = list.iterator();
		  
		//use a while loop to display the values in the list
		System.out.println(" Unsorted List ");
		while (itr.hasNext()){
		System.out.println("City: " +itr.next());
		}
		System.out.println();
	    System.out.println("Sorted List ");
	    System.out.println("Total item: " +list.size());
	    
	    //sort the values in array list
	    Collections.sort(list);
	    
        // use a while loop to display the values in the list
	    Iterator <String> it = list.iterator();
	    while (it.hasNext()){
	    System.out.println("City: " +it.next());
	    }
	        
        // remove a city in the list
	    list.remove("Manassas");
	    list.remove("Hiram");
	    Iterator <String> itrr = list.iterator();
	    System.out.println();
	    System.out.println("Total item:" +list.size());
	    System.out.println("List after Manassas and Hiram is removed");
	    while(itrr.hasNext()){
	    System.out.println("City: " +itrr.next());
	    }
	    
	    // clear the list
	    System.out.println();
	    System.out.println("Clear the list and check if it is empty");
	    list.clear();
	    
	    //check if the list is not empty
	    System.out.println("List is empty :" +list.isEmpty());
	}		
	}