package javamethod;

public class Parameterized_Add {

	public static void main(String[] args) {
		// define the numbers
		int num1 = 15;
		int num2 = 50;
		int num3 = 25;
		
		int total = getNumber (num1);
		//print out sum of 2 numbers
		System.out.println("----------- print method with 1 parameter ");
		System.out.println("Total:" +total);
		
		total = getNumber(num1, num2);
		//print out sum of 2 numbers
		System.out.println("---------- print method with 2 parameters");
		System.out.println("Total:" +total);
		
		System.out.println("---------- print method with 3 parameters");
		total = getNumber(num1, num2, num3);
		//print.out sum of 3 numbers
		System.out.println("Total:" +total);
	}
	
		public static int getNumber(int num1){
		     // add the number
				int sum = num1;
			// return the sum
				return sum;
		}
				public static int getNumber(int num1, int num2){
				     // add the number
						int sum = num1 + num2;
					// return the sum
						return sum;
	}
				public static int getNumber(int num1, int num2, int num3){
				     // add the number
						int sum = num1 + num2 + num3;
					// return the sum
						return sum;

	}

}
