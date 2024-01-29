import java.util.Scanner;

public class largestByNested{
    public static void main(String[] args) {
        System.out.println("Enter three number:");
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        int c = sc.nextInt();

        if(a>b)
        {
            if(a>c)
            {
                System.out.println(a+" is greatest number");
            }
            else
            {
                System.out.println(c+" is a greatest number");
            }
        }
        else
        {
            if(b>a)
            {
                System.out.println(b+ " is greatest number");
            }
            else
            {
                System.out.println(c+ " is a greatest  number");
            }
        }
    }
}
