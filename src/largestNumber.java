import java.util.Scanner;

public class largestNumber {
    public static void main(String [] args)
    {
        System.out.print("Enter three number:");
        Scanner sc= new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c= sc.nextInt();

        if((a>b)&&(a>c))
        {
            System.out.println(a+" is greatest number");
        }
        else if((b>a)&&(b>c))
        {
            System.out.println(b+" is greatest number");
        }
        else
        {
            System.out.println(c+" is a greatest number");
        }
    }
}
