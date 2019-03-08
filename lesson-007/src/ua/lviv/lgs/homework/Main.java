package ua.lviv.lgs.homework;

public class Main {
	public static void main(String[] args) {
		Model model = new Model(18, 33, 17500, 550, "rainbow");
		
		model.engineStart();
		model.start();
		model.moveUp();
		model.moveDowm();
		model.moveForward();
		model.moveBack();
		model.stealthTechnology();
		model.nuclearStrike();
		model.turboBoost();
		model.landing();
	}
}
