import java.util.Scanner;

public class checkAlphabetAndDigitAndSpecialSymbol {
    public static void main(String[] args) {
        System.out.print("Enter any key from keypad:");
        Scanner sc= new Scanner(System.in);
        char ch= sc.next().charAt(0);

        if(ch>='a'&& ch<='z' || ch>='A'&& ch<='Z')
        {
            System.out.print(ch+" is a alphabet");
        }
        else if(ch>='0'&& ch<='9')
        {
            System.out.println(ch+ " is a digit");
        }
        else
        {
            System.out.println(ch+ " is  special symbol");
        }
    }
}
