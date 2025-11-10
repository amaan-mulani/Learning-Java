
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
        do
        {
            System.out.println("Enter the name of the student: ");
            String name=sc.next();

            System.out.println("Enter the PRN number of the student: ");
            int prn = sc.nextInt();

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
