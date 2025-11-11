
import java.util.Scanner;

public class StudentManagementSystem {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of students: ");
        int n = sc.nextInt();
        Student [] students = new Student[n];
        //Entering students info one by one
        int i = 0;
        do{
            System.out.println("\n====STUDENT MANAGEMENT MENU====");
            System.out.println("1. Add Student");
            System.out.println("2. View all students");
            System.out.println("3. Search students by PRN");
            System.out.println("4. Delete student");
            System.out.println("5. Find topper");
            System.out.println("6. Show total students");
            System.out.println("7. Exit");
            System.out.println("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) 
            {

                case 1:
                
                    System.out.println("Enter name: ");
                    String name =sc.next();

                    System.out.println("Enter PRN number: ");
                    int prn = sc.nextInt();

                    System.out.println();
                    //asking for the number of subjects
                    System.out.println("Enter the number of subjects: ");
                    int subjects = sc.nextInt();

                    //creating a 2d array named marks, only the first dimension to store the subject.
                    double marks[][] = new double[subjects][];

                    //loop to enter number of tests done in a single subject.
                    //This will decide how many columns it will have.
                    for(int s = 0; s < subjects; s++)
                    {
                        System.out.println("Enter number of tests in subject " + (s+1)+" : ");
                        int tests = sc.nextInt();

                
                        marks[s]=new double[tests]; //specific subject array
                        for(int t = 0; t < tests; t++)
                        {
                            System.out.println("Marks for text " +( t + 1)+ " : ");
                            marks[s][t] = sc.nextDouble();
                        }
                    }
                    studentCount++;
                    System.out.println("Student added sucessfully !");
                    break;
                
                
                case 2:
                
                    if (count ==0)
                    {
                        System.out.println("\nNo students yet.");
                    }
                    else
                    {
                        for(int i = 0; i < count; i++)
                        {
                            students[i].display();
                        }
                    }
                
                









            }while(choice !=8);
        }
        do
        {
           
            

            students[i]= new Student(name, prn, marks);
            i++;

            System.out.println("Do you need to add other student ? (yes/no)");

        }while(sc.next().equalsIgnoreCase("yes")&& i < n);

        System.out.println("----Student Records----");
        for(Student s: students)
        {
            if(s != null)
            {
                s.display();
            }
        }
        sc.close();
    }

    
}
