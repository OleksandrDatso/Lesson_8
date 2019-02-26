package ua.lviv.lgs.homework.part3;

public class Application_part_3 {
	public static void main(String[] args) {
		Animal animal = new Animal("Леопард", 20, 7);
		String animalName = animal.getName();
		int animalSpeed = animal.getSpeed();
		int animalAge = animal.getAge();
		
		System.out.println("Назва тварини = " + animalName + ", Швидкість тварини = " + animalSpeed + " км/год, Вік тварини = " + animalAge + " років ");
		System.out.println("-----------------------------------------------------------------------------");
		
		animal.setName("Бик");
		animal.setSpeed(2);
		animal.setAge(14);
		
		System.out.println("Назва тварини = " + animal.getName() + ", Швидкість тварини = " + animal.getSpeed() + " км/год, Вік тварини = " + animal.getAge() + " років ");
	}
}
