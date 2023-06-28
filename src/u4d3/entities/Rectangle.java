package u4d3.entities;

public class Rectangle {
	double width, height;

	public Rectangle(double x, double y) {
		this.width = x;
		this.height = y;
	}

	public double getArea() {
		return this.width * this.height;
	}

	public double getPerimeter() {
		return (this.width + this.height) * 2;
	}
}
