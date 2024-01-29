import java.util.Scanner;

public class unitTOElectricityBIll {
    public static void main(String[] args) {
        System.out.print("Enter the electricity unit charges:");
        Scanner sc= new Scanner(System.in);
        float unit=sc.nextFloat();
        float amt,surcharge,bill_amt;

        if(unit<=50)
        {
            amt= unit*0.50f;
        }
        else if(unit<=150)
        {
            amt= unit*0.75f;
        }
        else if(unit<=250)
        {
            amt=unit*1.20f;
        }
        else
        {
            amt=unit*1.50f;
        }

        surcharge =amt*0.2f;
        bill_amt= amt+surcharge;
        System.out.print("Electricity bill:"+bill_amt);
    }
}
