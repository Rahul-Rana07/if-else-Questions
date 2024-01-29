import java.util.Scanner;

public class detectingInteger {
    public static void main(String [] args)
    {
        System.out.print("Enter a number:");
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        if(n>0)
        {
            System.out.println(n+" is a positive number");
        }
        else if(n<0)
        {
            System.out.println(n+" is a negative number");
        }
        else
        {
            System.out.println(n+" is zero");
        }
    }
}
