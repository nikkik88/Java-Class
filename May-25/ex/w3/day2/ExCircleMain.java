package ex.w3.day2;

public class ExCircleMain {

	public static void main(String[] args) {
		Circle c1 = new Circle("νΌμ", 10.0);
		Circle c2 = new Circle("λλ", 2.0);
		
		System.out.println(c1.name + ": " + c1.getArea());
		System.out.println(c2.name + ": " + c2.getArea());
	}

}
