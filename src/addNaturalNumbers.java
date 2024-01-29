import java.util.Scanner;

public class addNaturalNumbers {
    public static void main(String[] args) {
        System.out.print("Enter number of terms:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.print("Natural number:");
        for(int i=1 ; i<=n ;i++)
        {
            System.out.println(i);
        }
        System.out.print("sum of natural number is:");
        int sum=0;
        for(int i=1 ; i<=n ;i++)
        {
            sum +=i;
        }
        System.out.println(sum);
    }
}
