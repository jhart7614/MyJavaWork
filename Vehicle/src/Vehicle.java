
public abstract class Vehicle {

	public int year;
	public String brand;
	public int fuelconsumption;

	public Vehicle(int year, String brand, int fuelconsumption) {

		this.year = year;
		this.brand = brand;
		this.fuelconsumption = fuelconsumption;

	}

	public int getyear() {

		return year;
	}

}
