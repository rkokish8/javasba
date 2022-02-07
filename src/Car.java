
public class Car {
	
	//Super class

	// fields
	protected int speed;
	protected double regularPrice;
	protected String color;

	// constructors
	public Car() {
	}

	public Car(int speed, double regularPrice, String color) {
		this.speed = speed;
		this.regularPrice = regularPrice;
		this.color = color;
	}

	// methods
	public double getSalePrice() {
		 return regularPrice;

	}

}
