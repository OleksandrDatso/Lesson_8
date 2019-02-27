package ua.lviv.lgs.homework.part2;

public class Application_part_2 {
	public static void main(String[] args) {
		Car car1 = new Car(1500000, "Sport");
		System.out.println(car1);
		
		Car car2 = new Car(2000000, "Luxury", "leather", "Standard", "Comfortable");
		car2.setCost(3356000);
		System.out.println(car2);
	}
}
