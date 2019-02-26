package ua.lviv.lgs.homework.part2;

public class Application_part_2 {
	public static void main(String[] args) {
		Car car = new Car(1500000, "Sport Car");
		System.out.println(car);

		Car car2 = new Car(20000000, "Luxury", "Modern", "Standard", "Comfortable");
		System.out.println(car2);
	}
}
