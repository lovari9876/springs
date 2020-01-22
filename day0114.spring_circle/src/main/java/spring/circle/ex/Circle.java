package spring.circle.ex;

public class Circle {
	private double radius;

	public double getArea() {
		return radius * radius * Math.PI;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	public Circle() {
	}

}
