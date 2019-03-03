package ua.lviv.lgs.homework.part2;

public class Body {
	private int volume;
	private String color;
	
	public Body(int volume, String color) {
		super();
		this.volume = volume;
		this.color = color;
	}


	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Body [volume=" + volume + ", color=" + color + "]";
	}
	
	public void changeColor(String newColor) {
		this.color = newColor;
	}
	
}
