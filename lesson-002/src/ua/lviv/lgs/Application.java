package ua.lviv.lgs;

public class Application {

	public static void main(String[] args) {

		Rectangle r1 = new Rectangle(16, 4);
		r1.Perimetr();
		r1.Square();

		System.out.println(); // Пробел между 1 и 2 значениями прямоугольников

		Rectangle r2 = new Rectangle();
		r2.Perimetr();
		r2.Square();

		System.out.println();

		Circle c1 = new Circle(15.6);
		c1.Length();

		System.out.println();

		Circle c2 = new Circle(24.64, 12.32);
		c2.Square();

	}

}
