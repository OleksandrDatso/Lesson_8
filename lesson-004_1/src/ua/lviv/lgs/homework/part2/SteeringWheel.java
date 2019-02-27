package ua.lviv.lgs.homework.part2;

public class SteeringWheel {
	private String material = "leather";
	private int diameter = 15;
	
	public SteeringWheel(String material, int diameter) {
		super();
		this.material = material;
		this.diameter = diameter;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public int getDiameter() {
		return diameter;
	}

	public void setDiameter(int diameter) {
		this.diameter = diameter;
	}

	@Override
	public String toString() {
		return "SteeringWheel [material=" + material + ", diameter=" + diameter + "]";
	}
	
	public void changeDiameter(int secondDiameter) {
		this.diameter = secondDiameter;
	}
}
