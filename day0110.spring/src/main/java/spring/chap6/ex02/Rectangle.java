package spring.chap6.ex02;

public class Rectangle {
	private double width;
	private double height;

	public double getArea() {
		return width * height;
	}

	public Rectangle() {
	}

	public Rectangle(double width, double height) {
		super();
		this.width = width;
		this.height = height;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

}
