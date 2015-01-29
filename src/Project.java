/**
 * @author Tom Pickett
 *Program Description: Demo Files for COMP1011 Lesson 3
 *@version 0.2 - Added Vehicle Class
 */
public class Project {

	/**
	 * Main method for project
	 * @param args
	 */
	public static void main(String[] args) {
		SportsUtilityVehicle myHonda = new SportsUtilityVehicle("Black","Honda","Pilot","2015");
		
		Truck myFord = new Truck(6,3,"White","Ford","FX","2008");
		
		for(int seconds=0; seconds < 10; seconds++) {
			myHonda.accelerate();
			myFord.accelerate();
			}
		System.out.println("Vehicle Speed: " + myHonda.getSpeed());
		System.out.println("Truck Speed: " + myFord.getSpeed());
		
	}

}
