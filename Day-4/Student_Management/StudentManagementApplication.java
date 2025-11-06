
package studentmanagementapp;
import java.util.Scanner;

public class StudentManagementApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int choice = 0;
		System.out.println("Number of Students registered are :"+Student.getCount());
		//1. create a reference of Student type
		//Student s;
//		System.out.println("Number of Students registered are"+ Student.getCount());
		//System.out.println(s);//ERROR-not initialized
		Student s=null;
		//2. create object and assign to reference variable
		//s=new Student();
		
		//Student s1=new Student(1, "Anay", 12.22f);
//		System.out.println(s);
//		System.out.println(s.name);
//		System.out.println(s.rollNumber);
//		System.out.println(s.marks);
		
		//s.rollNumber=-1;// to stop this we make sure rollNumber is
						// Not accessible outside the class
						// in which it is declared
		//s.name="Bhuvan";
		//s.marks=88.8f;
		
//		s.accept(1, "Ganesh", 69.9f);
//		s.display();
//		s1.accept(2, "Munna", 95.5f);
//		s1.display();
//		s1.display("*");
		
		
		
		do {
			System.out.println("Welcome to Student Management App:");
			System.out.println("==================================");
			System.out.println("1. Register new Employee");
			System.out.println("2. Display Details");
			System.out.println("-1. Exit");
			System.out.println("Enter your choice:");
			Scanner sc=new Scanner(System.in);
			choice = sc.nextInt();
			
			switch (choice) {
			case 1: {
				s = new Student(1,"kshitij",89.7f);
				break;
			}
			case 2: {
				if(s!=null)
					//s.display();
					System.out.println(s);
				break;
			}
			case -1: {
				
				break;
			}
			default:
				System.out.println("Select correct choice");
				break;
			}
		}while(choice!=-1);
		System.out.println("Program Exit Successful");

	}

}
