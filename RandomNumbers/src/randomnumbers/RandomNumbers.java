package randomnumbers;

import java.util.Random;

public class RandomNumbers {

	public static void main(String[] args) {
		
		// generate random numbers
		Random random = new Random();
		
		//get the random number [0 - 9999]
		int xrandom = random.nextInt(10000);
		System.out.println("A-Number: " +xrandom);
		
		//use math class
		int number = (int)(Math.random() * 49 + 1);
		System.out.println("Number: " +number);
		
 
			
	}

}
