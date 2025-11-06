package geometry_app;

public class Shape {

		protected String color;
		public Shape(String color)
		{
			System.out.println("in Shape()");
			this.color=color;
		}
		
		public void draw()
		{
			System.out.println("Shape drawn using: "+this.color);
		}
		
}
