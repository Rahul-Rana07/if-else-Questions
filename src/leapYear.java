import java.util.Scanner;

public class leapYear {
    public static void main(String [] args)
    {
        System.out.print("Enter year:");
        Scanner sc= new Scanner(System.in);
        int year  = sc.nextInt();

        if(year%4 == 0)
        {
            System.out.println(year+" is a leap year");
        }
        else
        {
            System.out.println(year+ " is not a leap year");
        }
    }
}
