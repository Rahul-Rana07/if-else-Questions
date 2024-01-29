import java.util.Scanner;

public class vowel {
    public static void main(String []args)
    {
        System.out.print("Enter a alphbet:");
        Scanner sc= new Scanner(System.in);
        String input= sc.nextLine();
        if(input.length() ==1) {
            char ch = input.charAt(0);
            if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
                ch = Character.toLowerCase(ch);
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    System.out.println("vowel");
                } else {
                    System.out.println("constans");
                }
            } else {
                System.out.println("error: input is not a letter");
            }
        }
        else
        {
            System.out.println("error : input is not a single char");
        }
    }
}
