package cinema;

import cinema.User;

//class to store information of each seat
public class Seat {

	//store date booked of seat
	private String dateBooked;
	
	//store User that booked the seat
	private User audience;
	
	//store is seat available or not
	private boolean isAvailable;

	//constructors
	public Seat() {
		
		audience= new User();
		isAvailable=true;

	}
	
	public Seat (String date, User person, boolean avail) {

		this.dateBooked=date;
		this.audience=person;
		this.isAvailable=avail;

	}
	
	
	//getters and setters of each variable
	
	public void setDateBooked(String date) {
		dateBooked=date;
	}
	
	public String getDateBooked() {
		return dateBooked;
	}
	
	public void setAudience(User person) {
		audience=person;
	}
	
	public User getAudience() {
		return audience;
	}
	
	public void setIsAvailable(boolean available) {
		isAvailable=available;
	}
	
	public boolean getIsAvailable() {
		return isAvailable;
	}
	
}
