import java.util.Scanner;
public class starPatternByOutput {
    public static  void main(String [] args)
    {
        System.out.print("*\n**\n***\n****\n");
        //variables
        int a =7;
        int b = 10;
        int sum = a+b;
        System.out.println("Sum is:"+ sum);
        // input
        System.out.print("Enter name:");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println(name);
    }
}
