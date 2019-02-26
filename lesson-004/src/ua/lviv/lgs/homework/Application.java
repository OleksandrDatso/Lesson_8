package ua.lviv.lgs.homework;

public class Application {
	public static void main(String[] args) {
		
		Robot r = new Robot();
		r.work();
		
		CoffeeRobot cr = new CoffeeRobot();
		cr.work();
		
		RobotDancer rd = new RobotDancer();
		rd.work();
		
		RobotCooker rc = new RobotCooker();
		rc.work();
		
		System.out.println();
		
		Robot[] array = new Robot[4];
		array[0] = new Robot();
		array[1] = new CoffeeRobot();
		array[2] = new RobotDancer();
		array[3] = new RobotCooker();
		for (int i=0; i<4; i++) {
			array[i].work();
		}
		
	}
}
