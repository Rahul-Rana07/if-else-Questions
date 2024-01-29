import java.util.Scanner;

public class totalExpenses {
    public static void main(String[] args) {
        System.out.print("Enter the quantity of purchased:");
        Scanner sc= new Scanner(System.in);
        int qty= sc.nextInt();
        System.out.print("Enter the amount per item:");
        float amt= sc.nextFloat();
        float exp;
        if(qty>100)
        {
            exp= qty*amt;
            exp =exp-(exp*0.1f);
        }
        else
        {
            exp= qty*amt;
        }
        System.out.println("Total expense:"+exp);
    }
}
