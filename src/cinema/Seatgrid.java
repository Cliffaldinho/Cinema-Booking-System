package cinema;

import cinema.Seat;

//class to store whole theatre's seats 
public class Seatgrid {


	//2d array made out of Seat objects
	//is static variable
	private static Seat[][] wholeTheatre;
	
	//static constructor for the 2d array
	static {
		wholeTheatre= new Seat[9][9];
		for(int i=0;i<9;i++) {
			for (int j=0;j<9;j++) {
				wholeTheatre[i][j]= new Seat();
			}
		}
	}
	
	//constructor
	public Seatgrid() {
		
		
	}
	
	//getters and setters for variables
	public static void setWholeTheatre(Seat[][] theatre) {
		wholeTheatre=theatre;
	}
	
	public static Seat[][] getWholeTheatre() {
		return wholeTheatre;
	}
	
	//method to set the seat of User, with corresponding row and colomn
	public static void setSeat(Seat audience,int row, int col) {
		wholeTheatre[row][col]=audience;
	}
	
}
