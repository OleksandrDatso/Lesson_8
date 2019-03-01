package ua.lviv.lgs.homework_part2;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Пользователь подбрасывает монету");

		for (int i = 0; i < 1; i++) {
			if (Math.random() <= 0.5) {
				System.out.println("Выпал - орел");
			} else {
				System.out.println("Выпало - решка");
			}
		}

	}
}
