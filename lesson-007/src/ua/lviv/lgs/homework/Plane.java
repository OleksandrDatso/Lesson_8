package ua.lviv.lgs.homework;

public abstract class Plane {
	
	int length;
	int width;
	int weight;
	
	void engineStart() {
		int x = (int) (20 + Math.random() * 69);
		System.out.println("Time to get ready to fly in " + x + " minutes");
	}
	void start() {
		double x = Math.random() * 1000;
		System.out.println("Flying with full fuel " + x + " miles");
	}
	void landing() {
		System.out.println("Plane is landing");
	}
	
	public Plane(int length, int width, int weight) {
		super();
		this.length = length;
		this.width = width;
		this.weight = weight;
	}
	
	
}
