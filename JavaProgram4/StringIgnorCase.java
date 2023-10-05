import java.util.Scanner;

public class StringIgnorCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String str1 = sc.nextLine();

       String check = (str.equalsIgnoreCase(str1)) ? "Yes" : "No";
        System.out.println(check);
    }
}
