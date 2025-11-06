package demo_string;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String city = new String("Mumbai");
		System.out.println(city);
		System.out.println(city.length());
		System.out.println(city.charAt(0));
		System.out.println(city.equals("Mumbai"));
		System.out.println(city.equalsIgnoreCase("mumbai"));
		System.out.println(city.substring(2));
		System.out.println(city.substring(2, 4));
		
		String newcity = city.replace('M', 'P');
		System.out.println(newcity);
		
		System.out.println(city);
		String s = new String();
		
		String s1=new String("a");
		String s2=new String("a");
		
		System.out.println("=================");
		System.out.println( s1.equals(s2));
		System.out.println(s1==s2);
		System.out.println("=================");
		
		String s3="s";
		String s4 ="s";
		
		System.out.println("=================");
		System.out.println( s3.equals(s4));
		System.out.println(s3==s4);
		System.out.println("=================");
		
	}

}
