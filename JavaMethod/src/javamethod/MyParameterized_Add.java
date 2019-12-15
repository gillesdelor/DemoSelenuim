package javamethod;

public class MyParameterized_Add {

	public static void main(String[] args) {
		// define the numbers
		int num1 = 10;
		int num2 = 20;
		int num3 = 30;
		
	int total1 = getNumber1(num1 ,num2);
	    //print the total1
	System.out.println("Total1:" +total1);
	
	System.out.println();
	
	int total2 = getNumber2(num1, num2 ,num3);
	     //print the total2
	System.out.println("Total2:" +total2);
	
	}   

public static int getNumber1(int num1,int num2){
	   // add the number
	int sum = num1 + num2;
	    // return the sum
	return sum;
	}
	
public static int getNumber2(int num1,int num2,int num3){
	   // define numbers
	int sum = num1 + num2 + num3;
	   // return the sum
	return sum;	
}

}