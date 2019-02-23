package ua.lviv.lgs;

public class Circle {
	private double radius;
	private double diameter;

	Circle(double diameter, double radius) {
		this.diameter = diameter;
		this.radius = radius;
	}

	Circle(double radius) {
		this.radius = radius;
	}

	public void Square() {
		double S = 3.14 * radius * radius;
		System.out.println("Площадь круга = " + S);
	}

	public void Length() {
		double L = 2 * 3.14 * radius;
		System.out.println("Длина окружности = " + L);
	}
}
