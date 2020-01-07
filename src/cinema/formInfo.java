package cinema;
import javax.servlet.http.*;
import java.util.*;
import java.text.*;



import java.io.PrintWriter;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.RequestDispatcher;

import javax.servlet.annotation.*;
 
@WebServlet(urlPatterns={"/info"})
public class formInfo extends HttpServlet {
	
//variable to store seat user clicked
int number;
	
//doPost method. Received from availability.java.
public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		
		//gets the seat number that user has clicked
		//stores it in the formInfo class
		number=(int) req.getAttribute("userClick");
		
		//RequestDispatcher reroutes to booking.html
		RequestDispatcher dispatchForm =req.getRequestDispatcher("booking.html");
		dispatchForm.forward(req, res);
		
	}
	
	//doGet method. Received from booking.html, once passed validation
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		
		//variables to hold userID, phone, address, email entered in form
		String formId;
		String formPhone;
		String formAddress;
		String formEmail;
		
		//store userID, phone, address, email, in formID
		formId=req.getParameter("id");
		formPhone=req.getParameter("phone");
		formAddress=req.getParameter("address");
		formEmail=req.getParameter("email");
		
		//getPrintWriter
		PrintWriter printForm;
		printForm=res.getWriter();
		
		//initializes colomn and row variables
		int col;
		int row;
		
		//gets the seat number that user has clicked
		//from the variable number
		//which received data in the doPost method.
		col=number%10;
		row=(number-col)/10;
		//gets the colomn and row of that seat
		
		//initializes a temporary variable to hold a string
		String tempNameHolder;
		
		//initializes a counter to count names
		int nameCounter=0;
		
		//traverses through the whole theatre
		for(int i=1;i<=8;i++) {
			for(int j=1;j<=8;j++) {
				
				//gets the name of the user in each seat
			tempNameHolder=Seatgrid.getWholeTheatre()[i][j].getAudience().getName();
			
			//if it's same as the userID entered in the form
			if(formId.equalsIgnoreCase(tempNameHolder)) {
				
				//add 1 to the counter
				nameCounter++;
			}
			
			}
		}
		
		//if the counter is more than or equal to 3
		//shows an error message that can't book more than 3 bookings.
		if(nameCounter>=3) {
			
			//RequestDispatcher reroutes to messageOverbooked.java (which will display the error message)
			RequestDispatcher dispatchOverbooked = req.getRequestDispatcher("overbooked");
			dispatchOverbooked.forward(req, res);
		} 
		
		//else if the counter is less than 3
		else {
		
			//store user details for that seat
			
			//before storing user details for that seat
			//check to see if user has booked prior seats
			
			//initializes variable to store name
		String checkName;
		
		//traverses through the whole theatre
		for(int i=1;i<=8;i++) {
			for(int j=1;j<=8;j++) {
				
				//gets each seat's userID
				checkName=Seatgrid.getWholeTheatre()[i][j].getAudience().getName();
				
				//if userID of that seat is same as userID in the form
				if(formId.equalsIgnoreCase(checkName)) {
					
					//update information (phone, address, email), of that user, in that other seat
					//based off the new information in the form
					Seatgrid.getWholeTheatre()[i][j].getAudience().setPhone(formPhone);
					Seatgrid.getWholeTheatre()[i][j].getAudience().setAddress(formAddress);
					Seatgrid.getWholeTheatre()[i][j].getAudience().setEmail(formEmail);
				}
				
			}
		}
		
		//initializes a new User object
		User userOne = new User();
		
		//sets name, phone, address, email
		userOne.setName(formId);
		userOne.setPhone(formPhone);
		userOne.setAddress(formAddress);
		userOne.setEmail(formEmail); 
		
		//initializes a new Seat object
		Seat seatOne = new Seat();
		
		//sets User that sits in that Seat
		seatOne.setAudience(userOne);
		//sets availability of that Seat to false
		seatOne.setIsAvailable(false);
		
		//gets current date and time
		Date aDate = new Date();
		DateFormat aDateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		String storeDate;
		storeDate = aDateFormat.format(aDate);
		
		//stores it in information of that Seat
		seatOne.setDateBooked(storeDate);
		
		//stores the Seat in theatre
		//with the corresponding seat row and seat colomn that user clicked on
		Seatgrid.setSeat(seatOne, row, col);
	
		//RequestDispatcher reroutes to Generator.java's doGet method
		RequestDispatcher dispatchBooking = req.getRequestDispatcher("genhtml");
		dispatchBooking.forward(req, res);
		
		}
	}
	
}
