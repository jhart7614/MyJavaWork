
public class Van extends Vehicle {

	private int weight;

	public Van(int year, String brand, int fuelconsumption, int weight) {
		super(year, brand, fuelconsumption);

		this.weight = weight;

	}

	public int getweight;

	public String toString() {

		return "Year: " + year + " Brand: " + brand + " Fuel Consumption: " + fuelconsumption + " Weight:" + weight;
	}

	public int getweight() {

		return weight;
	}
}
