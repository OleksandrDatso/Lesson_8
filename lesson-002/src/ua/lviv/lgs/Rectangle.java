package ua.lviv.lgs;

public class Rectangle {

	private int length;
	private int width;

	Rectangle() {
		this.length = 20;
		this.width = 12;
	}

	Rectangle(int length, int width) {
		this.length = length;
		this.width = width;
	}

	public void Perimetr() {
		int P = length + length + width + width;
		System.out.println("Периметр прямоугольника = " + P);
	}

	public void Square() {
		int S = length * width;
		System.out.println("Площадь прямоугольника = " + S);
	}

}
