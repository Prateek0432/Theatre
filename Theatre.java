import java.time.LocalDate;

public class Theatre {
	public static void main(String[] args) {
		
		TheatreDetails theatre1= new TheatreDetails();
		TheatreDetails theatre2= new TheatreDetails();
		TheatreDetails theatre3= new TheatreDetails();
		TheatreDetails theatre4= new TheatreDetails();
		
		
		theatre1.setDetails(1,1, "PVR", "Lucknow", 2004, 12, 25);
		theatre2.setDetails(1,5, "PVR", "Lucknow", 2004, 12, 25);
		theatre3.setDetails(2,5, "Phoenix", "Delhi", 2002, 11, 23);
		theatre4.setDetails(3,5, "Cinepolis", "Mumbai", 2000, 07, 05);		
		
		theatre1.printDetails();
		theatre2.printDetails();
		theatre3.printDetails();
		theatre4.printDetails();
		
	}
}

class TheatreDetails{
	int theatreID,screedID;
	String theatreName, theatreLocation;
	LocalDate theatreOpeningDate;
	public void setDetails(int tID,int sID, String tName, String tLocation , int year, int month, int day) {
		theatreID= tID;
		screedID=sID;
		theatreName=tName;
		theatreLocation=tLocation;
		theatreOpeningDate = LocalDate.of(year, month, day);
	}
	public void printDetails() {
		System.out.println("Welcome to Theatre Menu");
		System.out.println("Theatre Id: "+theatreID);
		System.out.println("Screen Id: "+screedID);
		System.out.println("Theatre Name: "+theatreName);
		System.out.println("Theatre Location: "+theatreLocation);
		System.out.println("Theatre Opoening Date: "+theatreOpeningDate);
		System.out.println("------**********--------");
	}
}
