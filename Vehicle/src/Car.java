
public class Car extends Vehicle {
	
	private int numberofpassengers;

	public Car(int year, String brand, int fuelconsumption, int numberofpassengers) {
		super(year, brand, fuelconsumption);
		
		this.numberofpassengers = numberofpassengers;
	}
	
	public int getnumberofpassengers;
	
public String toString() {
		
		return "Year: " + year + " Brand: " + brand + " Fuel Consumption: " + fuelconsumption + " Number of Passengers:" + numberofpassengers;
	}
	
public int getnumberofpassengers() {

	return numberofpassengers;
}
}
