package javamethod;

public class MyJavaMethod_Add {
	    // define the numbers
	static int num1 = 10;
	static int num2 = 20;
	static int num3 = 30;
	
	public static void main(String[] args) {
		// Call add number
		int total1 = getNumber1();
		// print the number
		System.out.println("Total1:" +total1);
		
        System.out.println();
        
		int total2 = getNumber2();
		// print the number
		System.out.println("Total2:" +total2);
	}
		
	public static int getNumber1(){
	   // add the number
	int sum = num1+ num2;
	    // return the sum
	return sum;
	}
	
   public static int getNumber2(){
	   // define numbers
	int sum = num1 + num2 + num3;
	   // return the sum
	return sum;
	
   }
	}


