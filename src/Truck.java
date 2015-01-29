/**
 * @author Tom Pickett
 *
 */
public class Truck extends Vehicle {

	
	//Constructors *******************************
	public Truck(int wheels, int doors, String colour, String make,
			String model, String year) {
		super(wheels, doors, colour, make, model, year);
		
		checkNumDoors();
	}

	
	//Private Methods***************************
	private void checkNumDoors() {
		if(this.numDoors < 3) {
			this.numDoors = 3;
		}
	}
	
	//OverRidden Public Methods ****************
	@Override
	public void accelerate() {
		this.speed += 2;
		if(this.speed >= this.MAX_SPEED) {
			this.speed = this.MAX_SPEED;
		}
	}
	
	@Override
	public void decelerate() {
		this.speed -= 3;
		if(this.speed < 0) {
			this.speed = 0;
		}
	}
	
}