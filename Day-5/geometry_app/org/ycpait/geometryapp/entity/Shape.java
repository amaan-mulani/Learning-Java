package org.ycpait.geometryapp.entity;

public abstract class Shape {

		protected String color;
		
		public Shape(String color)
		{
			super();
			System.out.println("in Shape()");
			this.color=color;
		}
		
		public abstract float calculateArea();
		
		public abstract float calculatePerimeter();
		
		
		public void draw()
		{
			System.out.println("Shape drawn using: "+this.color);
		}
		
}
