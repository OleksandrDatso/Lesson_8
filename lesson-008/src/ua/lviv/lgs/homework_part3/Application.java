package ua.lviv.lgs.homework_part3;

import java.util.Scanner;

public class Application {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Введите первое число");
		int first = sc.nextInt();
		System.out.println("Введите второе число");
		int second = sc.nextInt();
		
		if (first % 1 == 0 | second % 1 == 0) {
			System.out.println("Сума чисел равна : " + (first + second));
		} else {
			System.out.println("Проверьте введенные числа");
		}
	}
}
