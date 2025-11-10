package org.ycpait.geometryapp;

import org.ycpait.geometryapp.entity.*;

public class GeometryApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Circle c = new Circle(2, "green");
//		System.out.println("Area of Circle: "+c.calculateArea());
//		c.draw();
//		
//		Rectangle r = new Rectangle(5,3, "red");
//		System.out.println("Area of Rectangle: "+r.calculateArea());
//		r.draw();
		Shape s;
		//upcasting
		Circle c = new Circle(2,"green");
		s=c;//Upcasting. trying to assign subclass to super class.
		c.getPi();
		//downcasting
		Circle c1 = (Circle)s;
		c1.getPi(); //invoking circle specific method.
		
		//s = new Circle(2, "red");
		System.out.println("Area of class is "+s.calculateArea());
		s.draw();//calls circles draw.
	}

}
