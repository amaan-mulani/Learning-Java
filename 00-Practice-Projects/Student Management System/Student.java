

public class Student
{
    String name;
    int prn;
    double marks[][];

    //constructor to inputting values.
    public Student(String name, int prn, double marks[][])
    {
        this.name=name;
        this.prn=prn;
        this.marks=marks;
    }

    public double calculateAverage()
    {
        double total = 0; //sum of marks
        int count = 0; //number of subjects

        for(int i = 0; i < marks.length;i++)
        {
            for(int j = 0; j < marks[i].length; j++)
            {
                total = total + marks[i][j];
                count ++;
            } 
        }
        return total/count;
    }

    public String getGrade()
    {
        double average = calculateAverage();
        if(average >=85) return "A";
        else if (average >=75) return "B";
        else if (average >=55) return "C";
        else return "F";
    }
    
    public void display()
    {
        System.out.println("============================================");
        System.out.println("PRN :" +prn);
        System.out.println("Name of the student: " +name);
        System.out.println("Average marks: " +calculateAverage());
        System.out.println("Grade obtained: " +getGrade());
        System.out.println("============================================");
    }
}
