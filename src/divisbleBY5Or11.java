import java.util.Scanner;

public class divisbleBY5Or11 {
    public static void main(String[] args) {
        System.out.print("Enter a number:");
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();

        if((n%5==0) &&(n%11==0))
        {
            System.out.println(n+" is divisible by 5 or 11");
        }
        else
        {
            System.out.println(n+" is not divisible by 5 or 11");
        }
    }
}
