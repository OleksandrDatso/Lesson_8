package ua.lviv.lgs.homework.part2;

public class Wheel {
	private int diameter = 195;
	private String model = "F-1";
	
	public int getDiameter() {
		return diameter;
	}
	public void setDiameter(int diameter) {
		this.diameter = diameter;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	@Override
	public String toString() {
		return "Wheel [diameter=" + diameter + ", model=" + model + "]";
	}
	public void changeModel(String anotherModel) {
		this.model = anotherModel;
	}
	
}
