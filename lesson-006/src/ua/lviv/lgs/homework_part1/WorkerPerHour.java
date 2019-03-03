package ua.lviv.lgs.homework_part1;

public class WorkerPerHour implements Salary {

	@Override
	public void salary() {
		//WorkerPerHour worker1 = new WorkerPerHour();
		int payment = 20;
		System.out.println("The worker #1 recieves " + payment + " euro per hour");
		
		int hoursPerDay = 8;
		System.out.println("The worker #1 recieves " + payment * hoursPerDay + " euro per day");
	}
	
}
