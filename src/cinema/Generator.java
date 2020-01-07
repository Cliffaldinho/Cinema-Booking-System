package cinema;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.*;
import javax.servlet.ServletException;
 

@WebServlet(urlPatterns={"/genhtml"})
public class Generator extends HttpServlet {

	//receives from formInfo.java, or Messagebooking.java or messageOverbooked.java
	//formInfo.java stores form details
	//Messagebooking.java outputs information of person who booked the booked seat
	//messageOverbooked.java outputs error message that user can't book more than 3 seats
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException,IOException {
	
		//this method uses java generated html
		//to output the 8x8 theatre grid
		//where user can see which seats are booked and not booked
		//and can click on those seats
		
		//set content type to html
		res.setContentType("text/html");
		
		//initalizes a new printwriter
		PrintWriter out = res.getWriter();
		
		//initializes html page
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<title>Insert title here</title>");
		out.println("<link rel = \"stylesheet\" href=\"tablestyle.css\">");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>Main Page</h1>");
		
		//initializes a form
		//sets it's action to go to availability.java's doPost method
		out.println("<form action=\"available\" method=\"post\">");
		
		//initializes a table
		out.println("<table>");
		
		//first row of table containing numbers
		out.println("<tr></tr>");
		out.println("<th></th>");
		out.println("<th>1</th>");
		out.println("<th>2</th>");
		out.println("<th>3</th>");
		out.println("<th>4</th>");
		out.println("<th>5</th>");
		out.println("<th>6</th>");
		out.println("<th>7</th>");
		out.println("<th>8</th>");
		out.println("<tr></tr>");
		

		//initializes a boolean variable to store which seats are available, which seats are not
		boolean seatMarker;
		
		//initializes an array to store alphabets A-H
		String alphabetArray[] = new String[8];
		alphabetArray[0]= "A";
		alphabetArray[1]="B";
		alphabetArray[2]="C";
		alphabetArray[3]="D";
		alphabetArray[4]="E";
		alphabetArray[5]="F";
		alphabetArray[6]="G";
		alphabetArray[7]="H";
		
		//for 8 times
		for(int a=0;a<8;a++) {
			
			//outputs each row (A,B,C...,H)
			out.println("<td>"+alphabetArray[a]+"</td>");
			
			//for 8 times
			for(int i=1;i<=8;i++) {

				//boolean variable stores if that seat is available
				seatMarker=Seatgrid.getWholeTheatre()[a+1][i].getIsAvailable();
				
				//if it is available
				if(seatMarker==true) 
				{
					//style it using css avail class (green background color)
					out.println("<td class=\"avail\"><input type = \"submit\" name = \""+alphabetArray[a]+"\" value=\""+alphabetArray[a]+i+"\"></td>");
				
					
				}
				
				//if it is not available
				else if (seatMarker==false) {
				
					//style it using css unavail class (red background color)
					out.println("<td class=\"unavail\"><input type = \"submit\" name = \""+alphabetArray[a]+"\" value=\""+alphabetArray[a]+i+"\"></td>");
				}
				
			}
			out.println("<tr></tr>");
			//completes the row
		}
		//completes all the rows
		
		out.println("</table>");
		out.println("</form>");
		
		//completes the table 
		
		
		out.println("<br>");
		
		//outputs current time and date for user to see
		out.println("<p>Current Time</p>");
		out.println("<p id=\"time\"></p>");
		out.println("<p id=\"seconds\"></p>");
		out.println("<script>");
		out.println("var currentDate = new Date();");
		out.println("var dateTime = currentDate.getDate()+ \"/\"+ (currentDate.getMonth()+1) + \"/\"+ currentDate.getFullYear();");
		out.println("var theSeconds = currentDate.getHours()+\":\"+currentDate.getMinutes()+\":\"+currentDate.getSeconds();");
		out.println("document.getElementById(\"time\").innerHTML = dateTime;");
		out.println("document.getElementById(\"seconds\").innerHTML = theSeconds;");
		out.println("</script>");
		
		//completes html
		out.println("</body>");
		out.println("</html>");

		
	}
	
}
