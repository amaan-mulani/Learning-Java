package deafult;

public class DemoArray {

	public static void main(String[] args) {
		
		System.out.println(args[0 ]);
		// TODO Auto-generated method stub
		//First method for array declaration.
		int[] numbers;
		numbers = new int[3];
		numbers[0]=10;
		numbers[1]=20;
		numbers[2]=30;
		//numbers[3]=40; Exception (Out of bound).
		
		System.out.println(numbers[0]);
		System.out.println(numbers[1]);
		System.out.println(numbers[2]);
		
		//Second way
		float[] marks= new float[2];
		marks[0]=89.99f;
		marks[1]=97.97f;
		System.out.println(marks[0]);
		System.out.println(marks[1]);
		
		//Third way
		String[] subjects= {"Java","Spring"};
		//basic for loop
		for(int i=0; i<subjects.length;i++)
		{
			System.out.println(subjects[i]);
		}
		//enhanced for loop,for each loop
		for(String s : subjects)
		{
			System.out.println(s);
		}
		
		
	}

}
