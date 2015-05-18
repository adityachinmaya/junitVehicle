import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.UUID;

import org.junit.Test;


public class JunitVehicle {

	@Test
	public void test() {
		HashMap MAP = new HashMap();
		UUID z = UUID.randomUUID();
		Person a = new Person("Chinmaya" , "Aditya" , z);
		MAP.put(z, a);
		Car car = new Car("Toyota","Blue",3200, a);
		car.setNumberOfDoors(4);
		Truck T = new Truck("Chevy","Blue",6000, a);
		T.setNumberOfAxels(2);
		
		UUID m = UUID.randomUUID();
		Person b = new Person("derpDerp","Derp", y);
		MAP.put(m, b);
		T.transferOwnership(b);
		MotorCycle mo = new MotorCycle("ducatti", "black", 4000, null);
		mo.setHasSideCar(false);
		
	}

}
