package ua.lviv.lgs.homework_part1;

public class WorkerPerMonth implements Salary {
	
	@Override
	public void salary() {
		int payment = 2500;
		System.out.println("The worker #2 recieves " + payment + " euro per month");
	}
	
	
}
