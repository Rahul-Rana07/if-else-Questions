import java.util.Scanner;

public class basicGrossSalary {
    public static void main(String[] args) {
        System.out.print("Enter basic salary:");
        Scanner sc= new Scanner(System.in);
        int bs=sc.nextInt();
        double hra,da;

        if(bs<=10000)
        {
            hra=bs*0.2f;
            da =bs*0.8f;
        }
        else if(bs<=20000)
        {
            hra = bs*0.25;
            da= bs*0.9;
        }
        else
        {
            hra= bs*0.3f;
            da= bs*0.95f;
        }
        System.out.println("Gross salary:"+(bs+hra+da));
    }
}
