package ua.lviv.lgs.hw;

import java.util.Scanner;

import ua.lviv.lgs.hw.*;

public class Main {
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
		ProccessingMonth month = new ProccessingMonth();
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			menu();
			
		switch(sc.next()) {
		case "1" : {
			System.out.println("Enter month");
			month.readMonth();
			System.out.println("Choose next step");
			break;
		}
		case "2" :{
			System.out.println("Enter month");
			month.sameSeasonMonths(month.readMonth());
			System.out.println("Choose next step");
			break;
		}
		case "3" :{
			System.out.println("Enter quantity of days");
			month.sameNumberOfDays(sc.nextInt());
			System.out.println("Choose next step");
			break;
		}
		case "4" :{
			System.out.println("Enter month");
			month.smallerNumberOfDays(month.readMonth().inDays);
			System.out.println("Choose next step");
			break;
		}
		case "5" :{
			System.out.println("Enter month");
			month.greaterNumberOfDays(month.readMonth().inDays);
			System.out.println("Choose next step");
			break;
		}
		case "6" : {
			System.out.println("Enter month");
			month.nextSeason(month.readMonth());
			System.out.println("Choose next step");
			break;
		}
		case "7" : {
			System.out.println("Enter month");
			month.pastSeasons(month.readMonth());
			System.out.println("Choose next step");
			break;
		}
		case "8" : {
			month.evenMonth();
			System.out.println("Choose next step");
			break;
		}
		case "9" : {
			month.oddMonth();
			System.out.println("Choose next step");
			break;
		}
		case "10" : {
			System.out.println("Enter month");
			month.isEvenNumberOfDaysInMonth(inSeason, inDays);
			System.out.println("Choose next step");
			break;
				}
			}
		}
	}
}
