import java.util.Scanner;

public class triangleIdentifier {
    public static void main(String[] args) {
        System.out.print("Enter three sides of triangle:");
        Scanner sc= new Scanner(System.in);
        int s1= sc.nextInt();
        int s2= sc.nextInt();
        int s3= sc.nextInt();

        if((s1==s2)&&(s2==s3))
        {
            System.out.println("Equilateral Triangle");
        }
        else if(s1==s2 || s2==s3 || s1==s3)
        {
            System.out.println("Isosceles Triangle");
        }
        else
        {
            System.out.println("Scalene Triangle");
        }
    }
}
