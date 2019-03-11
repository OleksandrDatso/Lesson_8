package ua.lviv.lgs.homework;

import java.util.*;

public class Application {

	static void menu() {
		System.out.println("Нажми 1, чтобы проверить существует ли такой месяц");
		System.out.println("Нажми 2, чтобы вывести все месяцы этого времени года");
		System.out.println("Нажми 3, чтобы вывести месяцы с этим количеством дней");
		System.out.println("Нажми 4, чтобы вывести на экран все месяцы, которые имеют меньшое количество дней");
		System.out.println("Нажми 5, чтобы вывести на экран все месяцы, которые имеют большее количество дней");
		System.out.println("Нажми 6, чтобы вывести на экран следующее время года");
		System.out.println("Нажми 7, чтобы вывести на экран предыдущее время года");
		System.out.println("Нажми 8, чтобы вывести на экран все месяцы с четным количеством дней");
		System.out.println("Нажми 9, чтобы вывести на экран все месяцы с нечетным количеством дней");
		System.out.println("Нажми 10, чтобы проверить введенный с клавиатуры месяц на четность дней");
	}

	public static void main(String[] args) {
		Months[] mas = Months.values();
		Scanner sc = new Scanner(System.in);

		while (true) {
			menu();

			switch (sc.next()) {
			case "1": {
				System.out.println("Enter month");
				sc = new Scanner(System.in);
				String month = sc.next().toUpperCase();

				boolean present = isMonthPresent(mas, month);
				if (!present) {
					System.out.println("Месяц не существует");
				}
				break;
			}
			case "2": {
				System.out.println("Enter season");
				sc = new Scanner(System.in);
				String seasonSc = sc.next().toUpperCase();

				boolean present = false;
				for (Months m : mas) {
					if (m.getSeasons().name().equals(seasonSc)) {
						present = true;
					}
				}
				if (present) {
					Seasons s = Seasons.valueOf(seasonSc);
					for (Months m : mas) {
						if (m.getSeasons().toString().equalsIgnoreCase(seasonSc)) {
							System.out.println(m);
						}
					}
				}
				if (!present) {
					System.out.println("Времени года не существует");
				}
				break;
			}
			case "3": {
				System.out.println("Enter number of days");
				sc = new Scanner(System.in);
				int specNumber = sc.nextInt();

				for (Months m : Months.values()) {
					if (m.days == specNumber) {
						System.out.println(m.toString());
					}
				}
			}
			case "4": {
				String s = null;
				System.out.println("Enter a figure");
				sc = new Scanner(System.in);
				int specNumber = sc.nextInt();

				for (Months m : Months.values()) {
					if (m.days < specNumber) {
						System.out.println(m.toString());
					}
				}
				if (s == null) {
					System.out.println("это всё");
				}
			}
			case "5": {
				String s = null;
				System.out.println("Enter a figure");
				sc = new Scanner(System.in);
				int specNumber = sc.nextInt();

				for (Months m : Months.values()) {
					if (m.days > specNumber) {
						System.out.println(m.toString());
					}
				}
				if (s == null) {
					System.out.println("это всё");
				}
			}
			case "6": {
				System.out.println("Enter ");
				sc = new Scanner(System.in);
				String seasonSc = sc.next().toUpperCase();

				boolean present = isMonthPresent(mas, seasonSc);
				if (present) {
					Months m = Months.valueOf(seasonSc);
					int ordinal = m.ordinal();

					if (ordinal == mas.length - 1) {
						ordinal = 0;
						System.out.println(mas[ordinal]);
					} else {
						System.out.println(mas[ordinal + 1]);
					}
				}
				if (!present) {
					System.out.println("Нету вреемени года");
				}
				break;
			}
			case "7": {
				System.out.println("Enter ");
				sc = new Scanner(System.in);
				String seasonSc = sc.next().toUpperCase();

				boolean present = isMonthPresent(mas, seasonSc);
				if (present) {
					Months m = Months.valueOf(seasonSc);
					int ordinal = m.ordinal();

					if (ordinal == mas.length + 1) {
						ordinal = 0;
						System.out.println(mas[ordinal]);
					} else {
						System.out.println(mas[ordinal - 1]);
					}
				}
				if (!present) {
					System.out.println("Нету вреемени года");
				}
				break;
			}
			case "8": {
				for (Months m : Months.values()) {
					if(m.days % 2 == 0) {
						System.out.println(m.name() + " насчитывает " + m.days + " дней");
					}
				}
			}
			case "9": {
				for (Months m : Months.values()) {
					if(m.days % 2 != 0) {
						System.out.println(m.name() + " насчитывает " + m.days + " дней");
					}
				}
			}
			case "10": {
				System.out.println("Enter ");
				sc = new Scanner(System.in);
				String str = sc.next().toUpperCase();
				boolean present = isMonthPresent(mas, str);
				if(present) {
					Months m = Months.valueOf(str); 
					if(m.days % 2 == 0) {
						System.out.println(m.name() + " имеет четное количество дней");
					} else {
						System.out.println(m.name() + " имеет нечетное количество дней");
					}
				}
			}
		}
	}
}

	private static boolean isMonthPresent(Months[] mas, String month) {
		boolean present = false;
		for (Months m : mas) {
			if (m.name().equals(month)) {
				System.out.println("Month exist");
				present = true;
			}
		}
		return present;
	}
	

}
