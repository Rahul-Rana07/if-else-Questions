import java.util.Scanner;

public class flotingSame {
    public static void main(String [] args)
    {
        System.out.print("enter two float values:");
        Scanner sc= new Scanner(System.in);
        double a= sc.nextDouble();
        double b= sc.nextDouble();
        a= Math.round(a*1000);
        a= a/1000;
        b = Math.round(b*1000);
        b= b/1000;

        if(a==b)
        {
            System.out.println("they  are same upto three decimals");
        }
        else
        {
            System.out.println("they arr different");
        }
    }
}
