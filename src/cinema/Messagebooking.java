package cinema;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns={"/messagedata"})
public class Messagebooking extends HttpServlet {

	
	int numberClicked;

	//received from availability.java
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException,IOException {
		
		//this method is if user clicked on booked seat
		
		
		res.setContentType("text/html");
		
		PrintWriter outing = res.getWriter();

		//receives the seat number that user clicked on
		numberClicked=(int) req.getAttribute("userClick");
		
		//initializes a row and colomn variable
		int col;
		int row;
		
		//breaks down seat number user clicked on into rows and colomns
		col=numberClicked%10;
		row=(numberClicked-col)/10;
		
		//gets all the information of person who booked that unavailable Seat
		//and stores it in variables
		
		String dateBooked;
		dateBooked=Seatgrid.getWholeTheatre()[row][col].getDateBooked();
		
		String personName;
		personName=Seatgrid.getWholeTheatre()[row][col].getAudience().getName();
		
		String personPhone;
		personPhone=Seatgrid.getWholeTheatre()[row][col].getAudience().getPhone();
		
		String personAddress;
		personAddress=Seatgrid.getWholeTheatre()[row][col].getAudience().getAddress();
		
		String personEmail;
		personEmail=Seatgrid.getWholeTheatre()[row][col].getAudience().getEmail();
		
		//initializes html output
		outing.println("<!DOCTYPE html>");
		outing.println("<html>");
		outing.println("<head>");
		outing.println("<title>Insert title here</title>");
		outing.println("</head>");
		outing.println("<body>");
		outing.println("<h1>Information of person who booked this seat</h1>");
		
		//prints out information of person who booked the seat user clicked on
		outing.println("<div>");
		outing.println("Name: ");
		outing.println(personName);
		outing.println("<br>");
		outing.println("Phone: ");
		outing.println(personPhone);
		outing.println("<br>");
		outing.println("Address: ");
		outing.println(personAddress);
		outing.println("<br>");
		outing.println("Email: ");
		outing.println(personEmail);
		outing.println("<br>");
		outing.println("Date booked: ");
		outing.println(dateBooked);
		outing.println("</div>");
		outing.println("<br>");
		outing.println("<br>");
		
		//button for user to go back to Generator.java's doGet method
		//which shows the theatre's seats
		outing.println("<form action=\"genhtml\" method=\"get\">");
		outing.println("<input type = \"submit\" name = \"Firstpage\" value=\"Main\">");
		outing.println("</form>");
		
		//closes html
		outing.println("</body>");
		outing.println("</html>");
	}
}
