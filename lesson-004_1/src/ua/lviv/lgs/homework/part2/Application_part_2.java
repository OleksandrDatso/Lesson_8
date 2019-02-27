package ua.lviv.lgs.homework.part2;

public class Application_part_2 {
	public static void main(String[] args) {
		Car car1 = new Car(1500000, "Sport");
		System.out.println(car1);
		
		Car car2 = new Car(2000000, "Luxury", "leather", "Standard", "Comfortable", 12);
		car2.setCost(3356000);
		System.out.println(car2);
		
		car2.setWheelSize(45);
		System.out.println("WheelSize = " + car2.getWheelSize());
		
		car2.setWheel("superWheel");
		System.out.println(car2);
	}
}
