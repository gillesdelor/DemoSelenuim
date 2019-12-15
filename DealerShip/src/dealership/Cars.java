package dealership;

public class Cars {
	
	 //define variables
	protected  String color;
	protected int doors;
	protected String model;
	
	//default constructor
	public Cars (){
		
	}
		
    // parameterized constructor
	public Cars (String color, int doors, String model){
		this.color = color;
		this.doors = doors;
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getDoors() {
		return doors;
	}

	public void setDoors(int doors) {
		this.doors = doors;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}
	
	
	
	}
	
	
	
