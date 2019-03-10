package ua.lviv.lgs.homework;

import java.util.*;

public class Application {
	enum Seasons {
		winter, spring, summer, autumn;
	}

	enum Months {
		january(Seasons.winter), february(Seasons.winter), march(Seasons.spring), april(Seasons.spring),
		may(Seasons.spring), june(Seasons.summer), july(Seasons.summer), august(Seasons.summer),
		september(Seasons.autumn), october(Seasons.autumn), november(Seasons.autumn), december(Seasons.winter);

		Seasons days;
		Seasons seasons;

		Months(Seasons seasons) {
			this.seasons = seasons;
		}

		Months(Seasons days, Seasons seasons) {
			this.days = days;
			this.seasons = seasons;
		}

		public Seasons getDays() {
			return days;
		}

		public Seasons getSeasons() {
			return seasons;
		}

	}

	static void menu() {
		System.out.println("Нажми 1, чтобы проверить существует ли такой месяц");
		System.out.println("Нажми 2, чтобы вывести все месяцы этого времени года");
		System.out.println("Нажми 3, чтобы вывести месяцы с этим количеством дней");
		System.out.println("Нажми 4, чтобы вывести на экран все месяцы, которые имеют меньшое количество дней");
		System.out.println("Нажми 5, чтобы вывести на экран все месяцы, которые имеют большее количество дней");
		System.out.println("Нажми 6, чтобы вывести на экран следующее время года");
		System.out.println("Нажми 7, чтобы вывести на экран предыдущее время года");
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
				String month = sc.next().toLowerCase();

				boolean present = isMonthPresent(mas, month);
				if (!present) {
					System.out.println("Месяц не существует");
				}
				break;
			}
			case "2": {
				System.out.println("Enter season");
				sc = new Scanner(System.in);
				String seasonSc = sc.next().toLowerCase();

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
				int days = sc.nextInt();

				if (days == 28) {
					System.out.println("february");
				} else if (days == 30) {
					System.out.println("april");
					System.out.println("june");
					System.out.println("september");
					System.out.println("november");
				} else if (days == 31) {
					System.out.println("january");
					System.out.println("march");
					System.out.println("may");
					System.out.println("july");
					System.out.println("august");
					System.out.println("october");
					System.out.println("december");
				} else
					System.out.println("Неправильное количество дней в месяце");
				break;
			}
			case "4": {
				System.out.println("Enter month");
				sc = new Scanner(System.in);
				String month = sc.next().toLowerCase();

				if (month.equals("february")) {
					System.out.println("Это месяц с наименьшим количеством дней");
				}
				if (month.equals("april") | month.equals("june") | month.equals("september")
						| month.equals("november")) {
					System.out.println("february");
				}
				if (month.equals("january") | month.equals("march") | month.equals("may") | month.equals("july")
						| month.equals("august") | month.equals("october") | month.equals("december")) {
					System.out.println("february");
					System.out.println("april");
					System.out.println("june");
					System.out.println("september");
					System.out.println("november");
				} else
					System.out.println("Неправильно введен месяц");
				break;
			}
			case "5": {
				System.out.println("Enter month");
				sc = new Scanner(System.in);
				String month = sc.next().toLowerCase();

				if (month.equals("february")) {
					System.out.println("january");
					System.out.println("march");
					System.out.println("april");
					System.out.println("may");
					System.out.println("june");
					System.out.println("july");
					System.out.println("august");
					System.out.println("september");
					System.out.println("october");
					System.out.println("november");
					System.out.println("december");
				}
				if (month.equals("april") | month.equals("june") | month.equals("september")
						| month.equals("november")) {
					System.out.println("february");
					System.out.println("april");
					System.out.println("june");
					System.out.println("september");
					System.out.println("november");
				}
				if (month.equals("january") | month.equals("march") | month.equals("may") | month.equals("july")
						| month.equals("august") | month.equals("october") | month.equals("december")) {
					System.out.println("Это месяц с наибольшим количеством дней");
				} else
					System.out.println("Неправильно введен месяц");
				break;
			}
			case "6": {
				System.out.println("Enter season");
				sc = new Scanner(System.in);
				String seasonSc = sc.next().toLowerCase();

				Seasons s = Seasons.valueOf(seasonSc);
				if (s==Seasons.winter) {
					s = Seasons.spring;
					System.out.println(s);
				} else		
				if (s==Seasons.spring) {
					s = Seasons.summer;
					System.out.println(s);
				} else
				if (s==Seasons.summer) {
					s = Seasons.autumn;
					System.out.println(s);
				} else
				if (s==Seasons.autumn) {
					s = Seasons.winter;
					System.out.println(s);
				} else {
					System.out.println("Неправильно введено время года");
				}
				break;
			}
			case "7": {
				System.out.println("Enter season");
				sc = new Scanner(System.in);
				String seasonSc = sc.next().toLowerCase();

				Seasons s = Seasons.valueOf(seasonSc);
				if (s==Seasons.winter) {
					s = Seasons.autumn;
					System.out.println(s);
				} else		
				if (s==Seasons.spring) {
					s = Seasons.winter;
					System.out.println(s);
				} else
				if (s==Seasons.summer) {
					s = Seasons.spring;
					System.out.println(s);
				} else
				if (s==Seasons.autumn) {
					s = Seasons.summer;
					System.out.println(s);
				} else {
					System.out.println("Неправильно введено время года");
				}
				break;
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
