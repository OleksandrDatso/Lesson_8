package ua.lviv.lgs.homework_part2;

import java.util.Scanner;

public class Application {
	public static void main(String[] args) {
		System.out.println("Введите целое число");
		Scanner sc = new Scanner(System.in);
		if (sc.hasNextInt()) {
			if (sc.nextInt() % 2 == 0) {
				System.out.println("Ввели четное число");
			} else
				System.out.println("Ввели нечетное число");
		} else
			System.out.println("Error! Ввели не целое число");
	}
}
