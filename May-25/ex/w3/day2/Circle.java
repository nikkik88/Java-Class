package ex.w3.day2;

public class Circle {

	String name;
	double radius;
	
	public Circle() { }
	public Circle(String n, double r) {
		name = n;
		radius = r;
	}
		//method
		public double getArea() {
			double result = radius * radius * 3.14;
					return result; 
		}
	}
