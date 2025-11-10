package org.ycpait.geometryapp.entity;

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
	
	public float calculatePerimeter()
	{
		return 0;
	}
	public float getPi()//accessed using downcasting in main, cause it is sub class specific method.
	{
		return 0;
	}
	//Overridden method
	public void draw() 
	{
		super.draw(); //goes to supers draw explicitly
		System.out.println("With radius " +this.radius);
	}

}
