import java.util.Scanner;
import cie.student;
import see.External;
public class Main
{
    public static void main(String args[])
    {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of students:");
        n=sc.nextInt();
        External student[]=new External[n];
        student details[]=new student[n];
        int final_marks[][]=new int[n][5];
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter student usn and name respectively:");
            student[i]=new External();
            details[i]=new student();
            System.out.println("Enter Internal marks of 5 subjects in respective order:");
            for(int j=0;j<5;j++)
            {
                student[i].internal[j]=sc.nextInt();
            }
            System.out.println("Enter external marks of 5 subjects in respective order:");
            for(int k=0;k<5;k++)
            {
                student[i].external[k]=sc.nextInt();
            }
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<5;j++)
            {
                final_marks[i][j]=student[i].internal[j]+(int)(student[i].external[j]/2);
            }
        }
        for(int i=0;i<n;i++)
        {
            System.out.println("USN:"+details[i].usn);
            System.out.println("Sem:"+details[i].sem);
            System.out.println("Marks of the student is:");
            for(int j=0;j<5;j++)
            {
                System.out.println(final_marks[i][j]);
            }
        }
    }
}