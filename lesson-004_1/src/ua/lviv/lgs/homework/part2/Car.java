package ua.lviv.lgs.homework.part2;

public class Car {
	private int cost;
	private String type;

	private String steeringWheel;
	private String wheel;
	private String body;
	private int WheelSize;

	public void WheelSize(int i) {

	}
	
	public Car(int wheelSize) {
		super();
		setWheelSize(wheelSize);
	}

	public Car(int cost, String type) {
		super();
		this.cost = cost;
		this.type = type;
	}

	public Car(int cost, String type, String steeringWheel, String wheel, String body, int WheelSize) {
		super();
		this.cost = cost;
		this.type = type;
		this.steeringWheel = steeringWheel;
		this.wheel = wheel;
		this.body = body;
		this.WheelSize = WheelSize;
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

	public String getSteeringWheel() {
		return steeringWheel;
	}

	public void setSteeringWheel(String steeringWheel) {
		this.steeringWheel = steeringWheel;
	}

	public String getWheel() {
		return wheel;
	}

	public void setWheel(String wheel) {
		this.wheel = wheel;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	@Override
	public String toString() {
		return "Car [cost=" + cost + ", type=" + type + ", steeringWheel=" + steeringWheel + ", wheel=" + wheel
				+ ", body=" + body + ", WheelSize=" + WheelSize + "]";
	}

	public int getWheelSize() {
		return WheelSize;
	}

	public void setWheelSize(int wheelSize) {
		WheelSize = wheelSize;
	}

}
