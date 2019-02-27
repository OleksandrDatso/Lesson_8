package ua.lviv.lgs.homework.part1;

public class Application_part_1 {
	public static void main(String[] args) {
		Robot r = new Robot();
		r.work();
		
		CoffeeRobot cr = new CoffeeRobot();
		cr.work();
		
		RobotCooker rc = new RobotCooker();
		rc.work();
		
		RobotDancer rd = new RobotDancer();
		rd.work();
		
		System.out.println();
		
		Robot[] array = new Robot[4];
		array[0] = new Robot();
		array[1] = new CoffeeRobot();
		array[2] = new RobotCooker();
		array[3] = new RobotDancer();
		for (int i=0; i<4; i++) {
			array[i].work();
		}
	}
}
