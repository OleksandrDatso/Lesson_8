package ua.lviv.lgs.homework.part2;

public class Car {
	private int cost;
	private String type;
	
	SteeringWheel sw = new SteeringWheel();
	Wheel w = new Wheel();
	Body b = new Body();
	
	public String getInfo(String yearOfBuilt) {
		return this.type + yearOfBuilt;
	}

	public Car(int cost, String type) {
		super();
		this.cost = cost;
		this.type = type;
	}

	public Car(int cost, String type, SteeringWheel sw, Wheel w, Body b) {
		super();
		this.cost = cost;
		this.type = type;
		this.sw = sw;
		this.w = w;
		this.b = b;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public SteeringWheel getSw() {
		return sw;
	}

	public void setSw(SteeringWheel sw) {
		this.sw = sw;
	}

	public Wheel getW() {
		return w;
	}

	public void setW(Wheel w) {
		this.w = w;
	}

	public Body getB() {
		return b;
	}

	public void setB(Body b) {
		this.b = b;
	}

	@Override
	public String toString() {
		return "Car [cost=" + cost + ", type=" + type + ", sw=" + sw + ", w=" + w + ", b=" + b + "]";
	}
	
}
