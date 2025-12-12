import java.util.Scanner;
public class palindrome {
    public static void main()
    {
        int n,m,p=0,c;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        n=sc.nextInt();
        c=n;
        while(n>0)
        {
            m=n%10;
            p=p*10+m;
            n=n/10;
        }
        if(p==c)
        {
            System.out.println("Palindrome");
        }
        else
        {
            System.out.println("Not Palindrome");
        }
    }
}
