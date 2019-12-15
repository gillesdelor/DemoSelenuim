package selectionstructure;

public class MultipleGradeSelectionStructure {

	public static void main(String[] args) {
		// define variable
		char grade = 'B';
		// use the multiple selection structure to display grade
		if (grade == 'A'){
			System.out.println("Excellent!");
			
		}else if (grade == 'B'){
			System.out.println("Good, keep up ");
			
		}else if (grade == 'C'){
			System.out.println("You pass !");	
				
		}else if (grade == 'D'){
			System.out.println("You better try again!");
			
		}else{
			System.out.println("Invalid grade");

		}
	}

}
