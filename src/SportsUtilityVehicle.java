/**
 * 
 */

/**
 * @author Tom Pickett
 *
 */
public class SportsUtilityVehicle extends Vehicle {

	//Constructor **********************************
	public SportsUtilityVehicle(String colour, String make, String model,
			String year) {
		super(colour, make, model, year);
		
		this.numDoors = 5;
	}

	//Over ridden Methods **********************
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
