package ua.lviv.lgs.hw;

public enum Month {
	
	JANUARY(Season.WINTER, 31), FEBRUARY(Season.WINTER, 28), MARCH(Season.SPRING, 31), APRIL(Season.SPRING, 30),
	MAY(Season.SPRING, 31), JUNE(Season.SUMMER, 30), JULY(Season.SUMMER, 31), AUGUST(Season.SUMMER, 31),
	SEPTEMBER(Season.AUTUMN, 30), OCTOBER(Season.AUTUMN, 31), NOVEMBER(Season.AUTUMN, 30), DECEMBER(Season.WINTER, 31);
	
	
	Season inSeason;
	int inDays;
	
	Month(Season inSeason, int inDays) {
		this.inSeason = inSeason;
		this.inDays = inDays;
	}

	public Season getInSeason() {
		return inSeason;
	}

	public int getInDays() {
		return inDays;
	}
	
}
