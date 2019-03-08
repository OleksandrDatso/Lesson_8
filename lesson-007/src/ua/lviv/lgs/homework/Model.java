package ua.lviv.lgs.homework;

public class Model extends Plane implements Opportunities {
	
	int maxSpeed;
	String color;
	
	public Model(int length, int width, int weight, int maxSpeed, String color) {
		super(length, width, weight);
		this.maxSpeed = maxSpeed;
		this.color = color;
	}
	public Model(int length, int width, int weight) {
		super(length, width, weight);
	}
	void moveUp() {
		double x = Math.random() * 100;
		System.out.println("Plane is moving up by " + x);
	}
	void moveDowm() {
		double x = Math.random() * 100;
		System.out.println("Plane is moving down by " + x);
	}
	void moveForward() {
		double x = Math.random() * 100;
		System.out.println("Plane is moving forward by " + x);
	}
	void moveBack() {
		double x = Math.random() * 100;
		System.out.println("Plane is moving back by " + x);
	}
	@Override
	public void turboBoost() {
		double turbo = maxSpeed + Math.random() * 1100;
		System.out.println("CY-27`s turbo speed is " + turbo + " miles per hour");
	}
	@Override
	public void stealthTechnology() {
		double invisible = Math.random() * 24;
		System.out.println("CY-27 is invisible " + invisible + " hours");
	}
	@Override
	public void nuclearStrike() {
		int missiles = (int) (Math.random() * 11);
		System.out.println("CY-27 dropped " + missiles + " bombs");
	}
}
