class Student
{
    String name;
    int age;
    int rollNo;
}

public class ArrayOfObjects {
    public static void main(String[] args) {
        
        Student s1 = new Student();
        s1.name = "Alice";
        s1.age = 20;
        s1.rollNo = 101;
        Student s2 = new Student();
        s2.name = "Bob";
        s2.age = 21;
        s2.rollNo = 102;
        Student s3 = new Student();
        s3.name = "Charlie";
        s3.age = 22;
        s3.rollNo = 103;

        Student students[] = new Student[3];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        //for(int i =0; i<students.length; i++)
        for(Student stud : students) //advanced for loop
        {
            System.out.println("\nName: "+ stud.name + " \nAge: " +stud.age + " \nMarks:  " + stud.rollNo);
        }
    }
}
