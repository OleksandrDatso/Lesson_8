package ua.lviv.lgs.homework_part5;

public class Main {
	public static void main(String[] args) {
		Object object = new Frog();
		Amphibia frog = (Amphibia) object;
		
		frog.eat();
		frog.sleep();
		frog.swim();
		frog.walk();
		
	}
}
