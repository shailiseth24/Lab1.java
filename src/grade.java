import java.util.*;
public class grade {
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int marks;
        System.out.println("Enter the marks you want to check grade for");
        marks=sc.nextInt();
        if(marks>=90)
            System.out.println("Grade is O");
        else if(marks>=80)
            System.out.println("Grade is E");
        else if(marks>=70)
            System.out.println("Grade is A");
        else if(marks>=60)
            System.out.println("Grade is B");
        else if(marks>=50)
            System.out.println("Grade is C");
        else
            System.out.println("Fail");
    }
}
