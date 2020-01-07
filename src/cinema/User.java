package cinema;

//class to store User details
public class User {

	//UserID
	private  String name;
	
	//user email
	private  String email;
	
	//user address
	private  String address;
	
	//user phone number
	private  String phone;

	 
	//constructors
	public User() {
		
	}
	
	public User(String nm,String mail,String add,String ph) {

		
		this.name=nm;
		this.email=mail;
		this.address=add;
		this.phone=ph;
		
		
	}
	
	//getters and setters of each variable
	
	
	public  void setName(String nm) {
		name=nm;
	}
	
	public  String getName() {
		return name;
	}
	
	public  void setEmail(String mail) {
		email=mail;
	}
	
	public  String getEmail() {
		return email;
	}
	
	public  void setAddress(String add) {
		address=add;
	} 
	
	public  String getAddress() {
		return address;
	}
	
	public  void setPhone(String ph) {
		phone=ph;

	}
	
	public  String getPhone() {
		return phone;
	}
	

}
