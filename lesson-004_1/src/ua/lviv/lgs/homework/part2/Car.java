package ua.lviv.lgs.homework.part2;

public class Car {
	private int cost;
	private String type;

	private SteeringWheel steeringWheel;
	private Wheel wheel;
	private Body body;

	public Car(int cost, String type, SteeringWheel steeringWheel, Wheel wheel, Body body) {
		super();
		this.cost = cost;
		this.type = type;
		this.steeringWheel = steeringWheel;
		this.wheel = wheel;
		this.body = body;
	}

	public void changeCar() {
		this.cost = 1000000;
		this.type = "newType";
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

	public SteeringWheel getSteeringWheel() {
		return steeringWheel;
	}

	public void setSteeringWheel(SteeringWheel steeringWheel) {
		this.steeringWheel = steeringWheel;
	}

	public Wheel getWheel() {
		return wheel;
	}

	public void setWheel(Wheel wheel) {
		this.wheel = wheel;
	}

	public Body getBody() {
		return body;
	}

	public void setBody(Body body) {
		this.body = body;
	}

	@Override
	public String toString() {
		return "Car [cost=" + cost + ", type=" + type + ", steeringWheel=" + steeringWheel + ", wheel=" + wheel
				+ ", body=" + body + "]";
	}

}
