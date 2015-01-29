/**
 * @author Tom Pickett
 *Class Description: Creating vehicle class, to 
 * use as a super class, for all other vehicle
 * sub classes
 */
public abstract class Vehicle {
	
	//Private properties ***********************
	protected int numWheels = 4;
	protected int numDoors = 2;
	protected String colour = "";
	protected String make = "";
	protected String model = "";
	protected String year = "";
	protected float speed = 0;
	protected final int MAX_SPEED = 40;
	
	
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
		public Vehicle(int wheels, int doors, String colour, String make, String model, String year) {
			this.numWheels = wheels;
			this.numDoors = doors;
			this.colour = colour;
			this.make = make;
			this.model = model;
			this.year = year;
			
		}
	
		public Vehicle(String colour, String make, String model, String year) {
			this.colour = colour;
			this.make = make;
			this.model = model;
			this.year = year;
			
		}
	
	
	//Public Abstract Methods***********************
	//Must be overridden
	public abstract void accelerate();
	
	public abstract void decelerate();
	
	
	//Public Methods********************************
	public void turnLeft() {
		System.out.println("Turning left");
	}
	
	public void trunRight() {
		System.out.println("Turning Right");
	}
		
}
