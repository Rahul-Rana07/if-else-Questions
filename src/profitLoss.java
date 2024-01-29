import java.util.Scanner;

public class profitLoss {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter cost price:");
        int cp= sc.nextInt();
        System.out.print("Enter selling price:");
        int sp= sc.nextInt();
        int p, l;

        if(sp>cp)
        {
            p= sp-cp;
            System.out.print("profit:"+p);
        }
        else if(cp>sp)
        {
            l=cp-sp;
            System.out.print("loss:"+l);
        }
        else
        {
            System.out.print("Neither profit nor loss");
        }
    }
}
