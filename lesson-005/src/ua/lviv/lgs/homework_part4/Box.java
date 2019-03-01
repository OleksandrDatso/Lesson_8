package ua.lviv.lgs.homework_part4;

public class Box {
	
	int length;
	int width;
	int height;
	
	public Box() {
		super();
	}

	public Box(int length, int width) {
		super();
		this.length = length;
		this.width = width;
	}

	public Box(int length, int width, int height) {
		this(12, 50);
		this.height = height;
	}
	
}
