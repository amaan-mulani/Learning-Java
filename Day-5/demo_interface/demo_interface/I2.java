package demo_interface;

public interface I2 {
	void display();
	default void print()
	{
		System.out.println("in interface 2");
	}
	
}
