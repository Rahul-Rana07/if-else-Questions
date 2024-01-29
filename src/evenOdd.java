import java.util.Scanner;

public class evenOdd {
    public static void main(String [] args)
    {
        System.out.print("Enter number:");
        Scanner sc= new Scanner(System.in);
        int num = sc.nextInt();
        if(num % 2== 0)
        {
            System.out.println(num+" is a even number");
        }
        else
        {
            System.out.println(num+ " is a odd number");
        }
    }
}
