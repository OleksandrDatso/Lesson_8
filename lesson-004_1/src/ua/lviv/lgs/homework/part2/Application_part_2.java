package ua.lviv.lgs.homework.part2;

public class Application_part_2 {
	public static void main(String[] args) {
		Car car = new Car(2000000, "Sport", new SteeringWheel("leather", 45), new Wheel(205, "new Model"), new Body(140, "Yellow"));
		car.changeCar();
		System.out.println(car);
		System.out.println();
		
		Car car2 = new Car(2000000, "Sport", new SteeringWheel("leather", 45), new Wheel(205, "new Model"), new Body(140, "Yellow"));
		System.out.println(car2);
		System.out.println();

		car2.getBody().setColor("Blue");
		car2.getWheel().setDiameter(197);
		car2.getWheel().setModel("SuperModel");
		car2.getSteeringWheel().setMaterial("unknown");
		car2.setType("Luxury");
		car2.setCost(2250000);
		System.out.println(car2);

	}
}
