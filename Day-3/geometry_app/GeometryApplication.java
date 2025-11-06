package geometry_app;

public class GeometryApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c = new Circle(2, "green");
		System.out.println("Area of Circle: "+c.calculateArea());
		c.draw();
		
		Rectangle r = new Rectangle(5,3, "red");
		System.out.println("Area of Rectangle: "+r.calculateArea());
		r.draw();
	}

}
