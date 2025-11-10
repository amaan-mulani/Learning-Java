package demo_interface;

public class MyClass implements I1, I2
{
	
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("MyClass");
	}
	
	@Override
	public void print()
	{
		System.out.println("In MyClass");
	}
	
	public static void main(String[] args) 
	{
		MyClass m = new MyClass();
		m.print();
	}

	

}
