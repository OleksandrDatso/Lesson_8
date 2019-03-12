package ua.lviv.lgs.hw;

import java.util.Scanner;

public class ProccessingMonth {
	Scanner sc = new Scanner(System.in);

	public Month readMonth() {
		while (true) {
			if (!(sc.hasNextInt())) {				
				String s = sc.nextLine().toUpperCase();					
				for (Month month : Month.values()) {
					if (s.equalsIgnoreCase(month.name())) {						
						return month;						
					}											
				}
				System.out.println("The word you entered is not the name of the month, try again");	
				sc = new Scanner(System.in);
			} else {
				int m = sc.nextInt();
				if (m > 12 || m < 1) {
					System.out.println("You entered the wrong month, try again.");
					sc = new Scanner(System.in);
				} else {
					for (Month month : Month.values()) {
						if (m == month.ordinal() + 1) {
							return month;
			}			
		}
	}
}
		}
	}
	public void sameSeasonMonths (Month month) {
		Season season;
		if (month.ordinal() >= 8 && month.ordinal() <= 10) {
			season = Season.AUTUMN;			
		} else if (month.ordinal() >= 2 && month.ordinal() <= 4) {
			season = Season.SPRING;
		} else if (month.ordinal() >= 5 && month.ordinal() <= 7) {
			season = Season.SUMMER;
		} else {
			season = Season.WINTER;
		}
		switch (season) {
		case WINTER:
			for (Month months : Month.values()) {
				if (months.ordinal() == month.ordinal() || months.ordinal() < 11 || months.ordinal() >1) {
				} else {
					System.out.println(months);
				}
			}
			break;
		case SPRING:
			for (Month months : Month.values()) {
				if (months.ordinal() == month.ordinal() || months.ordinal() < 2 || months.ordinal() > 4) {
				} else {
					System.out.println(months);
				}				
			}			
			break;
		case SUMMER:
			for (Month months : Month.values()) {
				if (months.ordinal() == month.ordinal() || months.ordinal() < 5 || months.ordinal() > 7) {
				} else {
					System.out.println(months);
				}				
			}			
			break;
		case AUTUMN:
			for (Month months : Month.values()) {
				if (months.ordinal() == month.ordinal() || months.ordinal() < 8 || months.ordinal() > 10) {
				} else {
					System.out.println(months);
				}				
			}			
			break;
		}
	}
	public void sameNumberOfDays(int sameNumber) {
		for (Month m : Month.values()) {
			if (m.inDays == sameNumber) {
				System.out.println(m.toString());
			}
		}
	}
	
	public void smallerNumberOfDays(int smallerNumber) {
		String s = null;
		for (Month m : Month.values()) {
			if(m.inDays < smallerNumber) {
				System.out.println(m.toString());
				s = m.toString();
			}
		}
		if (s==null) {
			System.out.println("There is no more a month with smaller number of days");
		}
	}
	
	public void greaterNumberOfDays (int greaterNumber) {
		String s = null;
		for(Month m : Month.values()) {
			if(m.inDays > greaterNumber) {
				System.out.println(m.toString());
				s = m.toString();
			}
		}
		if (s==null) {
			System.out.println("There is no more a month with greater number of days");
		}
	}
	
	public void nextSeason(Month month){
		int i = 0;
		String[] d =  {"WINTER","SPRING","SUMMER","AUTUMN"};
		for (Season s : Season.values()){
			i++;
			if(month.inSeason.equals(s.name())){
				System.out.println("Next season is "+d[i+1]);
			}
		}	
	}
	
	public void pastSeasons(Month month){
		int i = 0;
		String[] d =  {"WINTER","SPRING","SUMMER","AUTUMN"};
		for (Season s : Season.values()){
			i++;
			if(month.inSeason.equals(s.name())){
				System.out.println("Previous season is "+d[i-1]);
			}
		}	
	}
	
	public void evenMonth() {
		for (Month m : Month.values()) {
			if (m.inDays%2 ==0) {
				System.out.println(m.name() + " days = " + m.inDays);
			}
		}
	}
	
	public void oddMonth() {
		for (Month m : Month.values()) {
			if (m.inDays%2 !=0) {
				System.out.println(m.name() + " days = " + m.inDays);
			}
		}
	}
	
	public void isEvenNumberOfDaysInMonth(Season inSeason, int inDays) {
		if (inDays%2==0) {
			System.out.println(inSeason.name() + " has an even number of days");
		} else {
			System.out.println(inSeason.name() + " has an odd number of days");
		}
	}
	
}
