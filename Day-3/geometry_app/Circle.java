package geometry_app;

public class Circle extends Shape
{

	private float radius;
	public Circle(float radius, String color)
	{
		super(color);
		this.radius=radius;
	}
	public float calculateArea()
	{
		return 3.14f * radius * radius;
	}
	//overriden method
	public void draw() 
	{
		super.draw();
		System.out.println("With radius " +this.radius);
	}

}
