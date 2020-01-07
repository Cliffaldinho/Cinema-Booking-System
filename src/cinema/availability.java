package cinema;
import javax.servlet.http.*;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.*;
import java.io.PrintWriter;
import java.io.IOException;
import javax.servlet.http.HttpServletRequest;


@WebServlet(urlPatterns={"/available"})
public class availability extends HttpServlet {

	//variable to store which button user clicked
	int userClick;
	
	@Override
	public void init() throws ServletException {
		
		//initializes variable
		userClick=0;
	}
	
	//doPost method. Received from table.html, and Generator.java
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException,ServletException {
		
		//Starts a printwriter
		PrintWriter outing;
		outing=res.getWriter();
		
		//gets the parameter of the first row
		String firstRow= req.getParameter("A");
		
		//if one of the values in the parameter was clicked
		if(firstRow!=null) {
		
		//get the value clicked,
			//and store it as the seat that user clicked
		if(firstRow.equals("A1")) {
			
			userClick=11;
		}
		else if (firstRow.equals("A2")) {
			
			userClick=12;
		}
		else if(firstRow.equals("A3")) {
			
			userClick=13;
		} 
		else if (firstRow.equals("A4")) {
			
			userClick=14;
		} 
		else if (firstRow.equals("A5")) {
		
			userClick=15;
		}
		else if (firstRow.equals("A6")) {
		
			userClick=16;
		} 
		else if (firstRow.equals("A7")) {
		
		    userClick=17;
		}
		else if (firstRow.equals("A8")) {
			
			userClick=18;
		}
		
		} else {
			outing.println("First Row is null.");
		}
		  
		
		//gets the parameter of the second row.
		//and does the same thing as aforementioned.
		//for all 8 rows
		String secondRow = req.getParameter("B");
		
		if(secondRow!=null) {
			if(secondRow.equals("B1")) {
			
				userClick=21;
			}
			else if (secondRow.equals("B2")) {
			
				userClick=22;
			}
			else if (secondRow.equals("B3")) {
			
				userClick=23;
			}
			else if (secondRow.equals("B4")) {
			
				userClick=24;
			}
			else if (secondRow.equals("B5")) {
			
				userClick=25;
				
			}
			else if (secondRow.equals("B6")) {
			
				userClick=26;
			} 
			else if (secondRow.equals("B7")) {
			
				userClick=27;
			}
			else if (secondRow.equals("B8")) {
				
				userClick=28;
			}
			
			
		} else {
			outing.println("Second Row is null.");
		}
		
		
		
		
		String thirdRow=req.getParameter("C");
		
		if(thirdRow!=null) {
			if(thirdRow.equals("C1")) {
				userClick=31;
			}
			else if (thirdRow.equals("C2")) {
				userClick=32;
			}
			else if (thirdRow.equals("C3")) {
				userClick=33;
			}
			else if (thirdRow.equals("C4")) {
				userClick=34;
			}
			else if (thirdRow.equals("C5")) {
				userClick=35;
				
			}
			else if (thirdRow.equals("C6")) {
				userClick=36;
			} 
			else if (thirdRow.equals("C7")) {
				userClick=37;
			}
			else if (thirdRow.equals("C8")) {
				userClick=38;
			}
			
			
		} else {
			outing.println("Third Row is null.");
		}
		
		
		
String fourthRow=req.getParameter("D");
		
		if(fourthRow!=null) {
			if(fourthRow.equals("D1")) {
				userClick=41;
			}
			else if (fourthRow.equals("D2")) {
				userClick=42;
			}
			else if (fourthRow.equals("D3")) {
				userClick=43;
			}
			else if (fourthRow.equals("D4")) {
				userClick=44;
			}
			else if (fourthRow.equals("D5")) {
				userClick=45;
				
			}
			else if (fourthRow.equals("D6")) {
				userClick=46;
			} 
			else if (fourthRow.equals("D7")) {
				userClick=47;
			}
			else if (fourthRow.equals("D8")) {
				userClick=48;
			}
			
			
		} else {
			outing.println("Fourth Row is null.");
		}
		
		
String fifthRow=req.getParameter("E");
		
		if(fifthRow!=null) {
			if(fifthRow.equals("E1")) {
				userClick=51;
			}
			else if (fifthRow.equals("E2")) {
				userClick=52;
			}
			else if (fifthRow.equals("E3")) {
				userClick=53;
			}
			else if (fifthRow.equals("E4")) {
				userClick=54;
			}
			else if (fifthRow.equals("E5")) {
				userClick=55;
				
			}
			else if (fifthRow.equals("E6")) {
				userClick=56;
			} 
			else if (fifthRow.equals("E7")) {
				userClick=57;
			}
			else if (fifthRow.equals("E8")) {
				userClick=58;
			}
			
			
		} else {
			outing.println("Fifth Row is null.");
		}
		
		
		
		
String sixthRow=req.getParameter("F");
		
		if(sixthRow!=null) {
			if(sixthRow.equals("F1")) {
				userClick=61;
			}
			else if (sixthRow.equals("F2")) {
				userClick=62;
			}
			else if (sixthRow.equals("F3")) {
				userClick=63;
			}
			else if (sixthRow.equals("F4")) {
				userClick=64;
			}
			else if (sixthRow.equals("F5")) {
				userClick=65;
				
			}
			else if (sixthRow.equals("F6")) {
				userClick=66;
			} 
			else if (sixthRow.equals("F7")) {
				userClick=67;
			}
			else if (sixthRow.equals("F8")) {
				userClick=68;
			}
			
			
		} else {
			outing.println("Sixth Row is null.");
		}
		
		
		
		
String seventhRow=req.getParameter("G");
		
		if(seventhRow!=null) {
			if(seventhRow.equals("G1")) {
				userClick=71;
			}
			else if (seventhRow.equals("G2")) {
				userClick=72;
			}
			else if (seventhRow.equals("G3")) {
				userClick=73;
			}
			else if (seventhRow.equals("G4")) {
				userClick=74;
			}
			else if (seventhRow.equals("G5")) {
				userClick=75;
				
			}
			else if (seventhRow.equals("G6")) {
				userClick=76;
			} 
			else if (seventhRow.equals("G7")) {
				userClick=77;
			}
			else if (seventhRow.equals("G8")) {
				userClick=78;
			}
			
			
		} else {
			outing.println("Seventh Row is null.");
		}
		
		
String eighthRow=req.getParameter("H");
		
		if(eighthRow!=null) {
			if(eighthRow.equals("H1")) {
				userClick=81;
			}
			else if (eighthRow.equals("H2")) {
				userClick=82;
			}
			else if (eighthRow.equals("H3")) {
				userClick=83;
			}
			else if (eighthRow.equals("H4")) {
				userClick=84;
			}
			else if (eighthRow.equals("H5")) {
				userClick=85;
				
			}
			else if (eighthRow.equals("H6")) {
				userClick=86;
			} 
			else if (eighthRow.equals("H7")) {
				userClick=87;
			}
			else if (eighthRow.equals("H8")) {
				userClick=88;
			}
			
			
		} else {
			outing.println("Eighth Row is null.");
		}
		
		//after all 8 rows are scanned
		//variable userClick has a number, which represents button user clicked
		
		//initialize two variables to find colomn and row
		int theColomn;
		int theRow;
		
		//gets the colomn and row of button (seat) that user clicked
		theColomn = userClick%10;
		theRow=(userClick-theColomn)/10;
		
		//initializes a boolean variable to check if that seat is available
		boolean place;
		place=Seatgrid.getWholeTheatre()[theRow][theColomn].getIsAvailable();
		
		//if seat is not available
		if(place==false) {
			
			//RequestDispatcher reroutes to Messagebooking.java's doPost method
			//while including the seat number that user clicked
			req.setAttribute("userClick", userClick);
			RequestDispatcher reqData = getServletContext().getRequestDispatcher("/messagedata");
			reqData.forward(req, res);
		} 
		
		//else if seat is available
		else {
		
			//RequestDispatcher reroutes to formInfo.java's doPost method
			//while including the seat number that user clicked
		req.setAttribute("userClick", userClick);
		RequestDispatcher reqForm=getServletContext().getRequestDispatcher("/info");
		reqForm.forward(req, res);
		}
		
	}
	
}
