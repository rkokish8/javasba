
public class Ford extends Car {

	// fields
	protected int year;
	protected int manufacturerDiscount;

	// constructors
	public Ford(int Speed, double regularPrice, String color, int year, int manufacturerDiscount) {
		super(Speed, regularPrice, color);
		this.year = year;
		this.manufacturerDiscount = manufacturerDiscount;
	}

	// methods
	public double getSalePrice() {
		return (super.getSalePrice() - manufacturerDiscount);
	}
}