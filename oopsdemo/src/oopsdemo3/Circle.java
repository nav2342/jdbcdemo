package oopsdemo3;

public class Circle implements Shape {
	private double radius;
	
	public Circle(double radius) {
		this.radius = radius;
	}

	@Override
	public void draw() {
		System.out.println("drawing circle");

	}

	@Override
	public double getArea() {
		return Math.PI*this.radius*this.radius;
	}

	public double getRadius() {
		return radius;
	}

	

}
