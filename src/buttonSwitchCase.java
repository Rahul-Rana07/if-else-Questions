import java.util.Scanner;

public class buttonSwitchCase {
    public static void main(String [] args)
    {
        System.out.print("Enter number between 1 to 3:");
        Scanner sc = new Scanner(System.in);
        int button = sc.nextInt();
        switch(button)
        {
            case 1:
                System.out.println("Hello");
                break;
            case 2:
                System.out.println("Namaste");
                break;
            case 3:
                System.out.println("Bonjour");
                break;
                default:
                System.out.println("invlid input");
                break;
        }
    }
}
