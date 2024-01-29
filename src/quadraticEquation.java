import java.util.Scanner;

public class quadraticEquation {
    public static void main(String [] args)
    {
        System.out.print("Enter the coefficients of quadratic equation:");
        Scanner sc= new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        int c= sc.nextInt();
        int D;
        double x1,x2;
        D=b*b-4*a*c;
        if(D>0)
        {
            System.out.println("roots are real and distinct");
            x1 = (-b+ Math.sqrt(D))/(2*a);
            x2 = (-b- Math.sqrt(D))/(2*a);
            System.out.println("root1 is:"+x1);
            System.out.println("root2 is:"+x2);
        }
        else if(D==0)
        {
            System.out.println("roots are real and equal");
            x1= -b/(2*a);
            x2= -b/(2*a);
            System.out.println("root1 is:"+x1);
            System.out.println("root2 is:"+x2);
        }
        else
        {
            System.out.println("roots are imaginary");
        }
    }
}
