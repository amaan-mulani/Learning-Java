package org.ycpait.wrapper;

public class DemoWrapper {

	public static void main(String[] args) {
		
		//primitive type
		int i = 10;
		
		//primitive to wrapper
		Integer iObj = new Integer(i);
		
		//wrapper to primitive
		int j = iObj.intValue();
		
		//string to wrapper
		Integer o = Integer.valueOf("77");
		
		//wrapper to string
		String str = o.toString();
		
		//string to primitive
		int p = Integer.parseInt("78");
		
		//primitve to string
		String data = Integer.toString(p);
	}

}
