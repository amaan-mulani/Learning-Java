class DemoWhileLoop
{
	public static void main(String[] args)
	{	
		int number = 97;
		int i = 1;
		int count=0;
		while(i<=97)
		{
			if(number%i==0)
			{
				count++;
			}
			i++;
		}
		if(count==2)
		{
			System.out.println("Prime Number");
		}
		else
		{	
			System.out.println("Not a prime Number");
		}
	}
}
