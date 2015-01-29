/**
 * @author Tom Pickett
 *Class Description: Creating vehicle class, to 
 * use as a super class, for all other vehicle
 * sub classes
 */
public class Vehicle {
	
	//Private properties ***********************
	private int numWheels = 4;
	private int numDoors = 2;
	private String colour = "";
	private String make = "";
	private String model = "";
	private String year = "";
	private float speed = 0;
	private final int MAX_SPEED = 40;
	
	
	//Getters **************************************
	public int getNumWheels() {
		return this.numWheels;
	}


	public int getNumDoors() {
		return this.numDoors;
	}


	public String getColour() {
		return this.colour;
	}


	public String getMake() {
		return this.make;
	}


	public String getModel() {
		return this.model;
	}


	public String getYear() {
		return this.year;
	}
	
	public float getSpeed() {
		return this.speed;
	}
	
	
	//Constructor *********************************
	public Vehicle() {
		
	}
	
	
	//Public Methods********************************
	public void accelerate() {
		this.speed += 4;
		if(this.speed >= this.MAX_SPEED) {
			this.speed = this.MAX_SPEED;
		}
	}
	
	public void decelerate() {
		this.speed -= 6;
		if(this.speed < 0) {
			this.speed = 0;
		}
	}
	
	public void turnLeft() {
		System.out.println("Turning left");
	}
	
	public void trunRight() {
		System.out.println("Turning Right");
	}
		
}
