import java.util.Scanner;

public class ifElse {
    public static void main(String [] args)
    {
        System.out.print("Enter number 1 to 3:");
        Scanner sc = new Scanner(System.in);
        int num =sc.nextInt();
        if (num ==1)
        {
            System.out.println("Hello");
        }
        else if(num ==2)
        {
            System.out.println("Namaste");
        }
        else if(num == 3)
        {
            System.out.println("Bonjour");
        }
        else
        {
            System.out.println("Invlid input");
        }
    }
}
