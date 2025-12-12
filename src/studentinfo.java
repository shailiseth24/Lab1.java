import java.util.Scanner;

public class studentinfo
{
    public static void main( )
    {
        Scanner sc=new Scanner(System.in);
        String name,branch;
        int age, roll;
        System.out.println("Enter name");
        name=sc.nextLine();
        System.out.println("Enter branch");
        branch=sc.nextLine();
        System.out.println("Enter rollno");
        roll=sc.nextInt();
        System.out.println("Enter age");
        age=sc.nextInt();
        System.out.println("Name:"+name);
        System.out.println("Age:"+age);
        System.out.println("Branch:"+branch);
        System.out.println("Roll No.:"+roll);
    }

}

