
public class Motorbike extends Vehicle {

	private int numberofwheels;

	public Motorbike(int year, String brand, int fuelconsumption, int numberofwheels) {
		super(year, brand, fuelconsumption);

		this.numberofwheels = numberofwheels;

	}

	public int getnumberofwheels;

	public String toString() {

		return "Year: " + year + " Brand: " + brand + " Fuel Consumption: " + fuelconsumption + " Number of Wheels:"
				+ numberofwheels;
	}

	public int getnumberofwheels() {

		return numberofwheels;
	}
}
