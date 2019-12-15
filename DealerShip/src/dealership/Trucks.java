	package dealership;

public class Trucks extends Cars {
	
	//define variables;
	int cylinder;
	
	public int getCylinder() {
		return cylinder;
	}

	public void setCylinder(int cylinder) {
		this.cylinder = cylinder;
	}

	//super class constructor
	public Trucks (String color, int doors, String model){
		super (color, doors, model);
	}

	public Trucks(){
		
	}
}
