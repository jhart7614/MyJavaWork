import java.util.ArrayList;

public class Garage {

	private static ArrayList<Vehicle> vehiclelist = new ArrayList<Vehicle>();

	public void addVehicle(Vehicle Vehicle) {

		vehiclelist.add(Vehicle);

	}

	public ArrayList<Vehicle> getList() {

		return vehiclelist;
	}

	public int bill(Vehicle specificVehicle) {
		for (Vehicle vehicle : vehiclelist) {
			
			if(vehicle == specificVehicle) {
				
			if (vehicle instanceof Car) {

				Car testCar = (Car) vehicle;
				return testCar.getnumberofpassengers() * 10;

			}
			if (vehicle instanceof Motorbike) {

				Motorbike testMotor = (Motorbike) vehicle;
				return testMotor.getnumberofwheels() * 10;

			}
			if (vehicle instanceof Van) {

				
				Van testMotor = (Van) vehicle;
				return testMotor.getweight() * 10;

			}
			}
		}
		return 0;
	}
	
	public ArrayList<Vehicle> emptygarage() {
	
		vehiclelist.clear();
		return vehiclelist;
		
	}
	
	public ArrayList<Vehicle> removevehicle(Vehicle Vehicle) {
		
		vehiclelist.remove(Vehicle);
		return vehiclelist;
		
	}
	}

