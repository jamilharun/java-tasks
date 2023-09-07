package asd;

public class main {
	


	public static void main(String[] args) {
		Shape circle = new Circle("Red" , 5.0);
		Shape rectangle = new Rectangle("Blue", 4.0, 6.0);
		
		System.out.println("Circle color:" + circle.getColor());
		System.out.println("Circle area:" + circle.calculateArea());
		
		System.out.println("Rectangle color:" + rectangle.getColor());
		System.out.println("Rectangle area:" + rectangle.calculateArea());
		
	}
}
