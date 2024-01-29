import java.util.Scanner;

public class percentageAndGrade {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter marks of Maths:");
        int m=sc.nextInt();
        System.out.print("Enter marks of Physics:");
        int p=sc.nextInt();
        System.out.print("Enter marks of chemistry:");
        int c=sc.nextInt();
        System.out.print("Enter  marks of biology:");
        int b=sc.nextInt();
        System.out.print("Enter maks of computer:");
        int co=sc.nextInt();
        double per;
        per=(m+p+c+b+co)*100/500;
        System.out.println("Percentage:"+per);

        if(per>=90)
        {
            System.out.println("Grade A");
        }
        else if (per>=80)
        {
            System.out.println("Grade B");
        }
        else if(per>=70)
        {
            System.out.println("Grade C");
        }
        else if(per>=60)
        {
            System.out.println("Grade D");
        }
        else if(per>=40)
        {
            System.out.println("Grade E");
        }
        else if(per<40)
        {
            System.out.println("Grade F");
        }
        else
        {
            System.out.println("Fail");
        }
    }
}
