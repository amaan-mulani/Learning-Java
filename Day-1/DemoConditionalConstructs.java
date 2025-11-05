class DemoConditionalConstructs
{
	public static void main(String[] args)
	{
		int age;	//variable declaration
		age=20;		//assigning value
		char nationality;
		nationality = 'I';
		
		if(age>18 && nationality == 'I')
		{		
			System.out.println("Is eligible.");
		}
		else
		{
			System.out.println("Is not eligible.");
		}
	}
}