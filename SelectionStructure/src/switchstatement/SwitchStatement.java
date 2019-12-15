package switchstatement;

public class SwitchStatement {

	public static void main(String[] args) {
		// define variable
		char grade = 'B';
		//use the switch statement to evaluate the grade
		switch(grade){
		case 'A':
			System.out.println("Excellent!"); break;
		case 'B':
			System.out.println("Good, keep up"); break;
		case 'C':
			System.out.println("you pass"); break;
		case 'D':
			System.out.println("Fail! you better try again"); break;
		default:
			System.out.println("Invalid grade!");
		}
      System.out.println("Your grade is: " +grade);
	}
}
