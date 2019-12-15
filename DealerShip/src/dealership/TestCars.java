package dealership;

public class TestCars {

	public static void main(String[] args) {
		//create an instance of the Trucks class
		Trucks truck = new Trucks();
		// set truck info for Ford
		setTruckInfo(truck, "Ford F150", "White", 4, 6);
		//display truck info
		displayInventory(truck);
		
		Trucks toyo=new Trucks("yellow", 4,"camry");
		toyo.setCylinder(1988);
		System.out.println(toyo.getCylinder());
		
		// set truck info for Toyota
				setTruckInfo(truck, "Toyota Tacoma", "Yellow", 2, 6);
				//display truck info
				displayInventory(truck);
				
				// set truck info for Chevy
				setTruckInfo(truck, "Chevelet Silverado", "Black", 4, 6);
				//display truck info
				displayInventory(truck);
	}
		// this method set the truck info
		public static void setTruckInfo(Trucks truck, String model, String color, int doors, int cylinder){
			truck.setModel(model);
			truck.setColor(color);
			truck.setDoors(doors);
			truck.setCylinder(cylinder);
			
		}
		
		
		// this method displays the truck info
		public static void displayInventory(Trucks truck){
			// display the truck info
			System.out.println("Truck Model: "+truck.getModel());
			System.out.println("Truck color: "+truck.getColor());
			System.out.println("Number of door: "+truck.getDoors());
			System.out.println("Cylinder: "+truck.getCylinder());
			System.out.println();
			
		}

}
