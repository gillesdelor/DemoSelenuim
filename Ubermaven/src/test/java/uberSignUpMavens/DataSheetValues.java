package uberSignUpMavens;

public class DataSheetValues {
	private String email;
	private String firstname;
	private String lastname;
	private String phoneNumber;
	private String password;

	// default constructor
	public DataSheetValues(){
		
	}
	//parametazised constructor
	public DataSheetValues(String value){
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}	   
}
