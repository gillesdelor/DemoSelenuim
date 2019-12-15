package randomnumbers;

import java.util.Random;

public class MyRandomNumbers {

	public static void main(String[] args) {
		
		// generate random numbers
		Random random = new Random ();
		
		// get random numbers [0-5000]
		int randomNumbers = random.nextInt(5000);
		
		System.out.println("A-Number:" +randomNumbers);
	}
}

