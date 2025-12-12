import java.util.*;
public class weekday {
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter day number: 0 for Monday, 1 for Tuesday, 2 for Wednesday, 3 for Thursday, 4 for Friday, 5 for Saturday, 6 for Sunday ");
        int n=sc.nextInt();
        switch(n)
        {
            case 0:
                System.out.println("Monday");
        break;
        case 1:
        System.out.println("Tuesday");
        break;
        case 2:
        System.out.println("Wednesday");
        break;
        case 3:
        System.out.println("Thursday");
        break;
        case 4:
            System.out.println("Friday");
            break;
            case 5:
                System.out.println("Saturday");
                break;
                case 6:
                    System.out.println("Sunday");
                    break;
                    default: System.out.println("Invalid Input");
        }
    }
}
