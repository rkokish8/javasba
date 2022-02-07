
public class Sedan extends Car {
	
	// fields
	private int length;

	//constructors
	public Sedan(int Speed, double regularPrice, String color, int length) {
		super(Speed, regularPrice, color);
		this.length = length;
	}

	// methods
	public double getSalePrice() {
		if (length > 20) {
			return super.getSalePrice() - (0.05 * super.getSalePrice());
		} else {
			return super.getSalePrice() - (0.1 * super.getSalePrice());
		}
	}
}
