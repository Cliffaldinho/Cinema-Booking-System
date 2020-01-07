package cinema;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.*;
import javax.servlet.*;

@WebServlet(urlPatterns={"/overbooked"})
public class messageOverbooked extends HttpServlet {

	//receives from formInfo.java's doGet method
	//when user has already booked 3 seats
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException,IOException {
		
		//outputs html with printwriter
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<title>Insert title here</title>");
		out.println("</head>");
		out.println("<body>");
		
		//sends out error message that already booked 3 seats
		out.println("<h1>Overbooked error</h1>");
		out.println("<p>");
		out.println("Error: Maximum 3 bookings allowed for one user (Username disregards capital letters, i.e. Mark is same as mark).");
		out.println("</p>");
		
		//button for user to go back to generator.java
		//where theatre seats are shown
		out.println("<form action=\"genhtml\" method=\"get\">");
		out.println("<input type = \"submit\" name = \"Homepage\" value=\"Main\">");
		out.println("</form>");
		
		
		out.println("</body>");
		out.println("</html>");
	}
}
