package wikipediasearch;

public class DataSheetValues {
	
	//declare variables;
	private String value;
	
   // default constructor
   public DataSheetValues(){
	
} 	
	//parametarized constructor
   public DataSheetValues (String value){
	this.value = value;		
}

 //get the value
    public String getValue() {
	return value;
}
 // set the value
   public void setValue(String value) {
	this.value = value;
}
}
