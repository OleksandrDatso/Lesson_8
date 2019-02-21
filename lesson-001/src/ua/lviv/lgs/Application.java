package ua.lviv.lgs;

public class Application {
	public static void main(String[] args) {
		
		// Task 1:
		byte a = 1;
		short s = 7;
		int d = 18;
		long f = 150;
		double g = 8.7;
		float h = 33.3f;
		boolean j = false;
		char k = '\u0000';
		
		// Task 2:
		System.out.println("Byte Max = " + Byte.MAX_VALUE);
		System.out.println("Byte Min = " + Byte.MIN_VALUE);
		System.out.println("Short Max = " + Short.MAX_VALUE);
		System.out.println("Short Min = " + Short.MIN_VALUE);		
		System.out.println("Integer Max = " + Integer.MAX_VALUE);		
		System.out.println("Integer Min = " + Integer.MIN_VALUE);
		System.out.println("Long Max = " + Long.MAX_VALUE);
		System.out.println("Long Min = " + Long.MIN_VALUE);
		System.out.println("Double Max = " + Double.MAX_VALUE);
		System.out.println("Double Min = " + Double.MIN_VALUE);
		System.out.println("Float Max = " + Float.MAX_VALUE);
		System.out.println("Float Min = " + Float.MIN_VALUE);
		
		// Task 3:
		int[] array = {4, 18, -5, 2, 116, 0, -45, 87, 33, 25};
		int max = 0;
		int min = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] > max) {
				max = array[i];
			}
			if (array[i] < min) {
				min = array[i];
			}
		}
		System.out.println("Максимальное значение = " + max);
		System.out.println("Минимальное значение = " + min);
	}
}
