package geometry_app;

public class Rectangle extends Shape{

	private float length,breadth;
	public Rectangle(float length, float breadth, String color)
	{
		super(color);
		this.length=length;
		this.breadth=breadth;
		//this.color=color;
	}
	public float calculateArea()
	{
		return length * breadth;
	}
	public void draw() 
	{
		super.draw();
		System.out.println("With Length and breadth " +this.length + " " +this.breadth);
	}
	
}
