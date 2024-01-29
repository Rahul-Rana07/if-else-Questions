import java.util.Scanner;

public class calculator {
    public static void main (String [] args)
    {
        System.out.print("Enter two number:");
        Scanner sc= new Scanner(System.in);
        double num1= sc.nextInt();
        double num2 = sc.nextInt();
        System.out.print("Enter operation(+,-,*,/,%):");
        Scanner sc2 =new Scanner(System.in);
        char operation = sc.next().charAt(0);
        switch(operation)
        {
            case '+':
                System.out.println("Sum is:"+ (num1 + num2));
                break;
            case '-':
                System.out.println("difference is:"+ (num1 - num2));
                break;
            case '*':
                System.out.println("product is:"+ (num1 * num2));
                break;
            case '/':if(num2 != 0)
            {
                System.out.println("division is:"+ (num1/num2));
            }
            else
            {
                System.out.println("cannot divide by zero");
            }
            break;
            case '%':
                System.out.println("reaminder is:"+ (num1% num2));
                break;
            default:
                System.out.println("invalid input");
        }
    }
}
