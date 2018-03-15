import java.util.ArrayList;

public class GarageMain {

	public static void main(String[] args) {
		
		Car c1 = new Car(22, "BMW", 20, 4);
		Motorbike m1 = new Motorbike(23, "Honda", 25, 2);
		Van v1 = new Van(24, "Renault", 21, 1000);
		Van v2 = new Van(24, "Renault", 21, 2000);
		
		Garage garage = new Garage();
		
		garage.addVehicle(c1);
		garage.addVehicle(m1);
		garage.addVehicle(v1);
		garage.addVehicle(v2);
		
		
		
		System.out.println(garage.getList());
		
		System.out.println(garage.bill(c1));
		
		System.out.println(garage.removevehicle(c1));
		
        System.out.println(garage.bill(m1));
		
		System.out.println(garage.removevehicle(m1));
		
        System.out.println(garage.bill(v1));
		
		System.out.println(garage.removevehicle(v1));
		
		System.out.println(garage.emptygarage());
		
	}

}

