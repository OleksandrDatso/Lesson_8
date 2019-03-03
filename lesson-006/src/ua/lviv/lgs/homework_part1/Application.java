package ua.lviv.lgs.homework_part1;

public class Application {
	public static void main(String[] args) {
		WorkerPerHour worker1 = new WorkerPerHour();
		worker1.salary();
		
		WorkerPerMonth worker2 = new WorkerPerMonth();
		worker2.salary();
	}
}
