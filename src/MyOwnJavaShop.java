
public class MyOwnJavaShop {

	public static void main(String[] args) {

		
		/* 
		 * (int Speed,double regularPrice,String color,) Car constructor
		 * (int Speed, double regularPrice, String color, int weight) Truck constructor NEVER USED
		 * (int Speed, double regularPrice, String color, int year, int manufacturerDiscount) Ford constructor
		 * (int Speed, double regularPrice, String color, int length) Sedan Constructor
		 */
		
		// instances
		Sedan varSedan = new Sedan(250, 25000, "Red", 21);
		Ford varFord1 = new Ford(220, 32000, "Black", 2020, 2000);
		Ford varFord2 = new Ford(175, 19000, "Black", 2019, 1000);
		Car varCar = new Car(400, 45000, "Neon Green");

		System.out.printf("The sale price of the Sedan is $%.2f", varSedan.getSalePrice());
		System.out.println();
		System.out.printf("The sale price of Ford1 is $%.2f", varFord1.getSalePrice());
		System.out.println();
		System.out.printf("The sale price of Ford2 is $%.2f", varFord2.getSalePrice());
		System.out.println();
		System.out.printf("The sale price of the Car is $%.2f", varCar.getSalePrice());

	}

}
