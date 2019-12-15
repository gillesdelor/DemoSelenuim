package repetitionstructures;

public class WhileLoop {

	public static void main(String[] args) {
		// use a while loop to display some number
		int i  = 0;
		while (i < 25){
			if (i == 19)continue;
			System.out.println("index :" +i);
			
			i++;
		}

	}

}
