import java.util.Scanner;

public class checkUpperLowerCase {
    public static void main(String[] args) {
        System.out.print("Enter a character:");
        Scanner sc= new Scanner(System.in);
        char ch= sc.next().charAt(0);
        if(ch>='a'&& ch<='z')
        {
            System.out.println(ch+" is a lowercase");
        }
        else
        {
            System.out.println(ch+ " is a uppercase");
        }
    }
}
